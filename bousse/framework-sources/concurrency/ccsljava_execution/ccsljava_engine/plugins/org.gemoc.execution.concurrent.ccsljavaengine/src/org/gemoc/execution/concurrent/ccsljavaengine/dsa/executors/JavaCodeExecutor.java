package org.gemoc.execution.concurrent.ccsljavaengine.dsa.executors;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.gemoc.execution.concurrent.ccsljavaxdsml.api.dsa.executors.CodeExecutionException;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.dsa.executors.ICodeExecutor;

import fr.inria.diverse.trace.commons.model.trace.MSEOccurrence;

public class JavaCodeExecutor implements ICodeExecutor {

	public JavaCodeExecutor() {

	}

	@Override
	public Object execute(MSEOccurrence mseOccurrence) throws CodeExecutionException {
		return execute(mseOccurrence.getMse().getCaller(), mseOccurrence.getMse().getAction().getName(),
				mseOccurrence.getParameters(), mseOccurrence);
	}

	@Override
	public Object execute(Object caller, String methodName, List<Object> parameters) throws CodeExecutionException {

		Class<?>[] parameterTypes = new Class<?>[0];
		ArrayList<Class<?>> parameterTypesList = new ArrayList<Class<?>>();
		if (parameters != null) {
			for (Object param : parameters) {
				parameterTypesList.add(param.getClass());
			}
		}
		Method method;
		Object result = null;
		try {
			method = caller.getClass().getMethod(methodName, parameterTypes);
			result = method.invoke(caller, parameters);
		} catch (NoSuchMethodException e) {
			throw new CodeExecutionException("No applicable method " + methodName
					+ "for this code executor. Could not perform action call, see inner exception.", e, null, false);
		} catch (SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			throw new CodeExecutionException("Could not perform action call, see inner exception.", e, null, true);
		}
		return result;

	}

	private Object execute(Object caller, String methodName, Collection<Object> parameters, MSEOccurrence mseoccurrence)
			throws CodeExecutionException {
		Class<?>[] parameterTypes = new Class<?>[0];
		ArrayList<Class<?>> parameterTypesList = new ArrayList<Class<?>>();
		if (mseoccurrence.getParameters() != null) {
			for (Object param : mseoccurrence.getParameters()) {
				parameterTypesList.add(param.getClass());
			}
		}
		Method method;
		Object result = null;
		try {
			method = caller.getClass().getMethod(methodName, parameterTypes);
			result = method.invoke(caller/*, mseoccurrence.getParameters()*/);
		} catch (NoSuchMethodException e) {
			throw new CodeExecutionException("No applicable method " + methodName
					+ "for this code executor. Could not perform action call, see inner exception.", e, mseoccurrence,
					false);
		} catch (SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			throw new CodeExecutionException("Could not perform action call, see inner exception.", e, mseoccurrence,
					true);
		}
		return result;
	}

	@Override
	public List<Method> findCompatibleMethodsWithAnnotation(Object caller,
			List<Object> parameters, Class<? extends Annotation> annotationClass) {
		ArrayList<Method> result = new ArrayList<Method>();
		for(Method m : caller.getClass().getMethods()){
			Class<?>[] evaluatedMethodParamTypes = m.getParameterTypes();
			if(m.isAnnotationPresent(annotationClass) && evaluatedMethodParamTypes.length == parameters.size()){
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
					result.add(m);
				}
			}
		}
		
		return result;
	}
	
	@Override
	public String getExcutorID() {
		return this.getClass().getSimpleName();
	}


}