module PrototipoRuby
  class CarreraMontana < Carrera

    public
    def initialize(bicicletas)
      super()
      @bicicletas = bicicletas
    end

    def clonar
      return self
    end

    def addBicicleta(bicicleta)
      @bicicletas << bicicleta
    end

    attr_accessor :bicicletas
  end
end