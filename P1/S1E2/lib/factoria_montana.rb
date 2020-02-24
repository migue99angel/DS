module PrototipoRuby
  class FactoriaMontana
    include FactoriaCarreraYBicicleta
    
    def crearCarrera(id)
      return CarreraMontana.new(id)
    end
    
    def crearBicicleta(id)
      return BicicletaMontana.new(id)
    end
  end
end
