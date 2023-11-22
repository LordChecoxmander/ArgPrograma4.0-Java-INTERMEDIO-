import java.util.List;

@FunctionalInterface
public interface Transformador {
	public List<String> transforma(List<String> lista);
}
