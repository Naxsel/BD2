import java.util.Arrays;

public class Usuario {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private String direccion;
    private String email;
    private int telefono;
    private Cuenta[] cuentas;

    public Usuario(String dni, String nombre, String apellidos, int edad, String direccion, String email, int telefono, Cuenta[] cuentas) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.cuentas = cuentas;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", telefono=" + telefono +
                ", cuentas=" + Arrays.toString(cuentas) +
                '}';
    }

    public static void crearUsuarios(){

        Usuario u1 = new Usuario("31168350Y","Naida","Ayala",81,"2817 Dictum. C.","et.netus@dolorDonecfringilla.edu",23980911,[c21,c23]);
        Usuario u2 = new Usuario("92141555M","Bruno","Stewart",89,"Apartado núm.: 183, 7005 Praesent Ctra.","libero.Integer.in@Cumsociisnatoque.org",89316763,null);
        Usuario u100 = new Usuario("38331046C","Otto","Frederick",97,"Apdo.:822-776 Sed, Avenida","senectus@velit.co.uk",17481518,null);
        Usuario u3 = new Usuario("77927535U","Cara","Sanford",38,"828-2547 Lorem Calle","facilisis.non@sagittis.org",82656233,null);
        Usuario u4 = new Usuario("75814109T","Caleb","Acosta",20,"Apdo.:579-3498 Dictum. Carretera","vulputate.ullamcorper.magna@tinciduntvehicula.co.uk",29678740,null);
        Usuario u5 = new Usuario("88709936O","Megan","Fulton",21,"Apdo.:152-9606 Nec, C/","pede@ultriciesornare.co.uk",90782401,null);
        Usuario u6 = new Usuario("43117428J","Hannah","Ford",65,"Apartado núm.: 937, 445 Semper C.","Phasellus.elit.pede@lectusCum.org",28939847,null);
        Usuario u7 = new Usuario("35117554Q","Carl","Fowler",36,"321-5349 Vulputate C.","Proin@arcuimperdiet.net",41419586,null);
        Usuario u8 = new Usuario("54136748M","Harding","Franks",71,"935-8589 A Avenida","mi.Aliquam.gravida@lacusUt.net",12146367,null);
        Usuario u9 = new Usuario("83145806D","Shoshana","Joyce",90,"880-3394 In Carretera","Mauris.eu.turpis@augueacipsum.org",21548203,null);
        Usuario u10 = new Usuario("35500342P","Hamilton","Mcgowan",99,"Apartado núm.: 647, 190 Velit ","ipsum.ac@Vivamus.org",42160395,null);
        Usuario u11 = new Usuario("47171447R","Briar","Franks",83,"Apdo.:952-8344 Malesuada Carretera","et.rutrum@commodoatlibero.net",26983897,null);
        Usuario u12 = new Usuario("39897410T","Xenos","Calderon",20,"603 In C.","gravida@egetipsumDonec.org",10614294,null);
        Usuario u13 = new Usuario("82545668W","Julian","Clements",33,"455-4836 Ante. C.","Fusce.dolor@sedfacilisis.edu",72347342,null);
        Usuario u14 = new Usuario("77863158P","Leilani","Barnett",75,"888-9110 Urna. Avda.","eleifend.nec@sociis.co.uk",30916976,null);
        Usuario u15 = new Usuario("18093847G","Jenette","Sims",61,"Apdo.:436-8148 Euismod Calle","turpis@Donec.ca",92648598,null);
        Usuario u16 = new Usuario("17791361N","Dieter","Knapp",62,"Apdo.:789-6964 Vestibulum Ctra.","Cras.convallis.convallis@pedemalesuadavel.edu",53376837,null);
        Usuario u17 = new Usuario("68163525V","Garrison","Vaughn",59,"Apdo.:335-159 Metus Calle","sed@quamdignissimpharetra.org",82503747,null);
        Usuario u18 = new Usuario("93953253G","Barry","Vincent",51,"Apdo.:762-8794 Sodales C/","Cras@velturpisAliquam.ca",16829915,null);
        Usuario u19 = new Usuario("30135317S","Christine","Howell",85,"Apartado núm.: 537, 7494 Eros Avda.","at@auctorodio.com",29147595,null);
        Usuario u20 = new Usuario("76450987Y","Stacey","Leblanc",90,"Apartado núm.: 549, 1019 Massa. Avda.","nec.mollis@nonquamPellentesque.co.uk",53205353,null);
        Usuario u21 = new Usuario("11085222F","Lamar","Rhodes",36,"Apdo.:843-2217 Adipiscing, Ctra.","Phasellus@eratnonummy.net",77637474,null);
        Usuario u22 = new Usuario("35673839Q","Lana","William",24,"Apdo.:842-5300 Auctor, Avenida","pede.Nunc@gravidasitamet.com",96596554,null);
        Usuario u23 = new Usuario("21790751U","Petra","Webster",40,"Apdo.:566-715 Tincidunt Av.","felis.Donec.tempor@dapibusligulaAliquam.org",51775546,null);
        Usuario u24 = new Usuario("87378151M","Naomi","Burks",94,"Apartado núm.: 849, 3933 A C.","Nam@magnaSuspendisse.com",70599279,null);
        Usuario u25 = new Usuario("76523395B","Quincy","Hendricks",63,"883-8999 Iaculis Avenida","mollis.vitae@insodaleselit.com",94709042,null);
        Usuario u26 = new Usuario("95188725O","Simone","Guerrero",85,"Apartado núm.: 883, 3352 Molestie Avda.","massa.rutrum@venenatis.co.uk",49155939,null);
        Usuario u27 = new Usuario("26498008U","Constance","Doyle",43,"258-460 In C/","ut.pellentesque@tristiquesenectus.com",27455365,null);
        Usuario u28 = new Usuario("26993236Q","Tanner","Carrillo",41,"6097 Magna Avenida","dui.lectus.rutrum@ametorci.org",44650355,null);
        Usuario u29 = new Usuario("98404251Y","Chastity","Sharp",30,"Apdo.:414-8312 Dapibus Avda.","Aenean@mauris.com",36387926,null);
        Usuario u30 = new Usuario("91785939B","Piper","Luna",54,"Apartado núm.: 141, 5522 Pellentesque Carretera","amet.nulla@Integer.edu",80953836,null);
        Usuario u31 = new Usuario("69071614T","Nathaniel","Duran",38,"Apartado núm.: 566, 3377 Sociis Avenida","arcu@bibendum.org",87252450,null);
        Usuario u32 = new Usuario("05385947Q","Montana","Bright",62,"7595 Tortor. C.","arcu.Vivamus.sit@pedeultricesa.org",58343383,null);
        Usuario u33 = new Usuario("40751123U","Damian","Cantrell",57,"Apartado núm.: 307, 1791 Non Avenida","mus@laoreet.edu",94129717,null);
        Usuario u34 = new Usuario("66219921M","Anjolie","Downs",44,"Apdo.:477-3224 Sed, C/","aliquam.eu.accumsan@amet.ca",29859260,null);
        Usuario u35 = new Usuario("84601348H","Hadassah","Collins",20,"Apartado núm.: 693, 326 Pede Avenida","amet.ultricies.sem@augue.edu",47336559,null);
        Usuario u36 = new Usuario("80650823K","Madaline","Medina",48,"8175 Risus. Carretera","enim.non@Sed.ca",35903450,null);
        Usuario u37 = new Usuario("34496433N","Lavinia","Chapman",47,"8294 Lorem C/","nibh@elitelitfermentum.com",71688238,null);
        Usuario u38 = new Usuario("60894540Y","Olivia","Daniels",46,"Apartado núm.: 875, 5346 Ipsum C.","Cras@doloregestas.edu",53392680,null);
        Usuario u39 = new Usuario("16492490D","Harriet","Church",89,"Apartado núm.: 904, 736 Duis C.","est@sagittis.co.uk",52506152,null);
        Usuario u40 = new Usuario("46149528F","Morgan","Oconnor",91,"594-2598 Justo C/","ipsum@id.ca",20838279,null);
        Usuario u41 = new Usuario("24659272D","Velma","Rasmussen",96,"362-797 Montes, Av.","Sed.et.libero@etmagna.edu",64628848,null);
        Usuario u42 = new Usuario("25377304E","Audrey","Love",73,"Apartado núm.: 444, 3933 Lectus Avenida","nec.mauris.blandit@nasceturridiculusmus.ca",14676774,null);
        Usuario u43 = new Usuario("65291361T","Wade","Wilder",50,"Apartado núm.: 755, 7066 Dictum C/","nec.leo@iaculis.com",68318364,null);
        Usuario u44 = new Usuario("32803411Q","Dahlia","Benson",80,"184-1331 Ac C.","elit@eu.com",17798794,null);
        Usuario u45 = new Usuario("11914045X","Morgan","Ferrell",47,"9925 Dapibus C/","diam@justosit.ca",81465617,null);
        Usuario u46 = new Usuario("49672036I","Dale","Carlson",49,"Apartado núm.: 445, 5753 Mi Carretera","convallis.in@egestasSed.com",31517681,null);
        Usuario u47 = new Usuario("28555428B","Bree","Dejesus",38,"Apartado núm.: 571, 8624 Diam ","ultricies@sagittis.org",40611643,null);
        Usuario u48 = new Usuario("51547731E","Benedict","Cohen",54,"Apdo.:927-1883 Elit. Calle","porta.elit.a@nec.ca",78691654,null);
        Usuario u49 = new Usuario("45968289Q","Patrick","Donaldson",34,"665-5600 Luctus Ctra.","odio@egetipsum.co.uk",86205108,null);
        Usuario u50 = new Usuario("18060706W","Aristotle","Pope",50,"Apartado núm.: 169, 8459 Non Avda.","tortor.at@afeugiat.edu",47919735,null);
        Usuario u51 = new Usuario("93031250Z","Yvette","Perez",26,"Apdo.:422-5255 Nec Avenida","vitae@temporest.net",91966150,null);
        Usuario u52 = new Usuario("18709711B","Claire","Ware",90,"Apdo.:899-7152 Sed Ctra.","Sed@neccursus.com",40401352,null);
        Usuario u53 = new Usuario("51121598S","Mariko","Higgins",43,"967-3426 Cras C/","vitae.sodales.nisi@Suspendissetristique.co.uk",96348918,null);
        Usuario u54 = new Usuario("26922526H","Jarrod","Hendrix",85,"Apdo.:827-8738 Magna. Calle","Pellentesque@idlibero.net",61181978,null);
        Usuario u55 = new Usuario("33714027T","Herman","Alvarado",92,"Apdo.:612-5570 In Avenida","ut.nulla.Cras@litoratorquent.ca",35892017,null);
        Usuario u56 = new Usuario("81206460R","Elmo","Bradshaw",86,"Apartado núm.: 471, 6862 Vulputate, Avda.","diam.eu.dolor@Nam.co.uk",98755881,null);
        Usuario u57 = new Usuario("72576823K","Louis","Houston",59,"Apdo.:803-6635 Donec C/","accumsan.neque.et@semvitaealiquam.co.uk",80199550,null);
        Usuario u58 = new Usuario("12144469Z","Lacota","Drake",68,"977-9667 Sed Avda.","dignissim.magna@elitpretium.org",68318364,null);
        Usuario u59 = new Usuario("23437337B","Zeus","Bell",32,"8086 Sit Calle","porttitor@mattis.org",23894777,null);
        Usuario u60 = new Usuario("03797706D","Alexis","Suarez",84,"6601 Mollis. Avda.","auctor.velit.eget@blanditNam.net",12371319,null);
        Usuario u61 = new Usuario("49725874Z","Thane","Randolph",19,"918-4559 Sit Avda.","magna@liberoProinmi.ca",87844028,null);
        Usuario u62 = new Usuario("98134017D","Stewart","Collins",76,"Apartado núm.: 520, 291 Lorem Av.","dolor.Quisque@nislarcuiaculis.org",10869113,null);
        Usuario u63 = new Usuario("10981441V","Rana","Pittman",60,"4926 Dolor, Ctra.","in.dolor@Quisquevarius.co.uk",74881211,null);
        Usuario u64 = new Usuario("47386336M","Elijah","Little",88,"746-1651 Ac Ctra.","gravida@adipiscingelitAliquam.ca",68760648,null);
        Usuario u65 = new Usuario("63031612B","Aubrey","Villarreal",76,"Apdo.:155-4141 Cursus Av.","vehicula.et@primisin.co.uk",14199793,null);
        Usuario u66 = new Usuario("75528204X","Hunter","Wise",46,"639-3275 Dui Carretera","nibh@nonmagna.ca",12309898,null);
        Usuario u67 = new Usuario("97303900N","Martin","Herrera",83,"Apdo.:584-4475 Ridiculus Avda.","odio.Nam.interdum@leoCras.net",69641263,null);
        Usuario u68 = new Usuario("93447059L","Erin","Hebert",68,"881-1247 Et Carretera","Aenean.eget@mifringilla.edu",46403076,null);
        Usuario u69 = new Usuario("12100825A","Isaiah","Britt",24,"373-1392 Posuere, Av.","lorem@adlitoratorquent.edu",94145503,null);
        Usuario u70 = new Usuario("39405336I","Stacey","Wiley",77,"Apartado núm.: 708, 4596 Montes, Ctra.","lorem.vitae.odio@odio.edu",88937008,null);
        Usuario u71 = new Usuario("27833423Z","Sharon","Whitney",78,"Apartado núm.: 488, 6733 Donec C/","eget.volutpat@tellus.co.uk",26309864,null);
        Usuario u72 = new Usuario("14303253H","Adrian","Barry",61,"414-3231 Varius Calle","nec.eleifend.non@Proinnon.ca",17985255,null);
        Usuario u73 = new Usuario("76143929F","Virginia","Bailey",60,"Apartado núm.: 530, 2383 Cubilia Avda.","Nulla.eu@rutrumnon.org",77727615,null);
        Usuario u74 = new Usuario("50891847J","Noah","Cooke",30,"868 Nibh. C/","enim.Curabitur.massa@scelerisque.net",92680671,null);
        Usuario u75 = new Usuario("25409886I","Kyle","Whitehead",29,"1040 Sit ","neque@facilisis.edu",51932384,null);
        Usuario u76 = new Usuario("63909981H","Carla","Stevens",53,"Apdo.:446-2015 Vestibulum. Avenida","diam@dictumultriciesligula.co.uk",93254675,null);
        Usuario u77 = new Usuario("76471511J","Kylan","Hodge",85,"245-8199 At Carretera","amet@nislQuisquefringilla.ca",38863315,null);
        Usuario u78 = new Usuario("32988101Y","Sade","William",35,"236-6144 Imperdiet Avda.","hendrerit.neque.In@maurisipsumporta.edu",80475381,null);
        Usuario u79 = new Usuario("68673043Z","Jennifer","Newton",66,"8899 Lorem, Av.","iaculis@Aliquam.net",42229825,null);
        Usuario u80 = new Usuario("49295372N","Dante","Watson",49,"423-1913 Eu Ctra.","Mauris@utdolordapibus.edu",79458273,null);
        Usuario u81 = new Usuario("90979900B","Casey","Fisher",75,"Apdo.:585-8624 Est. ","nulla.at@amet.net",38182395,null);
        Usuario u82 = new Usuario("79564421E","Barry","Higgins",30,"Apdo.:870-7766 Urna C.","risus@ametconsectetuer.ca",87945347,null);
        Usuario u83 = new Usuario("31221494M","Reuben","Ellison",69,"273-842 Cras Avda.","dui.lectus@pedeCumsociis.net",17698360,null);
        Usuario u84 = new Usuario("65614951X","Charlotte","Moody",30,"2123 Orci ","diam.vel@MaurismagnaDuis.edu",65534045,null);
        Usuario u85 = new Usuario("20222669G","Indigo","Burris",66,"Apdo.:972-1845 Risus, Carretera","nec.urna@felisegetvarius.ca",85778201,null);
        Usuario u86 = new Usuario("21577440Q","Inga","Mathews",77,"5530 Lacus. Calle","enim.condimentum@aliquamiaculis.net",18395395,null);
        Usuario u87 = new Usuario("77891270X","Savannah","Jarvis",36,"Apartado núm.: 338, 9073 Eget Av.","egestas.hendrerit.neque@Pellentesque.net",63607447,null);
        Usuario u88 = new Usuario("23872604V","Hedwig","Day",41,"286-5159 Mauris. Av.","sed.orci.lobortis@Suspendisseacmetus.edu",18496414,null);
        Usuario u89 = new Usuario("75253819W","Ursa","Whitaker",91,"3138 Lobortis Carretera","pede.nec@etrutrumeu.ca",50330336,null);
        Usuario u90 = new Usuario("70043533H","Jerry","Carney",36,"Apartado núm.: 839, 1782 Magna C/","et.nunc@sitametmassa.org",14473027,null);
        Usuario u91 = new Usuario("23626725D","Kirestin","Lawrence",75,"715-9276 Eu Avenida","diam.Duis@sempereratin.edu",14501979,null);
        Usuario u92 = new Usuario("61382122I","Winifred","Ortega",33,"1321 Quis C/","lectus@aceleifend.org",44969650,null);
        Usuario u93 = new Usuario("25126298D","Burke","Bass",73,"Apartado núm.: 639, 5913 Quam ","pellentesque.massa.lobortis@Quisquepurussapien.edu",25424883,null);
        Usuario u94 = new Usuario("22194908N","Jasmine","Delacruz",30,"Apartado núm.: 416, 6347 Tempus C.","diam@Morbi.edu",34966081,null);
        Usuario u95 = new Usuario("87501370K","Briar","Sweet",18,"270-8870 Velit ","Suspendisse.aliquet.sem@orciluctuset.edu",31535747,null);
        Usuario u96 = new Usuario("57670909V","Dennis","Avila",40,"Apdo.:430-3864 Quis Ctra.","Aliquam.ornare.libero@seddui.ca",61228584,null);
        Usuario u97 = new Usuario("59266254I","Urielle","Reyes",24,"6709 Facilisi. C/","viverra.Maecenas@mollisneccursus.org",86456180,null);
        Usuario u98 = new Usuario("71056385F","Ella","Chen",99,"Apartado núm.: 520, 6796 Eu Carretera","et@eu.net",46737107,null);
        Usuario u99 = new Usuario("94059211M","Jenette","Monroe",90,"7352 Laoreet, Avda.","urna.suscipit.nonummy@facilisisfacilisismagna.ca",61406530,null);

    }
    
    
}
