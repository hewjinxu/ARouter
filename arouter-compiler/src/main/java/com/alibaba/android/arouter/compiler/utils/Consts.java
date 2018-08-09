package com.alibaba.android.arouter.compiler.utils;

/**
 * Some consts used in processors
 *
 * @author Alex <a href="mailto:zhilong.liu@aliyun.com">Contact me.</a>
 * @version 1.0
 * @since 16/8/24 20:18
 */
public class Consts {
    // Generate
    public static final String SEPARATOR = "$$";
    public static final String PROJECT = "ARouter";
    public static final String TAG = PROJECT + "::";
    public static final String WARNING_TIPS = "DO NOT EDIT THIS FILE!!! IT WAS GENERATED BY AROUTER.";
    public static final String METHOD_LOAD_INTO = "loadInto";
    public static final String METHOD_INJECT = "inject";
    public static final String NAME_OF_ROOT = PROJECT + SEPARATOR + "Root";
    public static final String NAME_OF_PROVIDER = PROJECT + SEPARATOR + "Providers";
    public static final String NAME_OF_GROUP = PROJECT + SEPARATOR + "Group" + SEPARATOR;
    public static final String NAME_OF_INTERCEPTOR = PROJECT + SEPARATOR + "Interceptors";
    public static final String NAME_OF_AUTOWIRED = SEPARATOR + PROJECT + SEPARATOR + "Autowired";
    public static final String PACKAGE_OF_GENERATE_FILE = "com.alibaba.android.arouter.routes";

    // System interface
    public static final String ACTIVITY = "android.app.Activity";
    public static final String FRAGMENT = "android.app.Fragment";
    public static final String FRAGMENT_V4 = "android.support.v4.app.Fragment";
    public static final String SERVICE = "android.app.Service";
    public static final String PARCELABLE = "android.os.Parcelable";

    // Java type
    private static final String LANG = "java.lang";
    public static final String BYTE = LANG + ".Byte";
    public static final String SHORT = LANG + ".Short";
    public static final String INTEGER = LANG + ".Integer";
    public static final String LONG = LANG + ".Long";
    public static final String FLOAT = LANG + ".Float";
    public static final String DOUBEL = LANG + ".Double";
    public static final String BOOLEAN = LANG + ".Boolean";
    public static final String CHAR = LANG + ".Character";
    public static final String STRING = LANG + ".String";
    public static final String SERIALIZABLE = "java.io.Serializable";

    // Custom interface
    private static final String FACADE_PACKAGE = "com.alibaba.android.arouter.facade";
    private static final String TEMPLATE_PACKAGE = ".template";
    private static final String SERVICE_PACKAGE = ".service";
    public static final String IPROVIDER = FACADE_PACKAGE + TEMPLATE_PACKAGE + ".IProvider";
    public static final String IPROVIDER_GROUP = FACADE_PACKAGE + TEMPLATE_PACKAGE + ".IProviderGroup";
    public static final String IINTERCEPTOR = FACADE_PACKAGE + TEMPLATE_PACKAGE + ".IInterceptor";
    public static final String IINTERCEPTOR_GROUP = FACADE_PACKAGE + TEMPLATE_PACKAGE + ".IInterceptorGroup";
    public static final String ITROUTE_ROOT = FACADE_PACKAGE + TEMPLATE_PACKAGE + ".IRouteRoot";
    public static final String IROUTE_GROUP = FACADE_PACKAGE + TEMPLATE_PACKAGE + ".IRouteGroup";
    public static final String ISYRINGE = FACADE_PACKAGE + TEMPLATE_PACKAGE + ".ISyringe";
    public static final String JSON_SERVICE = FACADE_PACKAGE + SERVICE_PACKAGE + ".SerializationService";

    // Log
    static final String PREFIX_OF_LOGGER = PROJECT + "::Compiler ";

    // Options of processor
    public static final String KEY_MODULE_NAME = "AROUTER_MODULE_NAME";
    public static final String KEY_GENERATE_DOC_NAME = "AROUTER_GENERATE_DOC";

    public static final String VALUE_ENABLE = "enable";

    // Annotation type
    public static final String ANNOTATION_TYPE_INTECEPTOR = FACADE_PACKAGE + ".annotation.Interceptor";
    public static final String ANNOTATION_TYPE_ROUTE = FACADE_PACKAGE + ".annotation.Route";
    public static final String ANNOTATION_TYPE_AUTOWIRED = FACADE_PACKAGE + ".annotation.Autowired";
}