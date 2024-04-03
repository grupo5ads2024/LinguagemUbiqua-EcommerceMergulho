package models;

public enum EnumPagamento {
    PIX(1),
    CREDITO(2),
    BOLETO(3);

    private final int codigo;

    EnumPagamento(int codigo) {
        this.codigo = codigo;
      }
    
      public int getCodigo() {
        return codigo;
      }
    
      public static EnumPagamento getByCodigo(int codigo) {
        for (EnumPagamento pagamento : values()) {
          if (pagamento.codigo == codigo) {
            return pagamento;
          }
        }
        throw new IllegalArgumentException("Forma de pagemeto invalido: " + codigo);
      }
}