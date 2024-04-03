package models;

public enum EnumPeriodoMergulho {
  DIURNO(1),
  NOTURNO(2);

  private final int codigo;

  EnumPeriodoMergulho(int codigo) {
    this.codigo = codigo;
  }

  public int getCodigo() {
    return codigo;
  }

  public static EnumPeriodoMergulho getByCodigo(int codigo) {
    for (EnumPeriodoMergulho periodo : values()) {
      if (periodo.codigo == codigo) {
        return periodo;
      }
    }
    throw new IllegalArgumentException("Codigo de periodo invalido: " + codigo);
  }
}
