module PrototipoRuby
  class BicicletaCarretera < Bicicleta

    public
    def initialize(dorsal)
      super(dorsal)
      @dorsal = dorsal
    end

    def clonar
      return BicicletaCarretera.new(@dorsal)
    end

    attr_accessor :dorsal
  end
end