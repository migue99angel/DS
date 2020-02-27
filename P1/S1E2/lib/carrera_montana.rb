module PrototipoRuby
  class CarreraMontana < Carrera

    public
    def initialize(id)
      super(id)
      @bicicletas = Array.new
    end

    def clonar
      return CarreraMontana.new(@id)
    end

    def addBicicleta(bicicleta)
      @bicicletas << bicicleta
    end

    attr_accessor :bicicletas
  end
end