package controller;

import java.awt.JobAttributes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;


public class BancoDeDados {

	private Connection connection=null;
	private Statement statement = null;
	private ResultSet resultsetAluno = null;
	public void conectar(){
		String servidor = "jdbc:mysql://localhost:3306/oficinadomovimento";
		String usuario = "root";
		String senha="";
		String driver="com.mysql.jdbc.Driver";

		try{
			Class.forName(driver);
			this.connection =  DriverManager.getConnection(servidor, usuario, senha);
			this.statement =  this.connection.createStatement();



		} catch (Exception e){
			JOptionPane.showMessageDialog(null,"Ops! Ocorreu um erro : "+e.getMessage());
		}

	}
	public boolean estaConectado(){
		if(this.connection!=null){
			return true;
		}else
			return false;
	}
	public void listarAlunos(){
		try{
			String query = "SELECT * FROM aluno ORDER by id ";
			this.resultsetAluno = this.statement.executeQuery(query);
			//this.statement = this.connection.createStatement();
			//Tratamento.listAluno.clear(); // limpando lista
		/*	while(this.resultsetAluno.next()){
				Aluno aluno = new Aluno(this.resultsetAluno.getString("nome"),this.resultsetAluno.getString("matricula"));
				aluno.cadastraNotas(this.resultsetAluno.getDouble("nota1"),this.resultsetAluno.getDouble("nota2"),this.resultsetAluno.getDouble("nota3"));
				Tratamento.listInsereAluno(aluno);	
			}*/
		}catch (Exception e){
			JOptionPane.showMessageDialog(null,"Ops! Ocorreu um erro : "+e.getMessage());
		}
	}

	public void InserirAluno(String nome, String matricula, double nota1,double nota2, double nota3 ){
		try{
			String query = "INSERT INTO aluno (nome,matricula,nota1,nota2,nota3) values ('"+nome+"','"+matricula+"','"+nota1+"','"+nota2+"','"+nota3+"');";
			this.statement.executeUpdate(query);
			this.listarAlunos();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"Ops! Ocorreu um erro : "+e.getMessage());
		}
	}
	public void editarAluno( String nomeAntigo,String nome, String matricula, double nota1,double nota2, double nota3){
		try{
			String query="UPDATE aluno SET nome='"+nome+"', matricula='"+matricula+"', nota1='"+nota1+"', nota2='"+nota2+"',nota3='"+nota3+"' WHERE nome='"+nomeAntigo+"';";
			this.statement.executeUpdate(query);
			this.listarAlunos();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"Ops! Ocorreu um erro : "+e.getMessage());
		}
	}
	public void ExcluirAluno(String nome){
		try{
			String query="DELETE FROM aluno WHERE nome='"+nome+"';";
			this.statement.executeUpdate(query);
			this.listarAlunos();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"Ops! Ocorreu um erro : "+e.getMessage());		}
	}
	public void ExcluirTudo(){
		try{
		String query="DELETE FROM aluno;";
		this.statement.executeUpdate(query);
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Ops!Ocorreu um erro: "+e.getMessage());
		}
	}
}
