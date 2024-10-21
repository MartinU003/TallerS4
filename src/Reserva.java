public class Reserva {
        private String nombreCliente;
        private int numeroDias;
        private String tipoHabitacion;
        private boolean estadoConfirmada;

        public Reserva(String nombreCliente, int numeroDias, String tipoHabitacion) {
            this.nombreCliente = nombreCliente;
            this.numeroDias = numeroDias;
            this.tipoHabitacion = tipoHabitacion;
            this.estadoConfirmada = true;
        }

        public String getNombreCliente() {
            return nombreCliente;
        }

        public int getNumeroDias() {
            return numeroDias;
        }

        public String getTipoHabitacion() {
            return tipoHabitacion;
        }

        public boolean isEstadoConfirmada() {
            return estadoConfirmada;
        }

        public void cambiarEstado() {
            this.estadoConfirmada = !this.estadoConfirmada;
        }

        public void setNombreCliente(String nombreCliente) {
            this.nombreCliente = nombreCliente;
        }

        public void setNumeroDias(int numeroDias) {
            this.numeroDias = numeroDias;
        }

        public void setTipoHabitacion(String tipoHabitacion) {
            this.tipoHabitacion = tipoHabitacion;
        }
        public void mostrarInformacion() {
            String estado = estadoConfirmada ? "Confirmada" : "Cancelada";
            System.out.println("Nombre del Cliente: " + nombreCliente);
            System.out.println("Número de Días: " + numeroDias);
            System.out.println("Tipo de Habitación: " + tipoHabitacion);
            System.out.println("Estado de la Reserva: " + estado);
        }

    }



