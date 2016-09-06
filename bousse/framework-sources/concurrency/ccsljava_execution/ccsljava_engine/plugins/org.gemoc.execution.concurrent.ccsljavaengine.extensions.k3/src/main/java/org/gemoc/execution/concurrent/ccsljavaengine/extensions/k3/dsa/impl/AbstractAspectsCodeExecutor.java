package org.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.dsa.impl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.gemoc.execution.concurrent.ccsljavaxdsml.api.dsa.executors.ICodeExecutor;

public abstract class AbstractAspectsCodeExecutor implements ICodeExecutor {

	abstract protected Set<Class<?>> getStaticHelperClasses(Object target);

	@Override
	public List<Method> findCompatibleMethodsWithAnnotation(Object caller,
			List<Object> parameters, Class<? extends Annotation> annotationClass) {
		ArrayList<Method> result = new ArrayList<Method>();
		ArrayList<Object> staticParameters = new ArrayList<Object>();
		staticParameters.add(caller);
		staticParameters.addAll(parameters);
		Set<Class<?>> staticHelperClasses = getStaticHelperClasses(caller);
		if (staticHelperClasses == null || staticHelperClasses.isEmpty()) {
			return result;
		}
		for (Class<?> c : staticHelperClasses) {
			result.addAll(getApplicableMethodsWithAnnotation(c,  staticParameters, annotationClass));
		}
		return result;
	}
	protected List<Method> getApplicableMethodsWithAnnotation(Class<?> staticHelperClass,  List<Object> parameters, Class<? extends Annotation> annotationClass) {
		ArrayList<Method> result = new ArrayList<Method>();
		Method[] methods = staticHelperClass.getDeclaredMethods();
		for (Method method : methods) {
			Class<?>[] evaluatedMethodParamTypes = method.getParameterTypes();
			if (method.isAnnotationPresent(annotationClass) && evaluatedMethodParamTypes.length == parameters.size()) {
				boolean isAllParamCompatible = true;
				for (int i = 0; i < evaluatedMethodParamTypes.length; i++) {
					Object p = parameters.get(i);
					if (evaluatedMethodParamTypes[i].isPrimitive()) {

						if (evaluatedMethodParamTypes[i].equals(Integer.TYPE) && !Integer.class.isInstance(p)) {
							isAllParamCompatible = false;
							break;
						} else if (evaluatedMethodParamTypes[i].equals(Boolean.TYPE) && !Boolean.class.isInstance(p)) {
							isAllParamCompatible = false;
							break;
						}

					} else if (!evaluatedMethodParamTypes[i].isInstance(p)) {
						isAllParamCompatible = false;
						break;
					}
				}
				if (isAllParamCompatible) {
					result.add(method);
				}
			}
		}
		// tries going in the inheritance hierarchy
		Class<?> superClass = staticHelperClass.getSuperclass();
		if (superClass != null){
			result.addAll(getApplicableMethodsWithAnnotation(superClass, parameters, annotationClass));
		}
			
		return result;
	}


}
