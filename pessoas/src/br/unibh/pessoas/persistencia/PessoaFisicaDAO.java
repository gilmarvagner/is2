package br.unibh.pessoas.persistencia;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import br.unibh.pessoas.entidades.PessoaFisica;

public class PessoaFisicaDAO implements DAO<PessoaFisica, Long>{

	@Override
	public PessoaFisica find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(PessoaFisica t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(PessoaFisica t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(PessoaFisica t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PessoaFisica> findAll() {
		// TODO Auto-generated method stub
		
		List<PessoaFisica> lista = new ArrayList<PessoaFisica>();
		try { 
			ResultSet res = JDBCUtil.getConnection().prepareStatement("select * from tb_pessoa_fisica").executeQuery();
			while (res.next()){
				lista.add(
							new PessoaFisica(
									res.getLong("id"), 
									res.getString("nome"),
									res.getString("endereco"),
									res.getString("telefone"), 
									res.getString("cpf"), 
									res.getString("email"), 
									res.getDate("dataNascimento"), 
									res.getString("sexo")
									)
						);
						
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			
		}
		
		return lista;
	}

	
	
	
}
