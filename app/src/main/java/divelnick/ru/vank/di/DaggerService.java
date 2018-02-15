package divelnick.ru.vank.di;


import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.annotation.Nullable;

public class DaggerService {
    private static final String TAG = "DaggerService";

    private static Map<Class, Object> sComponentMap = new HashMap<>();

    public static void registerComponent(Class component, Object daggerComponent) {
        sComponentMap.put(component, daggerComponent);
    }

    @Nullable
    @SuppressWarnings("unchecked")
    public static <T> T getComponent(Class<T> componentClass) {
        Object component = sComponentMap.get(componentClass);
        return (T) component;
    }

    public static void unregisterScope(Class<? extends Annotation> scopeAnnotation){
        Iterator<Map.Entry<Class, Object>> iterator = sComponentMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Class, Object> entry = iterator.next();
            if (entry.getKey().isAnnotationPresent(scopeAnnotation)) {
                iterator.remove();
            }
        }
    }
}
