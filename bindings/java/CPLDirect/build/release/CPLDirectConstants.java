/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package swig.direct.CPLDirect;

public interface CPLDirectConstants {
  public final static int CPL_VERSION_MAJOR = 1;
  public final static int CPL_VERSION_MINOR = 0;
  public final static String CPL_VERSION_STR = "1.0";
  public final static int WASINFLUENCEDBY = 0;
  public final static int ALTERNATEOF = 1;
  public final static int DERIVEDBYINSERTIONFROM = 2;
  public final static int DERIVEDBYREMOVALFROM = 3;
  public final static int HADMEMBER = 4;
  public final static int HADDICTIONARYMEMBER = 5;
  public final static int SPECIALIZATIONOF = 6;
  public final static int WASDERIVEDFROM = 7;
  public final static int WASGENERATEDBY = 8;
  public final static int WASINVALIDATEDBY = 9;
  public final static int WASATTRIBUTEDTO = 10;
  public final static int USED = 11;
  public final static int WASINFORMEDBY = 12;
  public final static int WASSTARTEDBY = 13;
  public final static int WASENDEDBY = 14;
  public final static int HADPLAN = 15;
  public final static int WASASSOCIATEDWITH = 16;
  public final static int ACTEDONBEHALFOF = 17;
  public final static int CPL_S_OK = 0;
  public final static String __CPL_S_STR__0 = "Success";
  public final static int CPL_OK = 0;
  public final static String __CPL_E_STR__0 = "Success";
  public final static int CPL_S_DUPLICATE_IGNORED = 1;
  public final static String __CPL_S_STR__1 = "Success (duplicate ignored)";
  public final static int CPL_S_NO_DATA = 2;
  public final static String __CPL_S_STR__2 = "Success (no data)";
  public final static int CPL_S_OBJECT_CREATED = 3;
  public final static String __CPL_S_STR__3 = "Success (object created)";
  public final static int CPL_E_INVALID_ARGUMENT = -1;
  public final static String __CPL_E_STR__1 = "Invalid argument";
  public final static int CPL_E_INSUFFICIENT_RESOURCES = -2;
  public final static String __CPL_E_STR__2 = "Insufficient resources";
  public final static int CPL_E_DB_CONNECTION_ERROR = -3;
  public final static String __CPL_E_STR__3 = "Database connection error";
  public final static int CPL_E_NOT_IMPLEMENTED = -4;
  public final static String __CPL_E_STR__4 = "Not implemented";
  public final static int CPL_E_ALREADY_INITIALIZED = -5;
  public final static String __CPL_E_STR__5 = "CPL has already been initialized";
  public final static int CPL_E_NOT_INITIALIZED = -6;
  public final static String __CPL_E_STR__6 = "CPL has not yet been initialized";
  public final static int CPL_E_PREPARE_STATEMENT_ERROR = -7;
  public final static String __CPL_E_STR__7 = "The database failed to compile a prepared statement";
  public final static int CPL_E_STATEMENT_ERROR = -8;
  public final static String __CPL_E_STR__8 = "The database failed to execute a statement (a query)";
  public final static int CPL_E_INTERNAL_ERROR = -9;
  public final static String __CPL_E_STR__9 = "Internal error";
  public final static int CPL_E_BACKEND_INTERNAL_ERROR = -10;
  public final static String __CPL_E_STR__10 = "Database or the database driver internal error";
  public final static int CPL_E_NOT_FOUND = -11;
  public final static String __CPL_E_STR__11 = "Not found";
  public final static int CPL_E_ALREADY_EXISTS = -12;
  public final static String __CPL_E_STR__12 = "Already exits";
  public final static int CPL_E_PLATFORM_ERROR = -13;
  public final static String __CPL_E_STR__13 = "Could not handle an error returned by the native API";
  public final static int CPL_E_INVALID_VERSION = -14;
  public final static String __CPL_E_STR__14 = "Invalid version";
  public final static int CPL_E_DB_NULL = -15;
  public final static String __CPL_E_STR__15 = "The database returned an unexpected NULL value";
  public final static int CPL_E_DB_KEY_NOT_FOUND = -16;
  public final static String __CPL_E_STR__16 = "The database did not find the specified key";
  public final static int CPL_E_DB_INVALID_TYPE = -17;
  public final static String __CPL_E_STR__17 = "The value in a database has an unexpected type";
  public final static String CPL_O_FILESYSTEM = "/fs";
  public final static String CPL_O_INTERNET = "/internet";
  public final static String ENTITY = "ENTITY";
  public final static String ACTIVITY = "ACTIVITY";
  public final static String AGENT = "AGENT";
  public final static String BUNDLE = "BUNDLE";
  public final static int CPL_L_NO_FAIL = (1 << 0);
  public final static int CPL_I_NO_CREATION_SESSION = (1 << 0);
  public final static int CPL_I_FAST = (1 << 0);
  public final static int CPL_D_ANCESTORS = 0;
  public final static int CPL_D_DESCENDANTS = 1;
  public final static int NO_ENTITIES = (1 << 1);
  public final static int NO_ACTIVITIES = (1 << 2);
  public final static int NO_AGENTS = (1 << 3);
  public final static SWIGTYPE_p_f_p_q_const__cpl_object_info_p_void__int cpl_cb_collect_object_info_vector = new SWIGTYPE_p_f_p_q_const__cpl_object_info_p_void__int(CPLDirectJNI.cpl_cb_collect_object_info_vector_get(), false);
  public final static SWIGTYPE_p_f_q_const__unsigned_long_long_q_const__unsigned_long_p_void__int cpl_cb_collect_id_timestamp_vector = new SWIGTYPE_p_f_q_const__unsigned_long_long_q_const__unsigned_long_p_void__int(CPLDirectJNI.cpl_cb_collect_id_timestamp_vector_get(), false);
  public final static SWIGTYPE_p_f_q_const__unsigned_long_long_q_const__unsigned_long_long_q_const__unsigned_long_long_q_const__int_p_void__int cpl_cb_collect_relation_list = new SWIGTYPE_p_f_q_const__unsigned_long_long_q_const__unsigned_long_long_q_const__unsigned_long_long_q_const__int_p_void__int(CPLDirectJNI.cpl_cb_collect_relation_list_get(), false);
  public final static SWIGTYPE_p_f_q_const__unsigned_long_long_q_const__unsigned_long_long_q_const__unsigned_long_long_q_const__int_q_const__unsigned_long_long_p_void__int cpl_cb_collect_relation_vector = new SWIGTYPE_p_f_q_const__unsigned_long_long_q_const__unsigned_long_long_q_const__unsigned_long_long_q_const__int_q_const__unsigned_long_long_p_void__int(CPLDirectJNI.cpl_cb_collect_relation_vector_get(), false);
  public final static SWIGTYPE_p_f_q_const__unsigned_long_long_p_q_const__char_p_q_const__char_p_void__int cpl_cb_collect_properties_vector = new SWIGTYPE_p_f_q_const__unsigned_long_long_p_q_const__char_p_q_const__char_p_void__int(CPLDirectJNI.cpl_cb_collect_properties_vector_get(), false);
  public final static SWIGTYPE_p_f_q_const__unsigned_long_long_p_q_const__char_p_q_const__char_p_void__int cpl_cb_collect_property_lookup_vector = new SWIGTYPE_p_f_q_const__unsigned_long_long_p_q_const__char_p_q_const__char_p_void__int(CPLDirectJNI.cpl_cb_collect_property_lookup_vector_get(), false);
  public final static int CPL_ODBC_GENERIC = 0;
  public final static int CPL_ODBC_UNKNOWN = 0;
  public final static int CPL_ODBC_MYSQL = 1;
  public final static int CPL_ODBC_POSTGRESQL = 2;
  public final static int MAC_ADDR_LEN = 18;
  public final static int USER_LEN = 255;
  public final static int PROGRAM_LEN = 4095;
  public final static int CMDLINE_LEN = 4095;
  public final static int ORIGINATOR_LEN = 255;
  public final static int NAME_LEN = 255;
  public final static int TYPE_LEN = 100;
  public final static int KEY_LEN = 255;
  public final static int VALUE_LEN = 4095;
}