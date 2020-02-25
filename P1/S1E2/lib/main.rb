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
      
      @factoria = FactoriaMontana.new
      @bicicleta = @factoria.crearBicicleta(0)
      @@carreras << @factoria.crearCarrera(0)
      
      for i in 0..@participantes do
        bici = @bicicleta.clonar
        @@carreras[0].addBicicleta(bici)
        @@carreras[0].bicicletas.dorsal = i+1
      end
    end
  end
  
  Cliente.main
  
end
