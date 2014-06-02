package model;



public class FichaDoAluno {
private String regiao;
private String local;
private String atividade;
private String professorResponsavel;
private String nomeDoAluno;
private String endereco;
private String numeroDaCasa;
private String complemento;
private String bairro;
private String cep;
private String telefone;
private String dataDeNascimento;
private String convenioMedico;
private String objetivoAtividadeFisisca;
private String indicacao;
private String problemasDeSaude;
private String intervencaoCirurgica;
private String avaliacaoCardiologica;
private String 	utilizacaoDeMedicamentos;
private String problemasCardiacosFamiliares;
private String problemasPosturais;
private String doresFrequentes;
private String faltaDeAr;
private String atividadeFisica;
private String nomeParaContatoDeEmergencia;
private String numeroParaContatoDeEmergencia;
private String observacao;
private byte saldoDevedor; // contator 0 para quitado, decrementa 1 caso ainda nao pago, e incrementa 1 caso tenha pago.
private  int faltasDoAluno;
private double mensalidade;

public FichaDoAluno(String regiao, String local, String atividade,
		String professorResponsavel, String nomeDoAluno, String endereco,
		String numeroDaCasa, String complemento, String bairro, String cep,
		String telefone, String dataDeNascimento, String convenioMedico,
		String objetivoAtividadeFisisca, String indicacao,
		String problemasDeSaude, String intervencaoCirurgica,
		String avaliacaoCardiologica, String utilizacaoDeMedicamentos,
		String problemasCardiacosFamiliares, String problemasPosturais,
		String doresFrequentes, String faltaDeAr, String atividadeFisica,
		String nomeParaContatoDeEmergencia,
		String numeroParaContatoDeEmergencia, String observacao,
		byte saldoDevedor, int faltasDoAluno, double mensalidade) {
	super();
	this.regiao = regiao;
	this.local = local;
	this.atividade = atividade;
	this.professorResponsavel = professorResponsavel;
	this.nomeDoAluno = nomeDoAluno;
	this.endereco = endereco;
	this.numeroDaCasa = numeroDaCasa;
	this.complemento = complemento;
	this.bairro = bairro;
	this.cep = cep;
	this.telefone = telefone;
	this.dataDeNascimento = dataDeNascimento;
	this.convenioMedico = convenioMedico;
	this.objetivoAtividadeFisisca = objetivoAtividadeFisisca;
	this.indicacao = indicacao;
	this.problemasDeSaude = problemasDeSaude;
	this.intervencaoCirurgica = intervencaoCirurgica;
	this.avaliacaoCardiologica = avaliacaoCardiologica;
	this.utilizacaoDeMedicamentos = utilizacaoDeMedicamentos;
	this.problemasCardiacosFamiliares = problemasCardiacosFamiliares;
	this.problemasPosturais = problemasPosturais;
	this.doresFrequentes = doresFrequentes;
	this.faltaDeAr = faltaDeAr;
	this.atividadeFisica = atividadeFisica;
	this.nomeParaContatoDeEmergencia = nomeParaContatoDeEmergencia;
	this.numeroParaContatoDeEmergencia = numeroParaContatoDeEmergencia;
	this.observacao = observacao;
	this.saldoDevedor = saldoDevedor;
	this.faltasDoAluno = faltasDoAluno;
	this.mensalidade = mensalidade;
}

public String getRegiao() {
	return regiao;
}

public void setRegiao(String regiao) {
	this.regiao = regiao;
}

public String getLocal() {
	return local;
}

public void setLocal(String local) {
	this.local = local;
}

public String getAtividade() {
	return atividade;
}

public void setAtividade(String atividade) {
	this.atividade = atividade;
}

public String getProfessorResponsavel() {
	return professorResponsavel;
}

public void setProfessorResponsavel(String professorResponsavel) {
	this.professorResponsavel = professorResponsavel;
}

public String getNomeDoAluno() {
	return nomeDoAluno;
}

public void setNomeDoAluno(String nomeDoAluno) {
	this.nomeDoAluno = nomeDoAluno;
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public String getNumeroDaCasa() {
	return numeroDaCasa;
}

public void setNumeroDaCasa(String numeroDaCasa) {
	this.numeroDaCasa = numeroDaCasa;
}

public String getComplemento() {
	return complemento;
}

public void setComplemento(String complemento) {
	this.complemento = complemento;
}

public String getBairro() {
	return bairro;
}

public void setBairro(String bairro) {
	this.bairro = bairro;
}

public String getCep() {
	return cep;
}

public void setCep(String cep) {
	this.cep = cep;
}

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public String getDataDeNascimento() {
	return dataDeNascimento;
}

public void setDataDeNascimento(String dataDeNascimento) {
	this.dataDeNascimento = dataDeNascimento;
}

public String getConvenioMedico() {
	return convenioMedico;
}

public void setConvenioMedico(String convenioMedico) {
	this.convenioMedico = convenioMedico;
}

public String getObjetivoAtividadeFisisca() {
	return objetivoAtividadeFisisca;
}

public void setObjetivoAtividadeFisisca(String objetivoAtividadeFisisca) {
	this.objetivoAtividadeFisisca = objetivoAtividadeFisisca;
}

public String getIndicacao() {
	return indicacao;
}

public void setIndicacao(String indicacao) {
	this.indicacao = indicacao;
}

public String getProblemasDeSaude() {
	return problemasDeSaude;
}

public void setProblemasDeSaude(String problemasDeSaude) {
	this.problemasDeSaude = problemasDeSaude;
}

public String getIntervencaoCirurgica() {
	return intervencaoCirurgica;
}

public void setIntervencaoCirurgica(String intervencaoCirurgica) {
	this.intervencaoCirurgica = intervencaoCirurgica;
}

public String getAvaliacaoCardiologica() {
	return avaliacaoCardiologica;
}

public void setAvaliacaoCardiologica(String avaliacaoCardiologica) {
	this.avaliacaoCardiologica = avaliacaoCardiologica;
}

public String getUtilizacaoDeMedicamentos() {
	return utilizacaoDeMedicamentos;
}

public void setUtilizacaoDeMedicamentos(String utilizacaoDeMedicamentos) {
	this.utilizacaoDeMedicamentos = utilizacaoDeMedicamentos;
}

public String getProblemasCardiacosFamiliares() {
	return problemasCardiacosFamiliares;
}

public void setProblemasCardiacosFamiliares(String problemasCardiacosFamiliares) {
	this.problemasCardiacosFamiliares = problemasCardiacosFamiliares;
}

public String getProblemasPosturais() {
	return problemasPosturais;
}

public void setProblemasPosturais(String problemasPosturais) {
	this.problemasPosturais = problemasPosturais;
}

public String getDoresFrequentes() {
	return doresFrequentes;
}

public void setDoresFrequentes(String doresFrequentes) {
	this.doresFrequentes = doresFrequentes;
}

public String getFaltaDeAr() {
	return faltaDeAr;
}

public void setFaltaDeAr(String faltaDeAr) {
	this.faltaDeAr = faltaDeAr;
}

public String getAtividadeFisica() {
	return atividadeFisica;
}

public void setAtividadeFisica(String atividadeFisica) {
	this.atividadeFisica = atividadeFisica;
}

public String getNomeParaContatoDeEmergencia() {
	return nomeParaContatoDeEmergencia;
}

public void setNomeParaContatoDeEmergencia(String nomeParaContatoDeEmergencia) {
	this.nomeParaContatoDeEmergencia = nomeParaContatoDeEmergencia;
}

public String getNumeroParaContatoDeEmergencia() {
	return numeroParaContatoDeEmergencia;
}

public void setNumeroParaContatoDeEmergencia(
		String numeroParaContatoDeEmergencia) {
	this.numeroParaContatoDeEmergencia = numeroParaContatoDeEmergencia;
}

public String getObservacao() {
	return observacao;
}

public void setObservacao(String observacao) {
	this.observacao = observacao;
}

public byte getSaldoDevedor() {
	return saldoDevedor;
}

public void setSaldoDevedor(byte saldoDevedor) {
	this.saldoDevedor = saldoDevedor;
}

public int getFaltasDoAluno() {
	return faltasDoAluno;
}

public void setFaltasDoAluno(int faltasDoAluno) {
	this.faltasDoAluno = faltasDoAluno;
}

public double getMensalidade() {
	return mensalidade;
}

public void setMensalidade(double mensalidade) {
	this.mensalidade = mensalidade;
}


	
}
