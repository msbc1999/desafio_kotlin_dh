fun main() {
    val dhm = DigitalHouseManager()

    // 5x ALUNOS
    dhm.registrarAluno("Aluno1", "Sobrenome1", 1)
    dhm.registrarAluno("Aluno2", "Sobrenome2", 2)
    dhm.registrarAluno("Aluno3", "Sobrenome3", 3)
    dhm.registrarAluno("Aluno4", "Sobrenome4", 4)
    dhm.registrarAluno("Aluno5", "Sobrenome5", 5)


    // 2x PROFESSOR TITULAR
    dhm.registrarProfessorTitular("Titular1", "Sobrenome6", 1, "FullStack")
    dhm.registrarProfessorTitular("Titular2", "Sobrenome7", 2, "Android")

    // 2x PROFESSOR ADJUNTO
    dhm.registrarProfessorAdjunto("Adjunto1", "Sobrenome8", 3, 12)
    dhm.registrarProfessorAdjunto("Adjunto2", "Sobrenome9", 4, 6)

    // REGISTRAR CURSOS
    dhm.registrarCurso("FullStack", 20001, 3)
    dhm.registrarCurso("Android", 20002, 2)

    // ALOCAR PROFESSORES AOS CURSOS
    dhm.alocarProfessores(20001, 1, 3)
    dhm.alocarProfessores(20002, 2, 4)

    // MATRICULAR 2x ALUNOS FULLSTACK
    dhm.matricularAluno(1, 20001)
    dhm.matricularAluno(2, 20001)

    // MATRICULAR 3x ALUNOS ANDROID
    dhm.matricularAluno(3, 20002)
    dhm.matricularAluno(4, 20002)
    dhm.matricularAluno(5, 20002)

    // CONSULTAR CURSO DOS ALUNOS
    dhm.consultarCursosDoAluno(1)
    dhm.consultarCursosDoAluno(2)
    dhm.consultarCursosDoAluno(3)
    dhm.consultarCursosDoAluno(4)
    dhm.consultarCursosDoAluno(5)
}