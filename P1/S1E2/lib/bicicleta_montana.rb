module PrototipoRuby
  class BicicletaMontana < Bicicleta
    
    public
    def initialize(dorsal)
      super(dorsal)
      @dorsal = dorsal
    end

    def clonar
      return self
    end

    attr_accessor :dorsal
  end
end