class Curso(var nome: String, var codigoCurso: Int, var professorTitular: ProfessorTitular, var professorAdjunto: ProfessorAdjunto, var maxAlunos: Int) {

    val alunosMatriculados = mutableListOf<Aluno>()

    override fun equals(other: Any?): Boolean = if (other is Curso) other.codigoCurso == codigoCurso else false

}