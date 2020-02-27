module PrototipoRuby
  class Bicicleta
    
    @dorsal = nil
    attr_accessor :dorsal
    
    private
    def initialize(dorsal)
      @dorsal = dorsal
    end

    def clonar
      return Bicicleta.new(@dorsal)
    end

  end
end