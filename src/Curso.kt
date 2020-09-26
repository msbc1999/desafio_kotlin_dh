class Curso(var nome: String, var codigoCurso: Int) {

    override fun equals(other: Any?): Boolean = if (other is Curso) other.codigoCurso == codigoCurso else false

}