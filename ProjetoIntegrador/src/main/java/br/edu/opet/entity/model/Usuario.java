package br.edu.opet.entity.model;

import java.util.ArrayList;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.validation.constraints.Size;

import br.edu.opet.model.entity.dao.UsuarioDAO;
import br.edu.opet.util.DataUtil;

@ManagedBean
@SessionScoped
public class Usuario extends UsuarioDAO{
	
	private int Idf_Usuario;
	private String Num_CPF;
	
	@Size(max=100)
	private String Nme_Pessoa;
	private int Idf_Sexo;
	private String Desc_Sexo;
	private int Idf_Cidade;
	private Date Dta_Nascimento = new Date();
	private String Dta_NascimentoStr;
	private Endereco Endereco = new Endereco();
	private int Idf_Endereco;
	private String Num_DDD_Celular;
	private String Num_Celular;
	private String Eml_Pessoa;
	private Date Dta_Cadastro;
	private int Idf_Estado_Civil;
	private int Flg_Inativo;
	private int Idf_Tipo_Usuario;
	private String Senha;
	
	public Usuario() {};
	
	public Usuario(String Num_CPF, String Nme_Pessoa, int Idf_Sexo, int Idf_Cidade, Date Dta_Nascimento,int Idf_Endereco, 
			String Num_DDD_Celular,String Num_Celular,String Eml_Pessoa, Date Dta_Cadastro, int Idf_Estado_Civil) {
		
		this.Num_CPF = Num_CPF;
		this.Nme_Pessoa = Nme_Pessoa;
		this.Idf_Sexo = Idf_Sexo;
		this.Idf_Cidade = Idf_Cidade;
		this.Dta_Nascimento = Dta_Nascimento;
		this.Idf_Endereco = Idf_Endereco;
		this.Num_DDD_Celular = Num_DDD_Celular;
		this.Num_Celular = Num_Celular;
		this.Eml_Pessoa = Eml_Pessoa;
		this.Dta_Cadastro = Dta_Cadastro;
		this.Idf_Estado_Civil = Idf_Estado_Civil;
		this.Idf_Cidade = Idf_Cidade;
	}

	public int getIdf_Usuario() {
		return Idf_Usuario;
	}

	public void setIdf_Usuario(int idf_Usuario) {
		Idf_Usuario = idf_Usuario;
	}

	public String getNum_CPF() {
		return Num_CPF;
	}

	public void setNum_CPF(String num_CPF) {
		Num_CPF = num_CPF;
	}

	public String getNme_Pessoa() {
		return Nme_Pessoa;
	}

	public void setNme_Pessoa(String nme_Pessoa) {
		Nme_Pessoa = nme_Pessoa;
	}

	public int getIdf_Sexo() {
		return Idf_Sexo;
	}

	public void setIdf_Sexo(int idf_Sexo) {
		Idf_Sexo = idf_Sexo;
	}

	public int getIdf_Cidade() {
		return Idf_Cidade;
	}

	public void setIdf_Cidade(int idf_Cidade) {
		Idf_Cidade = idf_Cidade;
	}
	
	//N�o mexer aqui pq est� funcionando com o poder da gambiarra + m�gica
	public String getDta_NascimentoStr() {
		return Dta_NascimentoStr;
	}
	public void setDta_NascimentoStr(String dta_NascimentoStr) {
		Dta_NascimentoStr = dta_NascimentoStr;
	}
	public Date getDta_NascimentoDate() {
		return DataUtil.strToDate2(Dta_NascimentoStr);
	}
	public void setDta_NascimentoDate(Date dta_Nascimento) {
		Dta_Nascimento = DataUtil.strToDate2(Dta_NascimentoStr);
	}
	public Date getDta_NascimentoDateSq() {
		return Dta_Nascimento;
	}
	public void setDta_NascimentoDateSq(Date dta_Nascimento) {
		Dta_Nascimento = dta_Nascimento;
	}
	//
	
	public Endereco getEndereco() {
		return Endereco;
	}

	public void setEndereco(Endereco endereco) {
		Endereco = endereco;
	}
	
	public int getIdf_Endereco() {
		return Idf_Endereco;
	}

	public void setIdf_Endereco(int idf_Endereco) {
		Idf_Endereco = idf_Endereco;
	}

	public void setIdfEndereco(Endereco endereco) {
		Idf_Endereco = endereco.getIdf_Endereco();
	}
	
	public String getNum_DDD_Celular() {
		return Num_DDD_Celular;
	}

	public void setNum_DDD_Celular(String num_DDD_Celular) {
		Num_DDD_Celular = num_DDD_Celular;
	}

	public String getNum_Celular() {
		return Num_Celular;
	}

	public void setNum_Celular(String num_Celular) {
		Num_Celular = num_Celular;
	}

	public String getEml_Pessoa() {
		return Eml_Pessoa;
	}

	public void setEml_Pessoa(String eml_Pessoa) {
		Eml_Pessoa = eml_Pessoa;
	}

	public void setDta_Cadastro(String dta_Cadastro) {
		Dta_Cadastro = DataUtil.strToDate(dta_Cadastro);
	}

	public String getDta_Cadastro() {
		return DataUtil.dateToStr(Dta_Cadastro);
	}
	
	public Date getDta_CadastroDate() {
		return Dta_Cadastro;
	}

	public void setDta_CadastroDate(Date dta_Cadastro) {
		Dta_Cadastro = dta_Cadastro;
	}

	public int getIdf_Estado_Civil() {
		return Idf_Estado_Civil;
	}

	public void setIdf_Estado_Civil(int idf_Estado_Civil) {
		Idf_Estado_Civil = idf_Estado_Civil;
	}

	public int getFlg_Inativo() {
		return Flg_Inativo;
	}

	public void setFlg_Inativo(int flg_Inativo) {
		Flg_Inativo = flg_Inativo;
	}

	public int getIdf_Tipo_Usuario() {
		return Idf_Tipo_Usuario;
	}

	public void setIdf_Tipo_Usuario(int idf_Tipo_Usuario) {
		Idf_Tipo_Usuario = idf_Tipo_Usuario;
	}
	
	public String getSenha() {
		return Senha;
	}
	
	public void setSenha(String senha) {
		Senha = senha;
	}
	
	public String getDesc_Sexo() {
		return Desc_Sexo;
	}
	
	public void setDesc_Sexo(String desc_Sexo) {
		Desc_Sexo = desc_Sexo;
	}

	public boolean inserirUsuarios() {
		return super.inserirUsuarios(this);
	}
	
	public ArrayList<Usuario> listarUsuarios() {
		return super.listarUsuarios();
	}
	
	public boolean atualizarUsuario() {
		return super.atualizarUsuario(this);
	}
	public boolean deletarUsuario() {
		return super.deletarUsuario(this);
	}	
	public Usuario buscarUsuario(Usuario user) {
		return super.buscarUsuario(user);
	}
	public boolean existeCPF(String CPF) {
		return super.existeCPF(CPF);
	}

}
