package utils;

import javax.swing.JOptionPane;

public class menus {

    /**
     * funcion menu
     * @param mensaje
     * @param titulo
     * @param tipo
     * @return 
     */
	public static int menu(String mensaje, String titulo, String[] tipo) {
		int opcion = 0;
		opcion = JOptionPane.showOptionDialog(null, mensaje, titulo, 0, JOptionPane.QUESTION_MESSAGE, null, tipo,
				tipo[0]);
		return opcion;

	}

	/**
         * funcion menu combobox
         * @param opciones
         * @param titulo
         * @param mensaje
         * @return 
         */
	public static String combobox(String[] opciones, String titulo, String mensaje) {
		String cadena = "";
		Object seleccion = JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE, null,
				opciones, 0);
		try {
			cadena = seleccion.toString();
		} catch (Exception e) {
			cadena = "null";
		}
		return cadena;
	}

	/**
         * funcion pedir boolean
         * @param mensaje
         * @param titulo
         * @param position
         * @param position2
         * @return 
         */
	public static boolean menuS_N(String mensaje, String titulo, String position, String position2) {
		int option = 0;
		boolean option2 = false;

		String[] tipo = { position, position2 };
		option = menus.menu(mensaje, titulo, tipo);

		if (option == 0) {
			option2 = true;
		} else {
			option2 = false;
		}
		return option2;
	}

	/**
         * funcion para pedir el karma
         * @param mensaje
         * @param titulo
         * @return 
         */
	public static String menuString(String mensaje, String titulo) {
		String karma = "";
		int option = 0;
		String[] tipo = { "Low", "Medium", "High" };
		option = menus.menu(mensaje, titulo, tipo);

		if (option == 0) {
			karma = "Low";
		} else if (option == 1) {
			karma = "Medium";
		} else if (option == 2) {
			karma = "High";
		}
		return karma;
	}

}
