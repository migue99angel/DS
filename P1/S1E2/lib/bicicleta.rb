module PrototipoRuby
  class Bicicleta
    
    @dorsal = nil
    attr_accessor :dorsal
    
    private
    def initialize(dorsal)
      @dorsal = dorsal
    end

    def clonar
      return self
    end

  end
end