module PrototipoRuby
  class Carrera

    @@participantes = 0
    
    attr_accessor :bicicletas
    
    def self.setParticipantes(participantes)
      @@participantes = participantes
    end
    
    def self.getParticipantes
      @@participantes
    end
      
    private
    def initialize(id)
      @id = id
      @bicicletas = Array.new
    end

    def clonar
      return Carrera.new(@id)
    end

    def addBicicleta(bicicleta)
      @bicicletas << bicicleta
    end
  end
end