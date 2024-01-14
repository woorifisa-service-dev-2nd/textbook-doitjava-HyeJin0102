package chap16;

class KeyValue<K,V> {
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public V getValue() {
		return value;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
}

public class TwoGenericArguments {
	public static void main(String[] args) {
		KeyValue<String, Integer> kv1 = new KeyValue<>(); // ���׸� Ÿ�� ���� K, V�� ���� String, Integer Ÿ������ ����
		kv1.setKey("���");
		kv1.setValue(1000);
		String key1 = kv1.getKey();
		int value1 = kv1.getValue();
		System.out.println("Key : "+ key1 + "  Value : " + value1);
		
		KeyValue<Integer, String> kv2 = new KeyValue<>(); // ���׸� Ÿ�� ���� K,V�� ���� Integer, String Ÿ������ ����
		kv2.setKey(404);
		kv2.setValue("Not Found(��û�� �������� ã�� �� �����ϴ�.)");
		int key2 = kv2.getKey();
		String value2 = kv2.getValue();
		System.out.println("Key : "+ key2 + " Value : " + value2);
		
		KeyValue<String, Void> kv3 = new KeyValue<>(); //�ش� ���׸� Ÿ�� ������ �ʵ带 ������� �ʴ´ٴ� �ǹ��� void
		kv3.setKey("Ű ���� ���");
		String key3 = kv3.getKey();
		System.out.println("Key : " + key3);
	}

}
