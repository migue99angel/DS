module PrototipoRuby
  class BicicletaMontana < Bicicleta
    def initialize(id)
      super(id)
      @id = id
    end

    def clonar
      return self
    end

    attr_accessor :id
  end
end