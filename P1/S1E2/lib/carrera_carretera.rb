module PrototipoRuby
  class CarreraCarretera < Carrera

    public
    def initialize(id)
      super(id)
      @bicicletas = Array.new
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