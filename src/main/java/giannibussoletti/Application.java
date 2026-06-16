package giannibussoletti;

public class Application {

    public static void main(String[] args) {
        // DATABASE RELAZIONI & SQL
        // SQL: Structured Query Language
        // Un Database è un archivio strutturato gestito da un DBMS
        //(Database Management System), un software che funge da
        //intermediario tra l'utente e i file fisici memorizzati sul disco
        //Vantaggi del DBMS:
        //Indipendenza dai dati: Accesso tramite rappresentazione
        //logica senza conoscere i dettagli implementativi
        //Integrità e sicurezza: Controllo degli accessi e dei vincoli di validità
        //Concorrenza: Gestione di accessi simultanei da parte di più
        //utenti/applicazioni

        // Cosa è un database relazionale?
        // Tutti i database relazionali salvano i propri dati in tabelle
        // I database relazionali si basano sul modello relazionale, in
        // cui l'elemento di base è una tabella bidimensionale
        // composta da righe e colonne, che ospita dei dati e che può
        // essere messa in relazione con altre tabelle contenenti altre
        // tipologie di dato
        // Questo approccio è noto anche come modello
        // Entità-Relazione (ER)
        // Le informazioni sono organizzate in Entità. Ogni entità possiede
        //attributi definiti da un nome e un valore (dato reale). Per definire
        //una tabella è necessario stabilire:
        //Nome della Tabella (es. automobili)
        //Attributi (nomi delle colonne)
        //Tipi di dato (es. Stringa, Intero)
        //Regole di integrità (Vincoli come Unique o Not Null)

        //Interrogare il DB
        // L'interazione con il database avviene tramite Structured Query Language(SQL)
        // suddivisi in categorie funzionali:
        // DQL (Data Query Language): Selezione e lettura dei dati <-- Quello su cui ci concentreremo principalmente
        // DML (Data Manipulation Language): Modifica dei dati
        // DDL (Data Definition Language): Definizione della struttura <-- Gestiamo la cosa tramite PGAdmin
        // DCL (Data Control Language): Gestione permessi e sicurezza

        // DQL permette di estrarre e filtrare i dati tramite il comando SELECT.
        // IL risultato è un Resultset.

        // SELECT: Specifica le colonne da utilizzare
        // FROM: Specifica la colonna da cui vengono presi i dati

        // WHERE: Applica un filtro alle colonne ritornando solo i campi che corrispondono al filtro
        // AND: si usa insieme a WHERE per applicare più filtri
        // BETWEEN: si una insieme ad AND per creare un filtro che non parta da "zero"
        // Es. WHERE tabella BETWEEN 1500 AND 2000
        // IS NULL / IS NOT NULL: Verifica l'assenza o presenza di un valor
        // LIKE: filtra dati testuali confrontando una stringa con un modello specifico
        // è case-sensitive, se vogliamo invece ignorare il case-sensitive dobbiamo usare
        // ILIKE
        // Per utilizzare LIKE si usano 2 caratteri speciali chiamati Wildcard, che sono:
        // %(percentuale) reppresenta una sequenza di caratteri arbitrari, lo usamo per trovare cose specifiche di cui non sappiamo il numero di lettere
        // Es:
        // %CD --> tutte le parole che finiscono con CD
        // AB% --> tutte le parole che iniziano con AB
        // %ANC% --> tutte le parole che contengono ANC
        // _ Underscore, va a sostituire uno spazio definito, un _ corrisponde ad una lettera
        // Es:
        // A _ _ _ _ Z --> Ritorna tute le parole che iniziano con A, finiscono con Z e hanno nel mezzo esattamente 4 lettere
        // IN quando dobbiamo filtrare secondo un elenco di valori
        // Es.
        // SELECT * FROM tabella WHERE colonna IN (valore1, valore2, valore3)
        // Esiste anche NOT IN che fa il suo opposto

        // SELECT può essere arricchita da altri operatori per un ulteriore elaborazione dei dati
        // ORDER BY:
        // permette di indicare l'ordine in cui devono essere estratti i dati, indicando una o più colonne su
        // cui ordinare e se l'ordine è ascendente o discendente (ASC o DESC)
        // DISTINCT:
        // Estrae solo gli elementi distinti del resultset, eliminando eventuali ripetizioni dello stesso elemento
        // FUNZIONI AGGREGATE
        // Permettono di effettuare operazioni sui valori ritornati,
        //      COUNT: che conta il numero degli elementi
        //      SUM: che ne somma il valore
        //      AVG: che calcola la media
        // GROUP BY:
        // Raggruppa le righe in base a valori comuni per applicare le funzioni aggregate

        // Nei database relazionali le informazioni non sono memorizzate in un unica tabella, ma sono
        // suddivise in entità distinte collegate da Chiavi Esterne
        // Per unire due tabelle si usa JOIN
         
    }
}
