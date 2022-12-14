package com.ikasgela;

public class Carrera {
    private static Carrera INSTANCE = null;

    private int indiceMarca = 0;

    //Metodos de construccion.
    private Carrera() {
    }

    private synchronized static void createInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Carrera();
        }
    }

    public static Carrera getInstance() {
        if (INSTANCE == null) createInstance();
        return INSTANCE;
    }

    //Asociaciones
    private Marca[] marcas = new Marca[10000];

    //Metodos

    public void registrarMarca(int dorsal, String nombre, double marca) {

        Participante p_actual = new Participante(nombre, dorsal);
        Marca m_actual = new Marca(marca);

        p_actual.setMarca(m_actual);
        m_actual.setCarrera(INSTANCE);
        m_actual.setParticipante(p_actual);
        INSTANCE.getMarcas()[indiceMarca] = m_actual;
        indiceMarca++;
    }

    public void verClasificacion() {
        System.out.println("--- Clasificación --------------");
        for (int i = 0; i < marcas.length; i++) {
            if (marcas[i] != null) {
                System.out.println(marcas[i].getParticipante().toString());
            }
        }
        System.out.println("--------------------------------");

    }
    //Getter y setter asociaciones


    public Marca[] getMarcas() {
        return marcas;
    }

    public void setMarcas(Marca[] marcas) {
        this.marcas = marcas;
    }
}
