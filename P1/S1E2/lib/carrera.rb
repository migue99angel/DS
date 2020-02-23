module PrototipoRuby
  class Carrera
    include Prototype
    
    private
    def initialize(bicicletas)
      @bicicletas = bicicletas
    end

    def clonar
      return self
    end

    def addBicicleta(bicicleta)
      @bicicletas.add(bicicleta)
    end

    attr_accessor :bicicletas
  end
end