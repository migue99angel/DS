module Prototype
  class Bicicleta

    private
    def initialize(id)
      @id = id
    end

    def clonar
      return self
    end

    attr_accessor :id
  end
end