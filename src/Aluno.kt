class Aluno(var nome: String, var sobrenome: String, var codigoAluno: Int) {

    override fun equals(other: Any?): Boolean = if (other is Aluno) other.codigoAluno == codigoAluno else false

}