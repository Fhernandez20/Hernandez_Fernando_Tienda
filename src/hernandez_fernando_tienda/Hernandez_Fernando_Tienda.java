/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hernandez_fernando_tienda;

import java.util.Scanner;

public class Hernandez_Fernando_Tienda {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        //CREACION DE VARIABLES//
        //Abrir y cerrar Caja//
        int cerrarCaja = 0;
        int abrirCajaInicial = 0;
        double depositoCajaCierre = 0;
        double dineroBanco = 0;

        //Menu//
        int opcion = 0;
        int opcionCaja = 0;

        //Variable Caja//
        double dinerocaja = 0.00, dineroEx;

        //Variables Kg//
        int KgAzucar = 0, KgAvena = 0, KgTrigo = 0, KgMaiz = 0;

        //Variables Total//
        double KgTotalAzu = 0, KgTotalAve = 0, KgTotalTri = 0, KgTotalMaiz = 0;
        double totalAzucar = 0, totalAvena = 0, totalTrigo = 0, totalMaiz = 0;

        //variables Ventas//
        String tipoCliente = "";
        int stockazucar = 0, stockavena = 0, stocktrigo = 0, stockmaiz = 0;
        String seguirComprando = "SI";
        double totalFactura = 0;
        int precioClienteAzucar = 0, precioClienteAvena = 0, precioClienteTrigo = 0, precioClienteMaiz = 0;
        int tipoCodigo = 0;
        double descuento5 = 0, descuento10 = 0;
        double ISV = 0;

        //Variables proveedor//
        String tipoprov;
        int codigoA = 0, codigoB = 0, codigoC = 0;
        int precioAzucar = 0, precioAvena = 0, precioTrigo = 0, precioMaiz = 0;
        String confirmacion;

        //Reportes//
        int ventasDia = 0;
        int comprasDia = 0;
        double promedioVentas = 0;
        double promedioCompras = 0;
        double sumaFacturasVentas = 0, sumaFacturasCompras = 0;
        double margenGanancia = 0;
        double ventaMayorGanancia = 0, compraMayorGasto = 0;
        String productoEstrella = "";
        double KgProductoEstrella = 0;
        int rankMaiz = 1;
        int rankAvena = 1;
        int rankAzucar = 1;
        int rankTrigo = 1;
        double rankingMaiz = 0, rankingAvena = 0, rankingTrigo = 0, rankingAzucar = 0;

