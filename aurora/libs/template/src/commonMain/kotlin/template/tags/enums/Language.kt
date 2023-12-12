package template.tags.enums

public interface Language {
    public val value: String
}

public data class SpecificLanguage(
    val language: GeneralLanguage,
    val country: CountryCode
): Language {
    override val value: String =
        "${language.value}-${country.value}"
}

public inline operator fun GeneralLanguage.minus(country: CountryCode): SpecificLanguage =
    SpecificLanguage(this, country)

@Suppress("SpellCheckingInspection")
public enum class CountryCode(public val value: String) {
    AFGHANISTAN("AF"),
    ALBANIA("AL"),
    ALGERIA("DZ"),
    AMERICAN_SAMOA("AS"),
    ANDORRA("AD"),
    ANGOLA("AO"),
    ANTARCTICA("AQ"),
    ANTIGUA_AND_BARBUDA("AG"),
    ARGENTINA("AR"),
    ARMENIA("AM"),
    ARUBA("AW"),
    AUSTRALIA("AU"),
    AUSTRIA("AT"),
    AZERBAIJAN("AZ"),
    BAHAMAS("BS"),
    BAHRAIN("BH"),
    BANGLADESH("BD"),
    BARBADOS("BB"),
    BELARUS("BY"),
    BELGIUM("BE"),
    BELIZE("BZ"),
    BENIN("BJ"),
    BERMUDA("BM"),
    BHUTAN("BT"),
    BOLIVIA("BO"),
    BOSNIA_AND_HERZEGOVINA("BA"),
    BOTSWANA("BW"),
    BOUVET_ISLAND("BV"),
    BRAZIL("BR"),
    BRITISH_INDIAN_OCEAN_TERRITORY("IO"),
    BRUNEI_DARUSSALAM("BN"),
    BULGARIA("BG"),
    BURKINA_FASO("BF"),
    BURUNDI("BI"),
    CAMBODIA("KH"),
    CAMEROON("CM"),
    CANADA("CA"),
    CAPE_VERDE("CV"),
    CAYMAN_ISLANDS("KY"),
    CENTRAL_AFRICAN_REPUBLIC("CF"),
    CHAD("TD"),
    CHILE("CL"),
    CHINA("CN"),
    CHRISTMAS_ISLAND("CX"),
    COCOS_KEELING_ISLANDS("CC"),
    COLOMBIA("CO"),
    COMOROS("KM"),
    CONGO("CG"),
    CONGO_THE_DEMOCRATIC_REPUBLIC_OF_THE("CD"),
    COOK_ISLANDS("CK"),
    COSTA_RICA("CR"),
    COTE_D_IVOIRE("CI"),
    CROATIA("HR"),
    CUBA("CU"),
    CYPRUS("CY"),
    CZECH_REPUBLIC("CZ"),
    DENMARK("DK"),
    DJIBOUTI("DJ"),
    DOMINICA("DM"),
    DOMINICAN_REPUBLIC("DO"),
    ECUADOR("EC"),
    EGYPT("EG"),
    EL_SALVADOR("SV"),
    EQUATORIAL_GUINEA("GQ"),
    ERITREA("ER"),
    ESTONIA("EE"),
    ETHIOPIA("ET"),
    FALKLAND_ISLANDS_MALVINAS("FK"),
    FAROE_ISLANDS("FO"),
    FIJI("FJ"),
    FINLAND("FI"),
    FRANCE("FR"),
    FRENCH_GUIANA("GF"),
    FRENCH_POLYNESIA("PF"),
    FRENCH_SOUTHERN_TERRITORIES("F"),
    GABON("GA"),
    GAMBIA("GM"),
    GEORGIA("GE"),
    GERMANY("DE"),
    GHANA("GH"),
    GIBRALTAR("GI"),
    GREECE("GR"),
    GREENLAND("GL"),
    GRENADA("GD"),
    GUADELOUPE("GP"),
    GUAM("GU"),
    GUATEMALA("GT"),
    GUINEA("GN"),
    GUINEA_BISSAU("GW"),
    GUYANA("GY"),
    HAITI("HT"),
    HEARD_ISLAND_AND_MCDONALD_ISLANDS("HM"),
    HONDURAS("HN"),
    HONG_KONG("HK"),
    HUNGARY("HU"),
    ICELAND("IS"),
    INDIA("IN"),
    INDONESIA("ID"),
    IRAN_ISLAMIC_REPUBLIC_OF("IR"),
    IRAQ("IQ"),
    IRELAND("IE"),
    ISRAEL("IL"),
    ITALY("IT"),
    JAMAICA("JM"),
    JAPAN("JP"),
    JORDAN("JO"),
    KAZAKHSTAN("KZ"),
    KENYA("KE"),
    KIRIBATI("KI"),
    KOREA_DEMOCRATIC_PEOPLE_S_REPUBLIC_OF("KP"),
    KOREA_REPUBLIC_OF("KR"),
    KUWAIT("KW"),
    KYRGYZSTAN("KG"),
    LAO_PEOPLE_S_DEMOCRATIC_REPUBLIC_LAOS("LA"),
    LATVIA("LV"),
    LEBANON("LB"),
    LESOTHO("LS"),
    LIBERIA("LR"),
    LIBYA_STATE_OF("LY"),
    LIECHTENSTEIN("LI"),
    LITHUANIA("LT"),
    LUXEMBOURG("LU"),
    MACAO("MO"),
    MACEDONIA_THE_FORMER_YUGOSLAV_REPUBLIC_OF("MK"),
    MADAGASCAR("MG"),
    MALAWI("MW"),
    MALAYSIA("MY"),
    MALDIVES("MV"),
    MALI("ML"),
    MALTA("MT"),
    MARSHALL_ISLANDS("MH"),
    MARTINIQUE("MQ"),
    MAURITANIA("MR"),
    MAURITIUS("MU"),
    MAYOTTE("YT"),
    MEXICO("MX"),
    MICRONESIA_FEDERATED_STATES_OF("FM"),
    MOLDOVA_REPUBLIC_OF("MD"),
    MONACO("MC"),
    MONGOLIA("MN"),
    MONTENEGRO("ME"),
    MONTSERRAT("MS"),
    MOROCCO("MA"),
    MOZAMBIQUE("MZ"),
    MYANMAR("MM"),
    NAMIBIA("NA"),
    NAURU("NR"),
    NEPAL_FEDERAL_DEMOCRATIC_REPUBLIC_OF("NP"),
    NETHERLANDS("NL"),
    NETHERLANDS_ANTILLES("AN"),
    NEW_CALEDONIA("NC"),
    NEW_ZEALAND("NZ"),
    NICARAGUA("NI"),
    NIGER("NE"),
    NIGERIA("NG"),
    NIUE("NU"),
    NORFOLK_ISLAND("NF"),
    NORTHERN_MARIANA_ISLANDS("MP"),
    NORWAY("NO"),
    OMAN("OM"),
    PAKISTAN("PK"),
    PALAU("PW"),
    PALESTINE_STATE_OF("PS"),
    PANAMA("PA"),
    PAPUA_NEW_GUINEA("PG"),
    PARAGUAY("PY"),
    PERU("PE"),
    PHILIPPINES("PH"),
    PITCAIRN("PN"),
    POLAND("PL"),
    PORTUGAL("PT"),
    PUERTO_RICO("PR"),
    QATAR("QA"),
    REUNION("RE"),
    ROMANIA("RO"),
    RUSSIAN_FEDERATION("RU"),
    RWANDA("RW"),
    SAINT_HELENA("SH"),
    SAINT_KITTS_AND_NEVIS("KN"),
    SAINT_LUCIA("LC"),
    SAINT_PIERRE_AND_MIQUELON("PM"),
    SAINT_VINCENT_AND_THE_GRENADINES("VC"),
    SAMOA("WS"),
    SAN_MARINO("SM"),
    SAO_TOME_AND_PRINCIPE("ST"),
    SAUDI_ARABIA("SA"),
    SENEGAL("SN"),
    SERBIA("RS"),
    SEYCHELLES("SC"),
    SIERRA_LEONE("SL"),
    SINGAPORE("SG"),
    SLOVAKIA("SK"),
    SLOVENIA("SI"),
    SOLOMON_ISLANDS("SB"),
    SOMALIA("SO"),
    SOUTH_AFRICA("ZA"),
    SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS("GS"),
    SOUTH_SUDAN("SS"),
    SPAIN("ES"),
    SRI_LANKA("LK"),
    SUDAN("SD"),
    SURINAME("SR"),
    SVALBARD_AND_JAN_MAYEN("SJ"),
    SWAZILAND("SZ"),
    SWEDEN("SE"),
    SWITZERLAND("CH"),
    SYRIAN_ARAB_REPUBLIC("SY"),
    TAIWAN("TW"),
    TAJIKISTAN("TJ"),
    TANZANIA_UNITED_REPUBLIC_OF("TZ"),
    THAILAND("TH"),
    TIMOR_LESTE("TL"),
    TOGO("TG"),
    TOKELAU("TK"),
    TONGA("TO"),
    TRINIDAD_AND_TOBAGO("TT"),
    TUNISIA("TN"),
    TURKEY("TR"),
    TURKMENISTAN("TM"),
    TURKS_AND_CAICOS_ISLANDS("TC"),
    TUVALU("TV"),
    UGANDA("UG"),
    UKRAINE("UA"),
    UNITED_ARAB_EMIRATES("AE"),
    UNITED_KINGDOM("GB"),
    UNITED_STATES("US"),
    UNITED_STATES_MINOR_OUTLYING_ISLANDS("UM"),
    URUGUAY("UY"),
    UZBEKISTAN("UZ"),
    VANUATU("VU"),
    VENEZUELA("VE"),
    VIET_NAM("VN"),
    VIRGIN_ISLANDS_BRITISH("VG"),
    VIRGIN_ISLANDS_US("VI"),
    WALLIS_AND_FUTUNA("WF"),
    WESTERN_SAHARA("EH"),
    YEMEN("YE"),
    ZAMBIA("ZM"),
    ZIMBABWE("ZW"),
}

