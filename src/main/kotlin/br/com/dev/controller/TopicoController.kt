package br.com.dev.controller

import br.com.dev.model.Curso
import br.com.dev.model.Topico
import br.com.dev.model.Usuario
import br.com.dev.service.TopicoService
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Provider
import java.util.*

@RestController
@RequestMapping("/topicos")
class TopicoController(private val topicoService: TopicoService) {

    @GetMapping
    fun listar(): List<Topico>{
        return topicoService.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long):Topico{
        return topicoService.buscarId(id)
    }
}