        //---------------------------PROGRAMA---------------------------------//
        //ABRIR/CERRAR CAJA//
        while (true) {
            ventasDia = 0;
            comprasDia = 0;
            promedioVentas = 0;
            promedioCompras = 0;
            sumaFacturasVentas = 0;
            sumaFacturasCompras = 0;
            margenGanancia = 0;
            ventaMayorGanancia = 0;
            compraMayorGasto = 0;
            productoEstrella = "";
            KgProductoEstrella = 0;
            ventasDia = 0;
            comprasDia = 0;
            rankingMaiz = 0;
            rankingAvena = 0;
            rankingTrigo = 0;
            rankingAzucar = 0;
            System.out.println("-------Bienvenido-------");
            System.out.println("");
            System.out.println("1-Abrir caja");
            System.out.println("2-Salir del Sistema ");
            System.out.println("");
            System.out.println("------------------------");

            opcionCaja = lea.nextInt();

            //OPCIONES DE CAJA//
            if (opcionCaja == 1) {
                if (abrirCajaInicial == 0) {
                    System.out.println("Ingrese la cantidad de dinero que quiere ingresar a la caja: ");
                    dineroEx = lea.nextInt();
                    if (dineroEx > 0) {
                        dinerocaja = dinerocaja + dineroEx;

                        System.out.println("--------CAJA---------"
                                + "\n Tu balance es: " + String.format("%.2f", dinerocaja)
                                + "\n---------------------");
                        cerrarCaja = 1;
                        abrirCajaInicial = 1;
                    } else {
                        System.out.println("Favor ingrese una cantidad valida de Dinero!!");
                    }
                } else {
                    cerrarCaja = 1;
                }

            } else if (opcionCaja == 2) {
                System.out.println("Que tenga un buen dia!! :D");
                break;
            } else {
                System.out.println("Ingrese una opcion valida!!");
            }

            //---------------------MENU PRINCIPAL------------------------//
            while (cerrarCaja == 1) {
                System.out.println("");
                System.out.println("--------MENU---------");
                System.out.println("");
                System.out.println("1- Caja");
                System.out.println("2- Ventas");
                System.out.println("3- Compras");
                System.out.println("4- Reportes");
                System.out.println("5- Cierre de Caja");
                System.out.println("6- Salir del Sistema");
                System.out.println("");
                System.out.println("---------------------");

                opcion = lea.nextInt();

                //DEPENDIENDO LA OPCION VA A LA PARTE DEL MENU DESEADA//
                //--------------------------CAJA---------------------------//
                if (opcion == 1) {
                    System.out.println("ingrese la cantidad de dinero que quiere igresar a la caja: ");
                    dineroEx = lea.nextInt();
                    if (dineroEx > 0) {
                        dinerocaja = dinerocaja + dineroEx;

                        System.out.println("------CAJA-------"
                                + "\n Tu balance es: " + String.format("%.2f", dinerocaja)
                                + "\n----------------");
                    } else {
                        System.out.println("Favor ingrese una cantidad valida de Dinero!!");
                    }

                    //-------------------------VENTAS-------------------------//
                } else if (opcion == 2) {
                    if (stockazucar > 0 || stockavena > 0 || stocktrigo > 0 || stockmaiz > 0) {
                        KgTotalAzu = 0;
                        KgTotalMaiz = 0;
                        KgTotalAve = 0;
                        KgTotalTri = 0;

                        System.out.println("------------------------------------------------------");
                        System.out.println("");
                        System.out.println("APROVECHA DE NUESTRA PROMOCION DE MITAD DEL TRIMESTRE Q3!!");
                        System.out.println("");
                        System.out.println("Si el subtotal es mayor o igual que 1000 lps   \n"
                                + "Descuento: 5% sobre el subtotal.   \n"
                                + "Si el subtotal es mayor que 5000 lps   \n"
                                + "Descuento: 10% sobre el subtotal");
                        System.out.println("");
                        System.out.println("------------------------------------------------------");
                        //TIPO DE CLIENTE//
                        System.out.println("A que tipo de cliente le vas a vender? (A/B/C) ");
                        tipoCliente = lea.next().toUpperCase();
                        seguirComprando = "SI";

                        //SE DIRIGE AL CLIENTE ELEJIDO POR EL USUARIO//
                        //CLIENTE A//
                        if (tipoCliente.equals("A")) {

                            //PASA A FACTURACION SI COMPRAR = NO//
                            while (seguirComprando.equals("SI")) {
                                System.out.println("");
                                System.out.println("ingrese el codigo del producto que quieres vender: ");
                                System.out.println("\n"
                                        + "                                 ----PRODUCTOS CLIENTE A----"
                                        + "\n    |     Azucar     |" + " |       Avena      | " + " |       Trigo      | " + " |      Maiz      |"
                                        + "\n    |----CODIGO 1----|" + " |-----CODIGO 2-----| " + " |-----CODIGO 3-----| " + " |----CODIGO 4----|"
                                        + "\n    |-----PRECIO-----|" + " |------PRECIO------| " + " |------PRECIO------| " + " |-----PRECIO-----|"
                                        + "\n    |       30       |" + " |        25        | " + " |        32        | " + " |       20       |"
                                        + "\n    |---INVENTARIO---|" + " |----INVENTARIO----| " + " |----INVENTARIO----| " + " |---INVENTARIO---|"
                                        + "\n           " + stockazucar + "       " + "           " + stockavena + "         " + "            " + stocktrigo + " " + "                   " + stockmaiz + "");

                                System.out.println("");
                                tipoCodigo = lea.nextInt();
                                if (tipoCodigo == 1) {
                                    if (stockazucar == 0) {
                                        System.out.println("NO TENEMOS MAS DE ESE PRODUCTO!!");
                                    } else {
                                        //VENTA AZUCAR//
                                        System.out.println("Ingrese la cantidad de Kg que desea: ");
                                        KgAzucar = lea.nextInt();
                                        if (KgAzucar > 0) {

                                            System.out.println("-----INVENTARIO-----"
                                                    + "\n Cantidad disponible de azucar: " + stockazucar
                                                    + "\n Cantidad deseada por el cliente: " + KgAzucar
                                                    + "\n--------------------");
                                            System.out.println("");
                                            if (stockazucar >= KgAzucar) {
                                                stockazucar = stockazucar - KgAzucar;
                                                KgTotalAzu = KgTotalAzu + KgAzucar;
                                                precioClienteAzucar = KgAzucar * 30;
                                                totalFactura = totalFactura + precioClienteAzucar;
                                                totalAzucar += precioClienteAzucar;
                                                System.out.println(KgAzucar + " Kg de azucar agregados existosamente al carrito!!");
                                                System.out.println("Quieres seguir comprando? (Si/No)");
                                                seguirComprando = lea.next().toUpperCase();

                                            } else {
                                                System.out.println("No puedes comprar esa cantidad de azucar!!");
                                                System.out.println("Quieres seguir comprando? (Si/No)");
                                                seguirComprando = lea.next().toUpperCase();
                                            }

                                        } else {
                                            System.out.println("Ingrese un valor real!!");
                                        }
                                    }
                                } else if (tipoCodigo == 2) {
                                    //VENTA DE AVENA//
                                    if (stockavena == 0) {
                                        System.out.println("NO TENEMOS MAS DE ESE PRODUCTO!!");
                                    } else {
                                        System.out.println("Ingrese la cantidad de Kg que desea: ");
                                        KgAvena = lea.nextInt();
                                        if (KgAvena > 0) {

                                            System.out.println("-----INVENTARIO-----"
                                                    + "\n Cantidad disponible de avena: " + stockavena
                                                    + "\n Cantidad deseada por el cliente: " + KgAvena
                                                    + "\n--------------------");
                                            System.out.println("");
                                            if (stockavena >= KgAvena) {
                                                stockavena = stockavena - KgAvena;
                                                KgTotalAve = KgTotalAve + KgAvena;
                                                precioClienteAvena = KgAvena * 25;
                                                totalFactura = totalFactura + precioClienteAvena;
                                                totalAvena += precioClienteAvena;
                                                System.out.println(KgAvena + " Kg de avena agregados existosamente al carrito!!");
                                                System.out.println("Quieres seguir comprando? (Si/No)");
                                                seguirComprando = lea.next().toUpperCase();

                                            } else {
                                                System.out.println("No puedes comprar esa cantidad de avena!!");
                                                System.out.println("Quieres seguir comprando? (Si/No)");
                                                seguirComprando = lea.next().toUpperCase();
                                            }
                                        } else {
                                            System.out.println("Ingrese un valor real!!");
                                        }
                                    }
                                } else if (tipoCodigo == 3) {

                                    //VENTA DE TRIGO//
                                    
                                    System.out.println("Ingrese la cantidad de Kg que desea: ");
                                    KgTrigo = lea.nextInt();
                                    if (KgTrigo > 0) {
                                        System.out.println("-----INVENTARIO-----"
                                                + "\n Cantidad disponible de trigo: " + stocktrigo
                                                + "\n Cantidad deseada por el cliente: " + KgTrigo
                                                + "\n--------------------");
                                        System.out.println("");
                                        if (stocktrigo >= KgTrigo) {
                                            stocktrigo = stocktrigo - KgTrigo;
                                            KgTotalTri = KgTotalTri + KgTrigo;
                                            precioClienteTrigo = KgTrigo * 32;
                                            totalFactura = totalFactura + precioClienteTrigo;
                                            totalTrigo += precioClienteTrigo;
                                            System.out.println(KgTrigo + " Kg de trigo agregados existosamente al carrito!!");
                                            System.out.println("Quieres seguir comprando? (Si/No)");
                                            seguirComprando = lea.next().toUpperCase();

                                        } else {
                                            System.out.println("No puedes comprar esa cantidad de trigo!!");
                                            System.out.println("Quieres seguir comprando? (Si/No)");
                                            seguirComprando = lea.next().toUpperCase();
                                        }
                                    } else {
                                        System.out.println("Ingrese un valor real!!");
                                    }
                                } else if (tipoCodigo == 4) {

                                    //VENTA DE MAIZ//
                                    System.out.println("Ingrese la cantidad de Kg que desea: ");
                                    KgMaiz = lea.nextInt();
                                    if (KgMaiz > 0) {
                                        System.out.println("-----INVENTARIO-----"
                                                + "\n Cantidad disponible de maiz: " + stockmaiz
                                                + "\n Cantidad deseada por el cliente: " + KgMaiz
                                                + "\n--------------------");
                                        System.out.println("");
                                        if (stockmaiz >= KgMaiz) {
                                            stockmaiz = stockmaiz - KgMaiz;
                                            KgTotalMaiz = KgTotalMaiz + KgMaiz;
                                            precioClienteMaiz = KgMaiz * 20;
                                            totalFactura = totalFactura + precioClienteMaiz;
                                            totalMaiz += precioClienteMaiz;
                                            System.out.println(KgMaiz + " Kg de maiz agregados existosamente al carrito!!");
                                            System.out.println("Quieres seguir comprando? (Si/No)");
                                            seguirComprando = lea.next().toUpperCase();

                                        } else {
                                            System.out.println("No puedes comprar esa cantidad de maiz!!");
                                            System.out.println("Quieres seguir comprando? (Si/No)");
                                            seguirComprando = lea.next().toUpperCase();
                                        }
                                    } else {
                                        System.out.println("Ingrese un valor real!!");
                                    }
                                } else {
                                    System.out.println("No vendemos ese producto!!");
                                }
                            }

                            //FACTURA CLIENTE A//
                            if (totalFactura != 0) {
                                System.out.println("-------FACTURA CLIENTE A-------");
                                System.out.println("");
                                if (KgTotalAzu > 0) {
                                    System.out.println("AZUCAR: " + KgTotalAzu + "KG - V/U 30 lps " + String.format("%.2f", totalAzucar) + " Lps");
                                }
                                if (KgTotalAve > 0) {
                                    System.out.println("AVENA: " + KgTotalAve + "KG - V/U 25 lps " + String.format("%.2f", totalAvena) + " Lps");
                                }
                                if (KgTotalTri > 0) {
                                    System.out.println("TRIGO: " + KgTotalTri + "KG - V/U 32 lps " + String.format("%.2f", totalTrigo) + " Lps");
                                }
                                if (KgTotalMaiz > 0) {
                                    System.out.println("Maiz: " + KgTotalMaiz + "KG - V/U 20 lps " + String.format("%.2f", totalMaiz) + " Lps");
                                }
                                System.out.println("SUBTOTAL: " + String.format("%.2f", totalFactura) + "Lps");
                                System.out.println("");
                                System.out.println("------------------------------");

                                if (totalFactura >= 1000 && totalFactura <= 4999.99) {
                                    descuento5 = totalFactura * 0.05;
                                    totalFactura = totalFactura - descuento5;
                                    System.out.println("Su descuento es del 5%");
                                    System.out.println("PRECIO TOTAL DESCUENTO: " + String.format("%.2f", totalFactura) + " Lps");
                                    System.out.println("------------------------------");
                                } else if (totalFactura >= 5000) {
                                    descuento10 = totalFactura * 0.10;
                                    totalFactura = totalFactura - descuento10;
                                    System.out.println("Su descuento es del 10%");
                                    System.out.println("PRECIO TOTAL DESCUENTO: " + String.format("%.2f", totalFactura) + " Lps");
                                    System.out.println("------------------------------");
                                }
                                ISV = totalFactura * 0.07;
                                totalFactura = totalFactura + ISV;
                                System.out.println("ISV es del 7%");
                                System.out.println("PRECIO FINAL: " + String.format("%.2f", totalFactura) + " Lps");
                                System.out.println("");
                                System.out.println("------------------------------");
                                dinerocaja = dinerocaja + totalFactura;
                                System.out.println("");
                                System.out.println("--------------------CAJA---------------------");
                                System.out.println("SE HA AGREGADO " + String.format("%.2f", totalFactura) + " Lps EXITOSAMENTE");
                                System.out.println("TU BALANCE ES DE " + String.format("%.2f", dinerocaja) + " Lps");
                                System.out.println("---------------------------------------------");
                                System.out.println("");
                                ventasDia += 1;
                                sumaFacturasVentas = sumaFacturasVentas + totalFactura;
                                if (totalFactura >= ventaMayorGanancia) {
                                    ventaMayorGanancia = totalFactura;
                                }

                                if (KgTotalAzu >= KgProductoEstrella) {
                                    KgProductoEstrella = KgTotalAzu;
                                    productoEstrella = "Azucar";
                                }
                                if (KgTotalAve >= KgProductoEstrella) {
                                    KgProductoEstrella = KgTotalAve;
                                    productoEstrella = "Avena";
                                }
                                if (KgTotalTri >= KgProductoEstrella) {
                                    KgProductoEstrella = KgTotalTri;
                                    productoEstrella = "Trigo";
                                }
                                if (KgTotalMaiz >= KgProductoEstrella) {
                                    KgProductoEstrella = KgTotalMaiz;
                                    productoEstrella = "Maiz";
                                }
                                rankingMaiz += KgTotalMaiz;
                                rankingAvena += KgTotalAve;
                                rankingTrigo += KgTotalTri;
                                rankingAzucar += KgTotalAzu;

                            } else {
                                System.out.println("No se ha comprado nada!!");
                            }

                            //CLIENTE B//
                        } else if (tipoCliente.equals("B")) {

                            while (seguirComprando.equals("SI")) {
                                System.out.println("");
                                System.out.println("ingrese el codigo del producto que quieres vender: ");
                                System.out.println("\n"
                                        + "                    ----PRODUCTOS CLIENTE B----"
                                        + "\n    |     Azucar     |" + " |       Avena      | " + " |       Trigo      | "
                                        + "\n    |----CODIGO 1----|" + " |-----CODIGO 2-----| " + " |-----CODIGO 3-----| "
                                        + "\n    |-----PRECIO-----|" + " |------PRECIO------| " + " |------PRECIO------| "
                                        + "\n    |       30       |" + " |        25        | " + " |        32        | "
                                        + "\n    |---INVENTARIO---|" + " |----INVENTARIO----| " + " |----INVENTARIO----| "
                                        + "\n           " + stockazucar + "       " + "           " + stockavena + "         " + "            " + stocktrigo + " ");
                                System.out.println("");
                                tipoCodigo = lea.nextInt();
                                if (tipoCodigo == 1) {
                                    System.out.println("Ingrese la cantidad de Kg que desea: ");
                                    KgAzucar = lea.nextInt();
                                    if (KgAzucar > 0) {

                                        System.out.println("-----INVENTARIO-----"
                                                + "\n Cantidad disponible de azucar: " + stockazucar
                                                + "\n Cantidad deseada por el cliente: " + KgAzucar
                                                + "\n--------------------");
                                        System.out.println("");
                                        if (stockazucar >= KgAzucar) {
                                            stockazucar = stockazucar - KgAzucar;
                                            KgTotalAzu = KgTotalAzu + KgAzucar;
                                            precioClienteAzucar = KgAzucar * 30;
                                            totalFactura = totalFactura + precioClienteAzucar;
                                            totalAzucar += precioClienteAzucar;
                                            System.out.println(KgAzucar + " Kg de azucar agregados existosamente al carrito!!");
                                            System.out.println("Quieres seguir comprando? (Si/No)");
                                            seguirComprando = lea.next().toUpperCase();

                                        } else {
                                            System.out.println("No puedes comprar esa cantidad de azucar!!");
                                            System.out.println("Quieres seguir comprando? (Si/No)");
                                            seguirComprando = lea.next().toUpperCase();
                                        }

                                    } else {
                                        System.out.println("Ingrese un valor real!!");
                                    }

                                } else if (tipoCodigo == 2) {
                                    //VENTA DE AVENA//
                                    System.out.println("Ingrese la cantidad de Kg que desea: ");
                                    KgAvena = lea.nextInt();
                                    if (KgAvena > 0) {

                                        System.out.println("-----INVENTARIO-----"
                                                + "\n Cantidad disponible de avena: " + stockavena
                                                + "\n Cantidad deseada por el cliente: " + KgAvena
                                                + "\n--------------------");
                                        System.out.println("");
                                        if (stockavena >= KgAvena) {
                                            stockavena = stockavena - KgAvena;
                                            KgTotalAve = KgTotalAve + KgAvena;
                                            precioClienteAvena = KgAvena * 25;
                                            totalFactura = totalFactura + precioClienteAvena;
                                            totalAvena += precioClienteAvena;
                                            System.out.println(KgAvena + " Kg de avena agregados existosamente al carrito!!");
                                            System.out.println("Quieres seguir comprando? (Si/No)");
                                            seguirComprando = lea.next().toUpperCase();

                                        } else {
                                            System.out.println("No puedes comprar esa cantidad de avena!!");
                                            System.out.println("Quieres seguir comprando? (Si/No)");
                                            seguirComprando = lea.next().toUpperCase();
                                        }
                                    } else {
                                        System.out.println("Ingrese un valor real!!");
                                    }
                                } else if (tipoCodigo == 3) {
                                    //VENTA DE TRIGO//
                                    System.out.println("Ingrese la cantidad de Kg que desea: ");
                                    KgTrigo = lea.nextInt();
                                    if (KgTrigo > 0) {
                                        System.out.println("-----INVENTARIO-----"
                                                + "\n Cantidad disponible de trigo: " + stocktrigo
                                                + "\n Cantidad deseada por el cliente: " + KgTrigo
                                                + "\n--------------------");
                                        System.out.println("");
                                        if (stocktrigo >= KgTrigo) {
                                            stocktrigo = stocktrigo - KgTrigo;
                                            KgTotalTri = KgTotalTri + KgTrigo;
                                            precioClienteTrigo = KgTrigo * 32;
                                            totalFactura = totalFactura + precioClienteTrigo;
                                            totalTrigo += precioClienteTrigo;
                                            System.out.println(KgTrigo + " Kg de trigo agregados existosamente al carrito!!");
                                            System.out.println("Quieres seguir comprando? (Si/No)");
                                            seguirComprando = lea.next().toUpperCase();

                                        } else {
                                            System.out.println("No puedes comprar esa cantidad de trigo!!");
                                            System.out.println("Quieres seguir comprando? (Si/No)");
                                            seguirComprando = lea.next().toUpperCase();
                                        }
                                    } else {
                                        System.out.println("Ingrese un valor real!!");
                                    }
                                } else if (tipoCodigo == 4) {
                                    System.out.println("No puedes comprar ese producto!!");
                                } else {
                                    System.out.println("No vendemos ese producto!!");
                                }
                                if (totalFactura != 0) {
                                    System.out.println("-------FACTURA CLIENTE B-------");
                                    System.out.println("");
                                    if (KgTotalAzu > 0) {
                                        System.out.println("AZUCAR: " + KgTotalAzu + "KG - V/U 30 lps " + String.format("%.2f", totalAzucar) + " Lps");
                                    }
                                    if (KgTotalAve > 0) {
                                        System.out.println("AVENA: " + KgTotalAve + "KG - V/U 25 lps " + String.format("%.2f", totalAvena) + " Lps");
                                    }
                                    if (KgTotalTri > 0) {
                                        System.out.println("TRIGO: " + KgTotalTri + "KG - V/U 32 lps " + String.format("%.2f", totalTrigo) + " Lps");
                                    }
                                    System.out.println("SUBTOTAL: " + String.format("%.2f", totalFactura) + "Lps");

                                    System.out.println("------------------------------");

                                    if (totalFactura >= 1000 && totalFactura <= 4999.99) {
                                        descuento5 = totalFactura * 0.05;
                                        totalFactura = totalFactura - descuento5;
                                        System.out.println("Su descuento es del 5%");
                                        System.out.println("PRECIO TOTAL DESCUENTO: " + String.format("%.2f", totalFactura) + " Lps");
                                        System.out.println("------------------------------");
                                    } else if (totalFactura >= 5000) {
                                        descuento10 = totalFactura * 0.10;
                                        totalFactura = totalFactura - descuento10;
                                        System.out.println("Su descuento es del 10%");
                                        System.out.println("PRECIO TOTAL DESCUENTO: " + String.format("%.2f", totalFactura) + " Lps");
                                        System.out.println("------------------------------");
                                    }
                                    ISV = totalFactura * 0.07;
                                    totalFactura = totalFactura + ISV;
                                    System.out.println("ISV es del 7%");
                                    System.out.println("PRECIO FINAL: " + String.format("%.2f", totalFactura) + " Lps");
                                    System.out.println("");
                                    System.out.println("------------------------------");
                                    dinerocaja = dinerocaja + totalFactura;
                                    System.out.println("");
                                    System.out.println("--------------------CAJA---------------------");
                                    System.out.println("SE HA AGREGADO " + String.format("%.2f", totalFactura) + " Lps EXITOSAMENTE");
                                    System.out.println("TU BALANCE ES DE " + String.format("%.2f", dinerocaja) + " Lps");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("");
                                    ventasDia += 1;
                                    sumaFacturasVentas = sumaFacturasVentas + totalFactura;
                                    if (totalFactura >= ventaMayorGanancia) {
                                        ventaMayorGanancia = totalFactura;
                                        if (KgTotalAzu >= KgProductoEstrella) {
                                            KgProductoEstrella = KgTotalAzu;
                                            productoEstrella = "Azucar";
                                        }
                                        if (KgTotalAve >= KgProductoEstrella) {
                                            KgProductoEstrella = KgTotalAve;
                                            productoEstrella = "Avena";
                                        }
                                        if (KgTotalTri >= KgProductoEstrella) {
                                            KgProductoEstrella = KgTotalTri;
                                            productoEstrella = "Trigo";
                                        }
                                    }
                                    rankingAvena += KgTotalAve;
                                    rankingTrigo += KgTotalTri;
                                    rankingAzucar += KgTotalAzu;
                                } else {
                                    System.out.println("No se ha comprado nada!!");
                                }
                            }

                            //CLIENTE C//    
                        } else if (tipoCliente.equals("C")) {
                            while (seguirComprando.equals("SI")) {
                                System.out.println("");
                                System.out.println("ingrese el codigo del producto que quieres vender: ");
                                System.out.println("\n"
                                        + "----PRODUCTOS CLIENTE C----"
                                        + "\n" + "|      Maiz      |"
                                        + "\n" + "|----CODIGO 4----|"
                                        + "\n" + "|-----PRECIO-----|"
                                        + "\n" + "|       20       |"
                                        + "\n" + "|---INVENTARIO---|"
                                        + "\n" + "        " + stockmaiz + "");
                                System.out.println("");
                                tipoCodigo = lea.nextInt();
                                if (tipoCodigo == 1) {

                                } else if (tipoCodigo == 2) {
                                    System.out.println("no puedes comprar ese producto!!");
                                } else if (tipoCodigo == 3) {
                                    System.out.println("no puedes comprar ese prodcuto!!");
                                } else if (tipoCodigo == 4) {
                                    System.out.println("Ingrese la cantidad de Kg que desea: ");
                                    KgMaiz = lea.nextInt();
                                    if (KgMaiz > 0) {
                                        System.out.println("-----INVENTARIO-----"
                                                + "\n Cantidad disponible de maiz: " + stockmaiz
                                                + "\n Cantidad deseada por el cliente: " + KgMaiz
                                                + "\n--------------------");
                                        System.out.println("");
                                        if (stockmaiz >= KgMaiz) {
                                            stockmaiz = stockmaiz - KgMaiz;
                                            KgTotalMaiz = KgTotalMaiz + KgMaiz;
                                            precioClienteMaiz = KgMaiz * 20;
                                            totalFactura = totalFactura + precioClienteMaiz;
                                            totalMaiz += precioClienteMaiz;
                                            System.out.println(KgMaiz + " Kg de maiz agregados existosamente al carrito!!");
                                            System.out.println("Quieres seguir comprando? (Si/No)");
                                            seguirComprando = lea.next().toUpperCase();

                                        } else {
                                            System.out.println("No puedes comprar esa cantidad de maiz!!");
                                            System.out.println("Quieres seguir comprando? (Si/No)");
                                            seguirComprando = lea.next().toUpperCase();
                                        }
                                    } else {
                                        System.out.println("Ingrese un valor real!!");
                                    }
                                } else {
                                    System.out.println("No vendemos ese producto!!");
                                }

                            }
                            if (totalFactura != 0) {
                                System.out.println("-------FACTURA CLIENTE C-------");
                                System.out.println("");
                                if (KgTotalMaiz > 0) {
                                    System.out.println("Maiz: " + KgTotalMaiz + "KG - V/U 20 lps " + String.format("%.2f", totalMaiz) + " Lps");
                                }
                                System.out.println("SUBTOTAL: " + String.format("%.2f", totalFactura) + "Lps");

                                System.out.println("------------------------------");

                                if (totalFactura >= 1000 && totalFactura <= 4999.99) {
                                    descuento5 = totalFactura * 0.05;
                                    totalFactura = totalFactura - descuento5;
                                    System.out.println("Su descuento es del 5%");
                                    System.out.println("PRECIO TOTAL DESCUENTO: " + String.format("%.2f", totalFactura) + " Lps");
                                    System.out.println("------------------------------");
                                } else if (totalFactura >= 5000) {
                                    descuento10 = totalFactura * 0.10;
                                    totalFactura = totalFactura - descuento10;
                                    System.out.println("Su descuento es del 10%");
                                    System.out.println("PRECIO TOTAL DESCUENTO: " + String.format("%.2f", totalFactura) + " Lps");
                                    System.out.println("------------------------------");
                                }
                                ISV = totalFactura * 0.07;
                                totalFactura = totalFactura + ISV;
                                System.out.println("ISV es del 7%");
                                System.out.println("PRECIO FINAL: " + String.format("%.2f", totalFactura) + " Lps");
                                System.out.println("");
                                System.out.println("------------------------------");
                                dinerocaja = dinerocaja + totalFactura;
                                System.out.println("");
                                System.out.println("--------------------CAJA---------------------");
                                System.out.println("SE HA AGREGADO " + String.format("%.2f", totalFactura) + " Lps EXITOSAMENTE");
                                System.out.println("TU BALANCE ES DE " + String.format("%.2f", dinerocaja) + " Lps");
                                System.out.println("---------------------------------------------");
                                System.out.println("");
                                ventasDia += 1;
                                sumaFacturasVentas = sumaFacturasVentas + totalFactura;
                                if (KgTotalMaiz >= KgProductoEstrella) {
                                    KgProductoEstrella = KgTotalMaiz;
                                    productoEstrella = "Maiz";
                                }
                                rankingMaiz += KgTotalMaiz;

                            } else {
                                System.out.println("No se ha comprado nada!!");
                            }

                        } else {
                            System.out.println("No existe ese tipo de cliente!!");
                        }
                    } else {
                        System.out.println("No tienes productos para vender!!");
                    }

                    //---------------------------COMPRAS---------------------------//
                } else if (opcion == 3) {
                    System.out.println("Ingrese que tipo de proveedor quiere comprar? (A/B/C)");
                    tipoprov = lea.next().toUpperCase();

                    //SE DIRIGE AL PROVEEDOR ELEGIDO POR EL USUARIO//
                    //PROVEEDOR A//
                    if (tipoprov.equals("A")) {

                        //CODIGO 1 - 4//
                        System.out.println("ingrese el codigo del producto que quieres comprar: ");
                        System.out.println("\n" + "        ----PRODUCTOS PROVEEDOR A----"
                                + "\n    |      Azucar      |" + " |       Maiz       |"
                                + "\n    |-----CODIGO 1-----|" + " |-----CODIGO 4-----|"
                                + "\n    |------PRECIO------|" + " |------PRECIO------|"
                                + "\n    |        25        |" + " |        18        |");
                        codigoA = lea.nextInt();
                        if (codigoA == 1) {

                            // COMPRA DE AZUCAR //
                            System.out.println("Ingrese la cantidad de Kg de Azucar a comprar: ");
                            KgAzucar = lea.nextInt();
                            if (KgAzucar > 0) {
                                precioAzucar = KgAzucar * 25;
                                System.out.println("-----FACTURA-----"
                                        + "\n Tu Total es de: " + precioAzucar
                                        + "\n Tu balance: " + String.format("%.2f", dinerocaja)
                                        + "\n-----------------");
                                System.out.println("Quieres hacer la compra? (Si/No)");
                                confirmacion = lea.next().toUpperCase();

                                //CONFIRMACION DE COMPRA//
                                if (confirmacion.equals("SI")) {
                                    if (dinerocaja >= precioAzucar) {
                                        dinerocaja = dinerocaja - precioAzucar;
                                        stockazucar = stockazucar + KgAzucar;

                                        //COMPRA REALIZADA DE AZUCAR//
                                        System.out.println("-----RESULTADO-----"
                                                + "\n"
                                                + "\n Tu Balance: " + String.format("%.2f", dinerocaja)
                                                + "\n STOCK de azucar: " + stockazucar
                                                + "\n"
                                                + "\n-------------------");
                                        comprasDia += 1;
                                        sumaFacturasCompras = sumaFacturasCompras + precioAzucar;
                                        if (precioAzucar >= compraMayorGasto) {
                                            compraMayorGasto = precioAzucar;
                                        }
                                    } else {
                                        System.out.println("No se puede pagar la compra");
                                        System.out.println("");

                                    }
                                } else if (confirmacion.equals("NO")) {
                                    System.out.println("");
                                }
                            } else {
                                System.out.println("ingrese un valor real!!");
                                System.out.println("");
                            }
                            //COMPRA DE MAIZ//
                        } else if (codigoA == 4) {
                            System.out.println("Ingrese la cantidad de Kg Maiz a comprar: ");
                            KgMaiz = lea.nextInt();
                            if (KgMaiz > 0) {
                                precioMaiz = KgMaiz * 18;
                                System.out.println("-----FACTURA-----"
                                        + "\n Tu Total es de: " + precioMaiz
                                        + "\n Tu balance: " + String.format("%.2f", dinerocaja)
                                        + "\n-----------------");
                                //CONFIRMACION DE COMPRA//
                                System.out.println("Quieres hacer la compra? (Si/No)");
                                confirmacion = lea.next().toUpperCase();
                                if (confirmacion.equals("SI")) {
                                    if (dinerocaja >= precioMaiz) {
                                        dinerocaja = dinerocaja - precioMaiz;
                                        stockmaiz = stockmaiz + KgMaiz;
                                        //COMPRA REALIZADA DE MAIZ//
                                        System.out.println("-----RESULTADO-----"
                                                + "\n"
                                                + "\n Tu Balance: " + String.format("%.2f", dinerocaja)
                                                + "\n STOCK de maiz: " + stockmaiz
                                                + "\n"
                                                + "\n-------------------");
                                        comprasDia += 1;
                                        sumaFacturasCompras = sumaFacturasCompras + precioMaiz;
                                        if (precioMaiz >= compraMayorGasto) {
                                            compraMayorGasto = precioMaiz;
                                        }
                                    } else {
                                        System.out.println("No se puede pagar la compra"
                                                + "\n");

                                    }
                                } else if (confirmacion.equals("NO")) {
                                    System.out.println("");
                                }
                            } else {
                                System.out.println("Ingrese un valor real!!");
                            }
                        } else {
                            System.out.println("El vendedor no vende ese producto!!");

                        }

                        //PROVEEDOR B//
                    } else if (tipoprov.equals("B")) {
                        //CODIGO 2 y 3//
                        System.out.println("ingrese el codigo del producto que quieres comprar: ");
                        System.out.println("\n"
                                + "        -----PRODUCTOS PROVEEDOR B-----"
                                + "\n    |       Avena      |" + " |       Trigo      |"
                                + "\n    |-----CODIGO 2-----|" + " |-----CODIGO 3-----|"
                                + "\n    |------PRECIO------|" + " |------PRECIO------|"
                                + "\n    |        20        |" + " |        30        |");
                        codigoB = lea.nextInt();
                        if (codigoB == 2) {
                            //COMPRA DE AVENA//
                            System.out.println("Ingrese la cantidad de Kg de Avena a comprar: ");
                            KgAvena = lea.nextInt();
                            if (KgAvena > 0) {
                                precioAvena = KgAvena * 20;
                                System.out.println("-----FACTURA-----"
                                        + "\n Tu Total es de: " + precioAvena
                                        + "\n Tu balance: " + String.format("%.2f", dinerocaja)
                                        + "\n-----------------");
                                //CONFIRMACION DE COMPRA//
                                System.out.println("Quieres hacer la compra? (Si/No)");
                                confirmacion = lea.next().toUpperCase();
                                if (confirmacion.equals("SI")) {
                                    if (dinerocaja >= precioAvena) {
                                        dinerocaja = dinerocaja - precioAvena;
                                        stockavena = stockavena + KgAvena;

                                        //COMPRA REALIZADA DE AVENA//
                                        System.out.println("-----RESULTADO-----"
                                                + "\n"
                                                + "\n Tu Balance: " + String.format("%.2f", dinerocaja)
                                                + "\n STOCK de avena: " + stockavena
                                                + "\n"
                                                + "\n-------------------");
                                        comprasDia += 1;
                                        sumaFacturasCompras = sumaFacturasCompras + precioAvena;
                                        if (precioAvena >= compraMayorGasto) {
                                            compraMayorGasto = precioAvena;
                                        }
                                    } else {
                                        System.out.println("No se puede pagar la compra"
                                                + "\n");

                                    }
                                } else if (confirmacion.equals("NO")) {
                                    System.out.println("");
                                }
                            } else {
                                System.out.println("Ingrese un valor real!!");
                            }
                        } else if (codigoB == 3) {
                            //COMPRA DE TRIGO//
                            System.out.println("Ingrese la cantidad de Kg Trigo a comprar: ");
                            KgTrigo = lea.nextInt();
                            if (KgTrigo > 0) {
                                precioTrigo = KgTrigo * 30;
                                System.out.println("-----FACTURA-----"
                                        + "\n Tu Total es de: " + precioTrigo
                                        + "\n Tu balance: " + String.format("%.2f", dinerocaja)
                                        + "\n-----------------");
                                //CONFIRMACION DE COMPRA//
                                System.out.println("Quieres hacer la compra? (Si/No)");
                                confirmacion = lea.next().toUpperCase();
                                if (confirmacion.equals("SI")) {
                                    if (dinerocaja >= precioTrigo) {
                                        dinerocaja = dinerocaja - precioTrigo;
                                        stocktrigo = stocktrigo + KgTrigo;
                                        //COMPRA REALIZADA DE TRIGO//
                                        System.out.println("-----RESULTADO-----"
                                                + "\n"
                                                + "\n Tu Balance: " + String.format("%.2f", dinerocaja)
                                                + "\n STOCK de trigo: " + stocktrigo
                                                + "\n"
                                                + "\n-------------------");
                                        comprasDia += 1;
                                        sumaFacturasCompras = sumaFacturasCompras + precioTrigo;
                                        if (precioTrigo >= compraMayorGasto) {
                                            compraMayorGasto = precioTrigo;
                                        }
                                    } else {
                                        System.out.println("No se puede pagar la compra"
                                                + "\n");

                                    }
                                } else if (confirmacion.equals("NO")) {
                                    System.out.println("");
                                }
                            } else {
                                System.out.println("Ingrese un valor real!!");
                            }
                        } else {
                            System.out.println("El vendedor no vende ese producto!!");

                        }
                    } else if (tipoprov.equals("C")) {
                        //PROVEEDOR C//
                        //CODIGO 2//
                        System.out.println("ingrese el codigo del producto que quieres comprar: ");
                        System.out.println("\n"
                                + " ---PRODUCTOS PROVEEDOR C---"
                                + "\n    |       Avena      |"
                                + "\n    |-----CODIGO 2-----|"
                                + "\n    |------PRECIO------|"
                                + "\n    |        22        |");
                        codigoC = lea.nextInt();
                        if (codigoC == 2) {
                            //COMPRA DE AVENA//
                            System.out.println("Ingrese la cantidad de Kg de Avena a comprar: ");
                            KgAvena = lea.nextInt();
                            if (KgAvena > 0) {
                                precioAvena = KgAvena * 22;
                                System.out.println("-----FACTURA-----"
                                        + "\n Tu Total es de: " + precioAvena
                                        + "\n Tu balance: " + String.format("%.2f", dinerocaja)
                                        + "\n-----------------");
                                //CONFIRMACION COMPRA//
                                System.out.println("Quieres hacer la compra? (Si/No)");
                                confirmacion = lea.next().toUpperCase();
                                if (confirmacion.equals("SI")) {
                                    if (dinerocaja >= precioAvena) {
                                        dinerocaja = dinerocaja - precioAvena;
                                        stockavena = stockavena + KgAvena;
                                        //COMPRA REALIZADA DE AVENA//
                                        System.out.println("-----RESULTADO-----"
                                                + "\n"
                                                + "\n Tu Balance: " + String.format("%.2f", dinerocaja)
                                                + "\n STOCK de avena: " + stockavena
                                                + "\n"
                                                + "\n-------------------");
                                        comprasDia += 1;
                                        sumaFacturasCompras = sumaFacturasCompras + precioAvena;
                                        if (precioAvena >= compraMayorGasto) {
                                            compraMayorGasto = precioAvena;
                                        }
                                    } else {
                                        System.out.println("No se puede pagar la compra");
                                        System.out.println("");
                                    }
                                } else if (confirmacion.equals("NO")) {
                                    System.out.println("");
                                }

                            } else {
                                System.out.println("Ingrese un valor real!!");
                            }
                        } else {
                            System.out.println("El vendedor no vende ese producto!!");
                        }
                    } else {
                        System.out.println("No existe ese tipo de proveedor!!");
                    }

                } else if (opcion == 4) {
                    System.out.println("-------------------------------------------------------");
                    System.out.println("                        Reportes");
                    System.out.println("-------------------------------------------------------");
                    //DINERO CAJA//
                    System.out.println("CANTIDAD ACTUAL DE DINERO EN LA CAJA: " + String.format("%.2f", dinerocaja) + "");
                    System.out.println("-------------------------------------------------------");
                    //COMPRAS REALIZADAS//
                    System.out.println("NUMERO DE COMPRAS REALIZADAS HOY: " + comprasDia + "");
                    System.out.println("NUMERO DE VENTAS REALIZADAS HOY: " + ventasDia + "");
                    //VOLUMEN//
                    System.out.println("-------------------------------------------------------");
                    margenGanancia = sumaFacturasVentas - sumaFacturasCompras;
                    System.out.println("VOLUMEN TOTAL DE COMPRAS: " + String.format("%.2f", sumaFacturasCompras) + "");
                    System.out.println("VOLUMEN TOTAL DE VENTAS: " + String.format("%.2f", sumaFacturasVentas) + "");
                    System.out.println("MARGEN DE GANANCIA: " + String.format("%.2f", margenGanancia) + "");
                    System.out.println("-------------------------------------------------------");
                    //PROMEDIO//
                    if (comprasDia == 0) {
                        System.out.println("PROMEDIO DE COMPRAS ES DE: 0 Lps");
                    } else {
                        promedioCompras = sumaFacturasCompras / comprasDia;
                        System.out.println("PROMEDIO DE COMPRAS ES DE: " + String.format("%.2f", promedioCompras) + " Lps");
                    }
                    if (ventasDia == 0) {
                        System.out.println("PROMEDIO DE VENTAS ES DE: 0 Lps");
                    } else {
                        promedioVentas = sumaFacturasVentas / ventasDia;
                        System.out.println("PROMEDIO DE VENTAS ES DE: " + String.format("%.2f", promedioVentas) + " Lps");
                    }
                    System.out.println("-------------------------------------------------------");
                    //VENTA CON MAYOR GANANCIA//
                    System.out.println("VENTA CON MAYOR GANANCIA REALIZADA: " + String.format("%.2f", ventaMayorGanancia) + " Lps");
                    System.out.println("COMPRA CON MAS GASTO: " + String.format("%.2f", compraMayorGasto) + " Lps");
                    System.out.println("-------------------------------------------------------");
                    //PRODUCTO ESTRELLA//
                    if (KgProductoEstrella == 0) {
                        System.out.println("NO HAY PRODUCTO ESTRELLA AUN!!");
                    } else {
                        System.out.println("PRODUCTO ESTRELLA:" + productoEstrella + " CON UN KG DE: " + KgProductoEstrella + "");
                    }
                    //ranking//
                    if (rankingMaiz != 0 || rankingAvena != 0 || rankingAzucar != 0 || rankingTrigo != 0) {
                        System.out.println("-------------------------------------------------------");
                        System.out.println("                        RANKING                        ");

                        rankMaiz = 1;
                        rankAvena = 1;
                        rankAzucar = 1;
                        rankTrigo = 1;

                        if (rankingMaiz < rankingAvena) {
                            rankMaiz++;
                        }
                        if (rankingMaiz < rankingAzucar) {
                            rankMaiz++;
                        }
                        if (rankingMaiz < rankingTrigo) {
                            rankMaiz++;
                        }

                        if (rankingAvena < rankingMaiz) {
                            rankAvena++;
                        }
                        if (rankingAvena < rankingAzucar) {
                            rankAvena++;
                        }
                        if (rankingAvena < rankingTrigo) {
                            rankAvena++;
                        }

                        if (rankingAzucar < rankingMaiz) {
                            rankAzucar++;
                        }
                        if (rankingAzucar < rankingAvena) {
                            rankAzucar++;
                        }
                        if (rankingAzucar < rankingTrigo) {
                            rankAzucar++;
                        }

                        if (rankingTrigo < rankingMaiz) {
                            rankTrigo++;
                        }
                        if (rankingTrigo < rankingAvena) {
                            rankTrigo++;
                        }
                        if (rankingTrigo < rankingAzucar) {
                            rankTrigo++;
                        }
                        System.out.println("Maíz: " + rankMaiz);
                        System.out.println("Avena: " + rankAvena);
                        System.out.println("Azúcar: " + rankAzucar);
                        System.out.println("Trigo: " + rankTrigo);
                        System.out.println("");
                        System.out.println("-------------------------------------------------------");
                    } else {
                        System.out.println("NO SE PUEDE HACER RANKING SIN VENTAS REALIZADAS!!");
                        System.out.println("-------------------------------------------------------");
                    }

                } else if (opcion == 5) {
                    depositoCajaCierre = dinerocaja * 0.60;
                    System.out.println("");
                    System.out.println("Cerrando Caja!!");
                    System.out.println("");

                    while (true) {

                        System.out.println("------------------------------------------");
                        System.out.println("--CANTIDAD MAXIMA DE DEPOSITO ES DEL 60%--");
                        System.out.println("MAX:" + depositoCajaCierre + "Lps");
                        System.out.println("------------------------------------------");
                        System.out.println("");
                        System.out.println("Cuanto dinero quiere guardar en el banco?");
                        System.out.println("Ingrese la cantidad que desea depositar");
                        dineroBanco = lea.nextDouble();

                        if (dineroBanco <= depositoCajaCierre) {
                            System.out.println("");
                            System.out.println("Cantidad ingresada al banco es de: " + dineroBanco + " Lps");
                            dinerocaja = dinerocaja - dineroBanco;
                            System.out.println("cantidad total de la caja: " + String.format("%.2f", dinerocaja) + "");
                            System.out.println("");
                            cerrarCaja = 0;
                            break;
                        } else {
                            System.out.println("");
                            System.out.println("LA CANTIDAD QUE INGRESO ES MAYOR DEL 60%");
                            System.out.println("INTENTE DE NUEVO!!");
                            System.out.println("");
                        }
                    }
                } else if (opcion == 6) {
                    System.out.println("saliendo del sistema");
                    System.exit(0);
                }

            }
        }
    }
}
