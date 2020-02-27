require './carrera.rb'
require './bicicleta.rb'
require './factoria_montana.rb'
require './factoria_carretera.rb'

module PrototipoRuby
  class Cliente
    
    @@carreras = Array.new
    @bicicleta = nil
    
    def self.generar_numero_participantes
      @participantes = rand(10) + 10
      Carrera.setParticipantes(@participantes)
      puts "Inscritos un total de #{@participantes} participantes"
    end

    def self.main
      generar_numero_participantes()
      
      # Creamos la factoría, la bicicleta que vamos a clonar y la carrera
      @factoria = FactoriaMontana.new
      @bicicleta = @factoria.crearBicicleta(0)
      @@carreras << @factoria.crearCarrera(0)
      
      for i in 0..@participantes do
        # Clonamos la bicicleta, la añadimos al array de bicicletas de la carrera y actualizamos el dorsal
        bici = @bicicleta.clonar
        @@carreras[0].addBicicleta(bici)
        @@carreras[0].bicicletas[i].dorsal = i+1
      end
      
      # Creamos la factoría, la bicicleta que vamos a clonar y la carrera
      @factoria = FactoriaCarretera.new
      @bicicleta = @factoria.crearBicicleta(100)
      @@carreras << @factoria.crearCarrera(1)
      
      for j in 0..@participantes do
        # Clonamos la bicicleta, la añadimos al array de bicicletas de la carrera y actualizamos el dorsal
        bici = @bicicleta.clonar
        @@carreras[1].addBicicleta(bici)
        @@carreras[1].bicicletas[j].dorsal = j+1
      end
      
      # Retiramos de cada carrera las bicicletas correspondientes
      retirar_montana = @participantes*0.2
      retirar_montana = retirar_montana.round
      retirar_carretera = @participantes*0.1
      retirar_carretera = retirar_carretera.round
      
      # Ahora, para cada carrera, eliminamos los participantes de manera aleatoria
      for ii in 0..retirar_montana do
        azar = rand(@participantes-ii)
        @@carreras[0].bicicletas.delete_at(azar)
      end
      
      # Eliminamos los nil del array
      @@carreras[0].bicicletas.compact!
      
      puts "Retirados #{retirar_montana} participantes de la Carrera 0"
      
      for jj in 0..retirar_carretera do
        azar = rand(@participantes-jj)
        @@carreras[1].bicicletas.delete_at(azar)
      end
      
      # Eliminamos los nil del array
      @@carreras[1].bicicletas.compact!
      
      puts "Retirados #{retirar_carretera} participantes de la Carrera 1"
      
      # Cambiamos de manera aleatoria los participantes de cada carrera para obtener el resultado final
      @@carreras[0].bicicletas = @@carreras[0].bicicletas.shuffle
      @@carreras[1].bicicletas = @@carreras[1].bicicletas.shuffle
      
      # Imprimimos los resultados
      puts "Resultados de la Carrera 0"
      contador = 1
      for iii in @@carreras[0].bicicletas do
        puts "  Puesto #{contador}. Dorsal #{iii.dorsal}"
        contador = contador+1
      end
      
      puts "Resultados de la Carrera 1"
      contador = 1
      for jjj in @@carreras[1].bicicletas do
        puts "  Puesto #{contador}. Dorsal #{jjj.dorsal}"
        contador = contador+1
      end
    end
  end
  
  Cliente.main
  
end
