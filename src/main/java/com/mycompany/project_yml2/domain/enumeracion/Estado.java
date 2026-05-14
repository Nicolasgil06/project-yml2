package com.mycompany.project_yml2.domain.enumeracion;

public enum Estado {
    ACTIVO("Activo"),
    INACTIVO("Inactivo");

    private final String valor;

    Estado(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}

