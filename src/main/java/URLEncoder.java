
import java.io.UnsupportedEncodingException;


/**
 * 
 * @version 1.0
 * @since  24-11-2020
 * @author HP
 */
public class URLEncoder 
{
    /**
     *  <p> Deprecato </p>  La stringa risultante può variare a seconda della codifica predefinita della piattaforma. Utilizzare invece il metodo encode (String, String) per specificare la codifica. <br> Traduce una stringa in x-www-form-urlencoded formato. Questo metodo utilizza la codifica predefinita della piattaforma come schema di codifica per ottenere i byte per i caratteri non sicuri.
     *  <p> Parametro </p> s-String da tradurre
     *  <p> Ritorno Del Risultato: </p>  la traduzione dello String 
     */
    public static String encode(String s)
    {
        return s;
    }
    
    /**
     * 
     * <p> Traduce una stringa in application/x-www-form-urlencoded formato utilizzando uno schema di codifica specifico. Questo metodo utilizza lo schema di codifica fornito per ottenere i byte per i caratteri non sicuri.</p>
     * Nota: la raccomandazione del World Wide Web Consortium afferma che deve essere utilizzato UTF-8. Non farlo potrebbe introdurre incompatibilità.
     * <p> Parametro: </p> s - Stringda tradurre. 
     * <p> Parametro: </p> Il nome di una codifica dei caratteri supportata.
     * <p> Ritorno Del Risultato: </p>  il tradotto String.  
     * <p> Guarda Anche: </p>
     * <a href = "https://docs.oracle.com/javase/7/docs/api/java/net/URLDecoder.html#decode(java.lang.String,%20java.lang.String)">  URLDecoder.decode(java.lang.String, java.lang.String) </a>
     */
    public static String encode(String s, String enc) throws UnsupportedEncodingException
    {
        return s;
    }
}
