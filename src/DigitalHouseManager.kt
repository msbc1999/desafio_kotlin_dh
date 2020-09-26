import java.lang.IllegalArgumentException

class DigitalHouseManager {
    val alunos = mutableListOf<Aluno>()
    val professores = mutableListOf<Professor>()
    val cursos = mutableListOf<Curso>()
    val matriculas = mutableListOf<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int, maxAlunos: Int) = cursos.add(Curso(nome, codigoCurso, maxAlunos))

    fun excluirCurso(codigoCurso: Int) = cursos.removeIf { it.codigoCurso == codigoCurso }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, qtHoras: Int) = professores.add(ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, qtHoras))

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) = professores.add(ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade))

    fun excluirProfessor(codigoProfessor: Int) = professores.removeIf { it.codigoProfessor == codigoProfessor }

    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int) = alunos.add(Aluno(nome, sobrenome, codigoAluno))

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        val curso = cursos.firstOrNull { it.codigoCurso == codigoCurso }
        val aluno = alunos.firstOrNull { it.codigoAluno == codigoAluno }

        if (curso == null) {
            println("Curso não cadastrado")
            return
        }
        if (aluno == null) {
            println("Aluno não cadastrado")
            return
        }

        if (curso.adicionarAluno(aluno)) {
            matriculas.add(Matricula(aluno, curso))
            println("A matricula foi realizada.")
        } else {
            println("Não foi possível realizar a matrícula porque não há vagas.")
        }

    }


    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        val professorTitular = professores.firstOrNull { it.codigoProfessor == codigoProfessorTitular && it is ProfessorTitular }
        val professorAdjunto = professores.firstOrNull { it.codigoProfessor == codigoProfessorAdjunto && it is ProfessorAdjunto }
        val curso = cursos.firstOrNull { it.codigoCurso == codigoCurso }

        if (professorTitular == null) {
            println("Professor titular não cadastrado")
            return
        }
        if (professorAdjunto == null) {
            println("Professor adjunto não cadastrado")
            return
        }
        if (curso == null) {
            println("Curso não cadastrado")
            return
        }

        curso.professorTitular = professorTitular as ProfessorTitular
        curso.professorAdjunto = professorAdjunto as ProfessorAdjunto
        println("Professores alocados com sucesso!")
    }

}