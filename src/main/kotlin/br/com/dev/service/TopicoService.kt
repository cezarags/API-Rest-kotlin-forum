package br.com.dev.service

import br.com.dev.model.Curso
import br.com.dev.model.Topico
import br.com.dev.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicoService (private var topicos: List<Topico>) {

    init {

            val topico = Topico(
                id = 1,
                "Erro spring",
                "Erro ao iniciar o projeto spring",
                curso = Curso(
                    id = 1,
                    nome = "Kotlin",
                    categoia = "Programação",
                ),
                autor = Usuario(
                    id = 1,
                    nome = "Ana da Silva",
                    email = "ana@gmail.com"

                )

            )

            val topico2 = Topico(
                id = 2,
                "Erro spring 2",
                "Erro ao iniciar o projeto spring 2",
                curso = Curso(
                    id = 2,
                    nome = "Kotlin2",
                    categoia = "Programação 2",
                ),
                autor = Usuario(
                    id = 2,
                    nome = "Ana da Silva 2",
                    email = "ana@gmail.com 2"

                )

            )

            topicos = Arrays.asList(topico, topico2)
        }

        fun listar(): List<Topico> {
            return topicos
    }

    fun buscarId(id: Long): Topico {
       return topicos.stream().filter({
               T -> T.id == id
       }).findFirst().get()
    }


}