// Generated at Thu Sep 07 12:49:50 CEST 2023 by EGL 8.0.0.v20201019_0638
// Installed APARs: PH51523 - Test fix for variable length db2 column length issue.
package test.com;

public class hello extends com.ibm.javart.resources.Program
{
	private static final long serialVersionUID = 70L;
	
	public final hello ezeProgram;
	public com.ibm.javart.CharValue VpLogicalProgramName;
	
	public hello( com.ibm.javart.resources.RunUnit ru ) throws java.lang.Exception
	{
		super( "hello", "hello", ru, false, true, 7 );
		ezeProgram = this;
		VpLogicalProgramName = new com.ibm.javart.CharItem( "VpLogicalProgramName", com.ibm.javart.Value.SQL_NOT_NULLABLE, 36, true, "C36;" );
		this._vagCompatibility( true );
		$inithello( this );
	}
	
	public boolean _v6CharNumBehavior()
	{
		return true;
	}
	public boolean _v6SqlNullableBehavior()
	{
		return true;
	}
	public void _start() throws java.lang.Exception
	{
		$func_main();
	}
	public static com.ibm.javart.resources.StartupInfo _startupInfo()
	{
		return new com.ibm.javart.resources.StartupInfo( "hello", "test/com/hello.properties", false );
	}
	public static void main( String[] args ) throws java.lang.Exception
	{
		com.ibm.javart.resources.StartupInfo info = _startupInfo();
		info.setArgs( args );
		com.ibm.javart.resources.RunUnit ru = new com.ibm.javart.resources.RunUnit( info );
		ru.start( new hello( ru ) );
		ru.exit();
	}
	protected void _initUnsavedFields() throws java.lang.Exception
	{
		super._initUnsavedFields();
		// RETURN
	}
	
	
	public void $func_main() throws java.lang.Exception
	{
		_funcPush( "main" );
		
		// SysLib.writeStderr("hello");
		System.err.println( "hello" );
		// SysLib.writeStderr("output " + VpLogicalProgramName);
		System.err.println( ("output " + ezeProgram.VpLogicalProgramName.getValueAsString()) );
		// RETURN
		_funcPop();
		return;
	}
	
	public void $inithello( hello ezeProgram ) throws java.lang.Exception
	{
		_dbms( com.ibm.javart.sql.Sql.DBMS_DERBY );
		// constantName = "literalString";
		// MODULE_NAME = "THIS-IS-A-PROGRAM-NAME-THAT-IS-LONGE";
		// RETURN
	}
	
}

// Build options from CobConstantDebugBuildOptions, \\CobConstant\\EGLSource\\CobConstant.eglbld
//
//	bidiConversionTable = 
//	bind = 
//	blanksAsZero = NO
//	buildPlan = YES
//	byteArrayOperationsForStructuredRecords = 0
//	cachePreparedStatements = NO
//	cancelAfterTransfer = NO
//	checkNumericOverflow = YES
//	checkToTransaction = YES
//	checkType = NONE
//	cicsEntries = NONE
//	cicsj2cTimeout = -1
//	clientCodeSet = IBM-850
//	commentLevel = 1
//	currencyLocation = NONE
//	currencySymbol = 
//	data = 31
//	dbContentSeparator = 
//	dbms = DERBY
//	debugTrace = NO
//	decimalSymbol = 
//	defaultDateFormat = 
//	defaultMoneyFormat = 
//	defaultNumericFormat = 
//	defaultTimeFormat = 
//	defaultTimeStampFormat = 
//	deploymentDescriptor = CobConstant
//	destDirectory = 
//	destHost = 
//	destLibrary = QGPL
//	destPort = 
//	destUserID = 
//	eliminateSystemDependentCode = YES
//	enableJavaWrapperGen = NO
//	endCommarea = NO
//	errorDestination = 
//	fillWithNulls = YES
//	formServicePgmType = 
//	genDDSFile = NO
//	genDataTables = YES
//	genDirectory = 
//	genFixedLengthSqlLike = NO
//	genFormGroup = YES
//	genHelpFormGroup = YES
//	genProject = CobConstant
//	genProperties = GLOBAL
//	genResourceBundle = YES
//	genReturnImmediate = NO
//	genRunFile = YES
//	genVGUIRecords = YES
//	imsFastPath = NO
//	imsLogID = NOLOG
//	imsPSB = 
//	includeLineNumbers = NO
//	j2ee = NO
//	j2eeLevel = 1.3
//	leftAlign = YES
//	linkEdit = 
//	linkage = 
//	math = COBOL
//	maxNumericDigits = 31
//	mfsExtendedAttr = YES
//	mfsIgnore = NO
//	mfsUseTestLibrary = NO
//	minSubstringLength = 1
//	msgTablePrefix = 
//	positiveSignIndicator = F
//	prep = YES
//	prepareAllSQLStatements = NO
//	preparedStatementCacheSize = -1
//	printDestination = PROGRAMCONTROLLED
//	projectID = 
//	reservedWord = 
//	resourceAssociations = 
//	resourceBundleLocale = 
//	restartTransactionID = 
//	restoreCurrentMsgOnError = YES
//	returnTransaction = 
//	separatorSymbol = 
//	serverCodeSet = IBM-037
//	serverType = 
//	sessionBeanID = 
//	setFormItemFull = YES
//	spaADF = NO
//	spaSize = 0
//	spaStatusBytePosition = 0
//	spacesZero = NO
//	sqlAccessColumnsAsBytes = NO
//	sqlCommitControl = 
//	sqlDB = jdbc:derby:C:\\Test cases\\.metadata\\.plugins\\com.ibm.datatools.db2.cloudscape.driver\\SAMPLE;create=true
//	sqlErrorTrace = NO
//	sqlID = RBDTEST
//	sqlIOTrace = NO
//	sqlJDBCDriverClass = org.apache.derby.jdbc.EmbeddedDriver
//	sqlJNDIName = 
//	sqlSchema = 
//	sqlValidationConnectionURL = jdbc:derby:C:\\Test cases\\.metadata\\.plugins\\com.ibm.datatools.db2.cloudscape.driver\\SAMPLE;create=true
//	startTransactionID = 
//	statementTrace = NO
//	synchOnPgmTransfer = YES
//	synchOnTrxTransfer = NO
//	sysCodes = NO
//	system = WIN
//	targetNLS = ENU
//	tempDirectory = 
//	templateDir = 
//	transferErrorTransaction = 
//	truncateExtraDecimals = YES
//	twaOffset = 0
//	useCurrentSchema = NO
//	useXctlForTransfer = NO
//	userMessageFile = 
//	v60NumWithDateBehavior = NO
//	v60DecimalBehavior = YES
//	v60NumWithCharBehavior = YES
//	v60SQLNullableBehavior = YES
//	vagCompatibility = YES
//	v71AddBehavior = NO
//	validateBlankDateFields = YES
//	validateMixedItems = YES
//	validateOnlyIfModified = NO
//	validateSQLStatements = NO
//	vseLibrary = 
//	workDBType = AUX
//	wrapperCompatibility = CURRENT
//	wrapperPackageName = 
