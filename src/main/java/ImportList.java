import com.github.ka4ok85.wca.constants.ListType;
import com.github.ka4ok85.wca.response.GetListsResponse;
import com.github.ka4ok85.wca.response.ResponseContainer;

public class ImportList {

    /**
     * Erster Schritt.
     * Relationale Taballe finden, welche mit vorgegebenem String beginnt.
     * @param startWith vorgegebener String mit dem die relationale Tabelle beginnt.
     * @return WCA ID der relationalen Tabelle.
     */
    private Long getRelationalTableIdStartWith(String startWith) {
        GetLists getRelationalTableIdStartWith = new GetLists(ListType.RELATIONAL_TABLES);
        ResponseContainer<GetListsResponse> getListsResponseContainer = getRelationalTableIdStartWith.execute(getEngage());
        return getRelationalTableIdStartWith.getListStartsWith(getListsResponseContainer, startWith);
    }
}
