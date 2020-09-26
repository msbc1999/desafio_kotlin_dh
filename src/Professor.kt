class Professor(var nome: String, var sobrenome: String, var tempoCasa: Int, var codigoProfessor: Int) {
    override fun equals(other: Any?): Boolean = if (other is Professor) other.codigoProfessor == codigoProfessor else false
}