@Suppress("SpellCheckingInspection")
public enum class GeneralLanguage(public override val value: String): Language {
    Abkhazian("ab"),
    Afar("aa"),
    Afrikaans("af"),
    Akan("ak"),
    Albanian("sq"),
    Amharic("am"),
    Arabic("ar"),
    Aragonese("an"),
    Armenian("hy"),
    Assamese("as"),
    Avaric("av"),
    Avestan("ae"),
    Aymara("ay"),
    Azerbaijani("az"),
    Bambara("bm"),
    Bashkir("ba"),
    Basque("eu"),
    Belarusian("be"),
    Bengali("bn"),
    Bihari("bh"),
    Bislama("bi"),
    Bosnian("bs"),
    Breton("br"),
    Bulgarian("bg"),
    Burmese("my"),
    Catalan("ca"),
    Chamorro("ch"),
    Chechen("ce"),
    Chichewa("ny"),
    Chinese("zh"),
    ChineseSimplified("zh-Hans"),
    ChineseTraditional("zh-Hant"),
    Chuvash("cv"),
    Cornish("kw"),
    Corsican("co"),
    Cree("cr"),
    Croatian("hr"),
    Czech("cz"),
    Danish("da"),
    Divehi("dv"),
    Dutch("nl"),
    Dzongkha("dz"),
    English("en"),
    Esperanto("eo"),
    Estonian("et"),
    Ewe("ee"),
    Faroese("fo"),
    Fijian("fj"),
    Finnish("fi"),
    French("fr"),
    Fula("ff"),
    Galician("gl"),
    GaelicScottish("gd"),
    GaelicManx("gv"),
    Georgian("ka"),
    German("de"),
    Greek("el"),
    Greenlandic("kl"),
    Guarani("gn"),
    Gujarati("gu"),
    Haitian("ht"),
    Hausa("ha"),
    Hebrew("he"),
    Herero("hz"),
    Hindi("hi"),
    HiriMotu("ho"),
    Hungarian("hu"),
    Icelandic("is"),
    Ido("io"),
    Igbo("ig"),
    Indonesian("id"),
    Interlingua("ia"),
    Interlingue("ie"),
    Inuktitut("iu"),
    Inupiak("ik"),
    Irish("ga"),
    Italian("it"),
    Japanese("ja"),
    Javanese("jv"),
    KalaallisutGreenlandic("kl"),
    Kannada("kn"),
    Kanuri("kr"),
    Kashmiri("ks"),
    Kazakh("kk"),
    Khmer("km"),
    Kikuyu("ki"),
    Kinyarwanda("rw"),
    Kirundi("rn"),
    Kyrgyz("ky"),
    Komi("kv"),
    Kongo("kg"),
    Korean("ko"),
    Kurdish("ju"),
    Kwanyama("kj"),
    Lao("lo"),
    Latin("la"),
    Latvian("lv"),
    Limburgish("li"),
    Lingala("ln"),
    Lithuanian("lt"),
    LugaKatanga("lu"),
    Luganda("lg"),
    Luxembourgish("lb"),
    Manx("gv"),
    Macedonian("mk"),
    Malagasy("mg"),
    Malay("ms"),
    Malayalam("ml"),
    Maltese("mt"),
    Maori("mi"),
    Marathi("mr"),
    Marshallese("mh"),
    Moldavian("mo"),
    Mongolian("mn"),
    Nauru("na"),
    Navajo("nv"),
    Ndonga("ng"),
    Ndebele("nd"),
    Nepali("ne"),
    Norwegian("no"),
    NorwegianBokmal("nb"),
    NorwegianBynorsk("nn"),
    Nuosu("ii"),
    Occitan("oc"),
    Ojibwe("oj"),
    OldChurchSlavonic("cu"),
    Oriya("or"),
    Oromo("om"),
    Ossetian("os"),
    Pali("pi"),
    Pashto("pos"),
    Persian("fa"),
    Polish("pl"),
    Portuguese("pt"),
    Punjabi("pa"),
    Quechua("qu"),
    Romansh("rm"),
    Romanian("ro"),
    Russian("ru"),
    Sami("se"),
    Samoan("se"),
    Sango("sg"),
    Sanskrit("sa"),
    Serbian("sr"),
    SerboCroatian("sh"),
    Sesotho("st"),
    Setswana("tn"),
    Shona("sn"),
    Sichuan("ii"),
    Sindhi("sd"),
    Sinhalese("si"),
    Siswati("ss"),
    Slovak("sk"),
    Slovenianhona("sl"),
    Somali("so"),
    SouthernNdebele("nl"),
    Spanish("es"),
    Sundanese("su"),
    Swahili("sw"),
    Swati("ss"),
    Swedish("sv"),
    Tagalog("tl"),
    Tahitian("ty"),
    Tajik("tg"),
    Tamil("ta"),
    Tatar("tt"),
    Telugu("te"),
    Thai("th"),
    Tibetan("bo"),
    Tigrinya("ti"),
    Tonga("to"),
    Tsonga("ts"),
    Turkish("tr"),
    Turkmen("tk"),
    Twi("tw"),
    Uyghur("ug"),
    Ukrainian("uk"),
    Urdu("ur"),
    Uzbek("uz"),
    Venda("ve"),
    Vietnamese("vi"),
    Volapuk("vo"),
    Wallon("wa"),
    Welsh("cy"),
    Wolof("wo"),
    WesternFrisian("fy"),
    Xhosa("xh"),
    Yiddish("yi"),
    Yoruba("yo"),
    Zhuang("za"),
    Zulu("zu")
}
