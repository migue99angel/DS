module PrototipoRuby
  class CarreraCarretera < Carrera

    public
    def initialize(id)
      super(id)
      @bicicletas = Array.new
    end

    def clonar
      return CarreraCarretera.new(@id)
    end

    def addBicicleta(bicicleta)
      @bicicletas << bicicleta
    end

    attr_accessor :bicicletas
  end
end