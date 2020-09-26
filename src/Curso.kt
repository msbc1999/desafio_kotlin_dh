class Curso(var nome: String, var codigoCurso: Int, var maxAlunos: Int) {

    var professorTitular: ProfessorTitular? = null
    var professorAdjunto: ProfessorAdjunto? = null

    val alunosMatriculados = mutableListOf<Aluno>()

    fun adicionarAluno(aluno: Aluno): Boolean {
        if (alunosMatriculados.size >= maxAlunos) return false
        alunosMatriculados.add(aluno)
        return true
    }

    fun excluirAluno(aluno: Aluno) = alunosMatriculados.removeIf { it.equals(aluno) }

    override fun equals(other: Any?): Boolean = if (other is Curso) other.codigoCurso == codigoCurso else false

}