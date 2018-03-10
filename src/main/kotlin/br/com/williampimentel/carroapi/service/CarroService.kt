package br.com.williampimentel.carroapi.service

import br.com.williampimentel.carroapi.entity.Carro
import br.com.williampimentel.carroapi.repository.CarroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CarroService {

    @Autowired
    lateinit var carroRepository: CarroRepository

    fun buscarCarroPorNome(marca: String) : List<Carro> {
        return carroRepository.findByMarcaContaining(marca)
    }

    fun bucarCarroPorAno(ano: Int) : List<Carro> {
        return carroRepository.findByAno(ano)
    }

    fun buscarCarroPorPlaca(placa: String) : Carro {
        return carroRepository.findByPlaca(placa)
    }

    fun salvar(carro: Carro) {
        carroRepository.save(carro)
    }

    fun buscarTodosCarros() : List<Carro> {
        return carroRepository.findAll()
    }
}