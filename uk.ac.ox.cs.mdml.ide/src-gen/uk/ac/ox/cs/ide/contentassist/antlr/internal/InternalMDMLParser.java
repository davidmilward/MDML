package uk.ac.ox.cs.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.ox.cs.services.MDMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMDMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'STRING'", "'INT'", "'BOOLEAN'", "'draft'", "'finalized'", "'superceded'", "'DataModel'", "'status:'", "'domainid:'", "'@'", "'('", "')'", "'{'", "'}'", "'refines'", "':'", "'doesnotrefine'", "'.'", "'/'", "'ref'", "'relationship'", "'extension'", "'='", "';'", "'import'", "'.*'", "'enumtype'", "']'", "'reftype'", "'datatype'", "'DataClass'", "'DataElement'", "'constraint'", "'predicate'", "'['"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMDMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMDMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMDMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMDML.g"; }


    	private MDMLGrammarAccess grammarAccess;

    	public void setGrammarAccess(MDMLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDomainRegistry"
    // InternalMDML.g:53:1: entryRuleDomainRegistry : ruleDomainRegistry EOF ;
    public final void entryRuleDomainRegistry() throws RecognitionException {
        try {
            // InternalMDML.g:54:1: ( ruleDomainRegistry EOF )
            // InternalMDML.g:55:1: ruleDomainRegistry EOF
            {
             before(grammarAccess.getDomainRegistryRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainRegistry();

            state._fsp--;

             after(grammarAccess.getDomainRegistryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainRegistry"


    // $ANTLR start "ruleDomainRegistry"
    // InternalMDML.g:62:1: ruleDomainRegistry : ( ( rule__DomainRegistry__RegisteredItemsAssignment )* ) ;
    public final void ruleDomainRegistry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:66:2: ( ( ( rule__DomainRegistry__RegisteredItemsAssignment )* ) )
            // InternalMDML.g:67:2: ( ( rule__DomainRegistry__RegisteredItemsAssignment )* )
            {
            // InternalMDML.g:67:2: ( ( rule__DomainRegistry__RegisteredItemsAssignment )* )
            // InternalMDML.g:68:3: ( rule__DomainRegistry__RegisteredItemsAssignment )*
            {
             before(grammarAccess.getDomainRegistryAccess().getRegisteredItemsAssignment()); 
            // InternalMDML.g:69:3: ( rule__DomainRegistry__RegisteredItemsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMDML.g:69:4: rule__DomainRegistry__RegisteredItemsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__DomainRegistry__RegisteredItemsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainRegistryAccess().getRegisteredItemsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainRegistry"


    // $ANTLR start "entryRuleDataModel"
    // InternalMDML.g:78:1: entryRuleDataModel : ruleDataModel EOF ;
    public final void entryRuleDataModel() throws RecognitionException {
        try {
            // InternalMDML.g:79:1: ( ruleDataModel EOF )
            // InternalMDML.g:80:1: ruleDataModel EOF
            {
             before(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_1);
            ruleDataModel();

            state._fsp--;

             after(grammarAccess.getDataModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // InternalMDML.g:87:1: ruleDataModel : ( ( rule__DataModel__Group__0 ) ) ;
    public final void ruleDataModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:91:2: ( ( ( rule__DataModel__Group__0 ) ) )
            // InternalMDML.g:92:2: ( ( rule__DataModel__Group__0 ) )
            {
            // InternalMDML.g:92:2: ( ( rule__DataModel__Group__0 ) )
            // InternalMDML.g:93:3: ( rule__DataModel__Group__0 )
            {
             before(grammarAccess.getDataModelAccess().getGroup()); 
            // InternalMDML.g:94:3: ( rule__DataModel__Group__0 )
            // InternalMDML.g:94:4: rule__DataModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleDataItem"
    // InternalMDML.g:103:1: entryRuleDataItem : ruleDataItem EOF ;
    public final void entryRuleDataItem() throws RecognitionException {
        try {
            // InternalMDML.g:104:1: ( ruleDataItem EOF )
            // InternalMDML.g:105:1: ruleDataItem EOF
            {
             before(grammarAccess.getDataItemRule()); 
            pushFollow(FOLLOW_1);
            ruleDataItem();

            state._fsp--;

             after(grammarAccess.getDataItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataItem"


    // $ANTLR start "ruleDataItem"
    // InternalMDML.g:112:1: ruleDataItem : ( ( rule__DataItem__DataitemAssignment ) ) ;
    public final void ruleDataItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:116:2: ( ( ( rule__DataItem__DataitemAssignment ) ) )
            // InternalMDML.g:117:2: ( ( rule__DataItem__DataitemAssignment ) )
            {
            // InternalMDML.g:117:2: ( ( rule__DataItem__DataitemAssignment ) )
            // InternalMDML.g:118:3: ( rule__DataItem__DataitemAssignment )
            {
             before(grammarAccess.getDataItemAccess().getDataitemAssignment()); 
            // InternalMDML.g:119:3: ( rule__DataItem__DataitemAssignment )
            // InternalMDML.g:119:4: rule__DataItem__DataitemAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DataItem__DataitemAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDataItemAccess().getDataitemAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataItem"


    // $ANTLR start "entryRuleREFINE"
    // InternalMDML.g:128:1: entryRuleREFINE : ruleREFINE EOF ;
    public final void entryRuleREFINE() throws RecognitionException {
        try {
            // InternalMDML.g:129:1: ( ruleREFINE EOF )
            // InternalMDML.g:130:1: ruleREFINE EOF
            {
             before(grammarAccess.getREFINERule()); 
            pushFollow(FOLLOW_1);
            ruleREFINE();

            state._fsp--;

             after(grammarAccess.getREFINERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleREFINE"


    // $ANTLR start "ruleREFINE"
    // InternalMDML.g:137:1: ruleREFINE : ( ( rule__REFINE__Alternatives )? ) ;
    public final void ruleREFINE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:141:2: ( ( ( rule__REFINE__Alternatives )? ) )
            // InternalMDML.g:142:2: ( ( rule__REFINE__Alternatives )? )
            {
            // InternalMDML.g:142:2: ( ( rule__REFINE__Alternatives )? )
            // InternalMDML.g:143:3: ( rule__REFINE__Alternatives )?
            {
             before(grammarAccess.getREFINEAccess().getAlternatives()); 
            // InternalMDML.g:144:3: ( rule__REFINE__Alternatives )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==25||LA2_0==27) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMDML.g:144:4: rule__REFINE__Alternatives
                    {
                    pushFollow(FOLLOW_2);
                    rule__REFINE__Alternatives();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getREFINEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleREFINE"


    // $ANTLR start "entryRuleREFINES"
    // InternalMDML.g:153:1: entryRuleREFINES : ruleREFINES EOF ;
    public final void entryRuleREFINES() throws RecognitionException {
        try {
            // InternalMDML.g:154:1: ( ruleREFINES EOF )
            // InternalMDML.g:155:1: ruleREFINES EOF
            {
             before(grammarAccess.getREFINESRule()); 
            pushFollow(FOLLOW_1);
            ruleREFINES();

            state._fsp--;

             after(grammarAccess.getREFINESRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleREFINES"


    // $ANTLR start "ruleREFINES"
    // InternalMDML.g:162:1: ruleREFINES : ( ( rule__REFINES__Group__0 ) ) ;
    public final void ruleREFINES() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:166:2: ( ( ( rule__REFINES__Group__0 ) ) )
            // InternalMDML.g:167:2: ( ( rule__REFINES__Group__0 ) )
            {
            // InternalMDML.g:167:2: ( ( rule__REFINES__Group__0 ) )
            // InternalMDML.g:168:3: ( rule__REFINES__Group__0 )
            {
             before(grammarAccess.getREFINESAccess().getGroup()); 
            // InternalMDML.g:169:3: ( rule__REFINES__Group__0 )
            // InternalMDML.g:169:4: rule__REFINES__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__REFINES__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getREFINESAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleREFINES"


    // $ANTLR start "entryRuleDOESNOTREFINE"
    // InternalMDML.g:178:1: entryRuleDOESNOTREFINE : ruleDOESNOTREFINE EOF ;
    public final void entryRuleDOESNOTREFINE() throws RecognitionException {
        try {
            // InternalMDML.g:179:1: ( ruleDOESNOTREFINE EOF )
            // InternalMDML.g:180:1: ruleDOESNOTREFINE EOF
            {
             before(grammarAccess.getDOESNOTREFINERule()); 
            pushFollow(FOLLOW_1);
            ruleDOESNOTREFINE();

            state._fsp--;

             after(grammarAccess.getDOESNOTREFINERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDOESNOTREFINE"


    // $ANTLR start "ruleDOESNOTREFINE"
    // InternalMDML.g:187:1: ruleDOESNOTREFINE : ( ( rule__DOESNOTREFINE__Group__0 ) ) ;
    public final void ruleDOESNOTREFINE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:191:2: ( ( ( rule__DOESNOTREFINE__Group__0 ) ) )
            // InternalMDML.g:192:2: ( ( rule__DOESNOTREFINE__Group__0 ) )
            {
            // InternalMDML.g:192:2: ( ( rule__DOESNOTREFINE__Group__0 ) )
            // InternalMDML.g:193:3: ( rule__DOESNOTREFINE__Group__0 )
            {
             before(grammarAccess.getDOESNOTREFINEAccess().getGroup()); 
            // InternalMDML.g:194:3: ( rule__DOESNOTREFINE__Group__0 )
            // InternalMDML.g:194:4: rule__DOESNOTREFINE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DOESNOTREFINE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDOESNOTREFINEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDOESNOTREFINE"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMDML.g:203:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalMDML.g:204:1: ( ruleQualifiedName EOF )
            // InternalMDML.g:205:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMDML.g:212:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:216:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalMDML.g:217:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalMDML.g:217:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalMDML.g:218:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalMDML.g:219:3: ( rule__QualifiedName__Group__0 )
            // InternalMDML.g:219:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRulePath"
    // InternalMDML.g:228:1: entryRulePath : rulePath EOF ;
    public final void entryRulePath() throws RecognitionException {
        try {
            // InternalMDML.g:229:1: ( rulePath EOF )
            // InternalMDML.g:230:1: rulePath EOF
            {
             before(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_1);
            rulePath();

            state._fsp--;

             after(grammarAccess.getPathRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // InternalMDML.g:237:1: rulePath : ( ( rule__Path__Group__0 ) ) ;
    public final void rulePath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:241:2: ( ( ( rule__Path__Group__0 ) ) )
            // InternalMDML.g:242:2: ( ( rule__Path__Group__0 ) )
            {
            // InternalMDML.g:242:2: ( ( rule__Path__Group__0 ) )
            // InternalMDML.g:243:3: ( rule__Path__Group__0 )
            {
             before(grammarAccess.getPathAccess().getGroup()); 
            // InternalMDML.g:244:3: ( rule__Path__Group__0 )
            // InternalMDML.g:244:4: rule__Path__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Path__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleGUID"
    // InternalMDML.g:253:1: entryRuleGUID : ruleGUID EOF ;
    public final void entryRuleGUID() throws RecognitionException {
        try {
            // InternalMDML.g:254:1: ( ruleGUID EOF )
            // InternalMDML.g:255:1: ruleGUID EOF
            {
             before(grammarAccess.getGUIDRule()); 
            pushFollow(FOLLOW_1);
            ruleGUID();

            state._fsp--;

             after(grammarAccess.getGUIDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGUID"


    // $ANTLR start "ruleGUID"
    // InternalMDML.g:262:1: ruleGUID : ( ( rule__GUID__Group__0 ) ) ;
    public final void ruleGUID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:266:2: ( ( ( rule__GUID__Group__0 ) ) )
            // InternalMDML.g:267:2: ( ( rule__GUID__Group__0 ) )
            {
            // InternalMDML.g:267:2: ( ( rule__GUID__Group__0 ) )
            // InternalMDML.g:268:3: ( rule__GUID__Group__0 )
            {
             before(grammarAccess.getGUIDAccess().getGroup()); 
            // InternalMDML.g:269:3: ( rule__GUID__Group__0 )
            // InternalMDML.g:269:4: rule__GUID__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GUID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGUIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGUID"


    // $ANTLR start "entryRuleVersion"
    // InternalMDML.g:278:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalMDML.g:279:1: ( ruleVersion EOF )
            // InternalMDML.g:280:1: ruleVersion EOF
            {
             before(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getVersionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalMDML.g:287:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:291:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalMDML.g:292:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalMDML.g:292:2: ( ( rule__Version__Group__0 ) )
            // InternalMDML.g:293:3: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // InternalMDML.g:294:3: ( rule__Version__Group__0 )
            // InternalMDML.g:294:4: rule__Version__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Version__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleReference"
    // InternalMDML.g:303:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalMDML.g:304:1: ( ruleReference EOF )
            // InternalMDML.g:305:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalMDML.g:312:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:316:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalMDML.g:317:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalMDML.g:317:2: ( ( rule__Reference__Group__0 ) )
            // InternalMDML.g:318:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalMDML.g:319:3: ( rule__Reference__Group__0 )
            // InternalMDML.g:319:4: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleRelationSource"
    // InternalMDML.g:328:1: entryRuleRelationSource : ruleRelationSource EOF ;
    public final void entryRuleRelationSource() throws RecognitionException {
        try {
            // InternalMDML.g:329:1: ( ruleRelationSource EOF )
            // InternalMDML.g:330:1: ruleRelationSource EOF
            {
             before(grammarAccess.getRelationSourceRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationSource();

            state._fsp--;

             after(grammarAccess.getRelationSourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationSource"


    // $ANTLR start "ruleRelationSource"
    // InternalMDML.g:337:1: ruleRelationSource : ( ( rule__RelationSource__Alternatives ) ) ;
    public final void ruleRelationSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:341:2: ( ( ( rule__RelationSource__Alternatives ) ) )
            // InternalMDML.g:342:2: ( ( rule__RelationSource__Alternatives ) )
            {
            // InternalMDML.g:342:2: ( ( rule__RelationSource__Alternatives ) )
            // InternalMDML.g:343:3: ( rule__RelationSource__Alternatives )
            {
             before(grammarAccess.getRelationSourceAccess().getAlternatives()); 
            // InternalMDML.g:344:3: ( rule__RelationSource__Alternatives )
            // InternalMDML.g:344:4: rule__RelationSource__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationSource__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationSourceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationSource"


    // $ANTLR start "entryRuleRelationDestination"
    // InternalMDML.g:353:1: entryRuleRelationDestination : ruleRelationDestination EOF ;
    public final void entryRuleRelationDestination() throws RecognitionException {
        try {
            // InternalMDML.g:354:1: ( ruleRelationDestination EOF )
            // InternalMDML.g:355:1: ruleRelationDestination EOF
            {
             before(grammarAccess.getRelationDestinationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationDestination();

            state._fsp--;

             after(grammarAccess.getRelationDestinationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationDestination"


    // $ANTLR start "ruleRelationDestination"
    // InternalMDML.g:362:1: ruleRelationDestination : ( ( rule__RelationDestination__Alternatives ) ) ;
    public final void ruleRelationDestination() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:366:2: ( ( ( rule__RelationDestination__Alternatives ) ) )
            // InternalMDML.g:367:2: ( ( rule__RelationDestination__Alternatives ) )
            {
            // InternalMDML.g:367:2: ( ( rule__RelationDestination__Alternatives ) )
            // InternalMDML.g:368:3: ( rule__RelationDestination__Alternatives )
            {
             before(grammarAccess.getRelationDestinationAccess().getAlternatives()); 
            // InternalMDML.g:369:3: ( rule__RelationDestination__Alternatives )
            // InternalMDML.g:369:4: rule__RelationDestination__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationDestination__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationDestinationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationDestination"


    // $ANTLR start "entryRuleRelationship"
    // InternalMDML.g:378:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // InternalMDML.g:379:1: ( ruleRelationship EOF )
            // InternalMDML.g:380:1: ruleRelationship EOF
            {
             before(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getRelationshipRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalMDML.g:387:1: ruleRelationship : ( ( rule__Relationship__Group__0 ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:391:2: ( ( ( rule__Relationship__Group__0 ) ) )
            // InternalMDML.g:392:2: ( ( rule__Relationship__Group__0 ) )
            {
            // InternalMDML.g:392:2: ( ( rule__Relationship__Group__0 ) )
            // InternalMDML.g:393:3: ( rule__Relationship__Group__0 )
            {
             before(grammarAccess.getRelationshipAccess().getGroup()); 
            // InternalMDML.g:394:3: ( rule__Relationship__Group__0 )
            // InternalMDML.g:394:4: rule__Relationship__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleExtensionItem"
    // InternalMDML.g:403:1: entryRuleExtensionItem : ruleExtensionItem EOF ;
    public final void entryRuleExtensionItem() throws RecognitionException {
        try {
            // InternalMDML.g:404:1: ( ruleExtensionItem EOF )
            // InternalMDML.g:405:1: ruleExtensionItem EOF
            {
             before(grammarAccess.getExtensionItemRule()); 
            pushFollow(FOLLOW_1);
            ruleExtensionItem();

            state._fsp--;

             after(grammarAccess.getExtensionItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtensionItem"


    // $ANTLR start "ruleExtensionItem"
    // InternalMDML.g:412:1: ruleExtensionItem : ( ( rule__ExtensionItem__Group__0 ) ) ;
    public final void ruleExtensionItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:416:2: ( ( ( rule__ExtensionItem__Group__0 ) ) )
            // InternalMDML.g:417:2: ( ( rule__ExtensionItem__Group__0 ) )
            {
            // InternalMDML.g:417:2: ( ( rule__ExtensionItem__Group__0 ) )
            // InternalMDML.g:418:3: ( rule__ExtensionItem__Group__0 )
            {
             before(grammarAccess.getExtensionItemAccess().getGroup()); 
            // InternalMDML.g:419:3: ( rule__ExtensionItem__Group__0 )
            // InternalMDML.g:419:4: rule__ExtensionItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtensionItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtensionItem"


    // $ANTLR start "entryRuleImport"
    // InternalMDML.g:428:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMDML.g:429:1: ( ruleImport EOF )
            // InternalMDML.g:430:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMDML.g:437:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:441:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMDML.g:442:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalMDML.g:442:2: ( ( rule__Import__Group__0 ) )
            // InternalMDML.g:443:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalMDML.g:444:3: ( rule__Import__Group__0 )
            // InternalMDML.g:444:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalMDML.g:453:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalMDML.g:454:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalMDML.g:455:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalMDML.g:462:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:466:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalMDML.g:467:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalMDML.g:467:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalMDML.g:468:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalMDML.g:469:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalMDML.g:469:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleDataType"
    // InternalMDML.g:478:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalMDML.g:479:1: ( ruleDataType EOF )
            // InternalMDML.g:480:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalMDML.g:487:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:491:2: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalMDML.g:492:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalMDML.g:492:2: ( ( rule__DataType__Alternatives ) )
            // InternalMDML.g:493:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalMDML.g:494:3: ( rule__DataType__Alternatives )
            // InternalMDML.g:494:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEnumeratedType"
    // InternalMDML.g:503:1: entryRuleEnumeratedType : ruleEnumeratedType EOF ;
    public final void entryRuleEnumeratedType() throws RecognitionException {
        try {
            // InternalMDML.g:504:1: ( ruleEnumeratedType EOF )
            // InternalMDML.g:505:1: ruleEnumeratedType EOF
            {
             before(grammarAccess.getEnumeratedTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumeratedType();

            state._fsp--;

             after(grammarAccess.getEnumeratedTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumeratedType"


    // $ANTLR start "ruleEnumeratedType"
    // InternalMDML.g:512:1: ruleEnumeratedType : ( ( rule__EnumeratedType__Group__0 ) ) ;
    public final void ruleEnumeratedType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:516:2: ( ( ( rule__EnumeratedType__Group__0 ) ) )
            // InternalMDML.g:517:2: ( ( rule__EnumeratedType__Group__0 ) )
            {
            // InternalMDML.g:517:2: ( ( rule__EnumeratedType__Group__0 ) )
            // InternalMDML.g:518:3: ( rule__EnumeratedType__Group__0 )
            {
             before(grammarAccess.getEnumeratedTypeAccess().getGroup()); 
            // InternalMDML.g:519:3: ( rule__EnumeratedType__Group__0 )
            // InternalMDML.g:519:4: rule__EnumeratedType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumeratedType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumeratedTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumeratedType"


    // $ANTLR start "entryRuleReferenceType"
    // InternalMDML.g:528:1: entryRuleReferenceType : ruleReferenceType EOF ;
    public final void entryRuleReferenceType() throws RecognitionException {
        try {
            // InternalMDML.g:529:1: ( ruleReferenceType EOF )
            // InternalMDML.g:530:1: ruleReferenceType EOF
            {
             before(grammarAccess.getReferenceTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleReferenceType();

            state._fsp--;

             after(grammarAccess.getReferenceTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReferenceType"


    // $ANTLR start "ruleReferenceType"
    // InternalMDML.g:537:1: ruleReferenceType : ( ( rule__ReferenceType__Group__0 ) ) ;
    public final void ruleReferenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:541:2: ( ( ( rule__ReferenceType__Group__0 ) ) )
            // InternalMDML.g:542:2: ( ( rule__ReferenceType__Group__0 ) )
            {
            // InternalMDML.g:542:2: ( ( rule__ReferenceType__Group__0 ) )
            // InternalMDML.g:543:3: ( rule__ReferenceType__Group__0 )
            {
             before(grammarAccess.getReferenceTypeAccess().getGroup()); 
            // InternalMDML.g:544:3: ( rule__ReferenceType__Group__0 )
            // InternalMDML.g:544:4: rule__ReferenceType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReferenceType"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalMDML.g:553:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalMDML.g:554:1: ( rulePrimitiveType EOF )
            // InternalMDML.g:555:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalMDML.g:562:1: rulePrimitiveType : ( ( rule__PrimitiveType__Group__0 ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:566:2: ( ( ( rule__PrimitiveType__Group__0 ) ) )
            // InternalMDML.g:567:2: ( ( rule__PrimitiveType__Group__0 ) )
            {
            // InternalMDML.g:567:2: ( ( rule__PrimitiveType__Group__0 ) )
            // InternalMDML.g:568:3: ( rule__PrimitiveType__Group__0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getGroup()); 
            // InternalMDML.g:569:3: ( rule__PrimitiveType__Group__0 )
            // InternalMDML.g:569:4: rule__PrimitiveType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleBasic"
    // InternalMDML.g:578:1: entryRuleBasic : ruleBasic EOF ;
    public final void entryRuleBasic() throws RecognitionException {
        try {
            // InternalMDML.g:579:1: ( ruleBasic EOF )
            // InternalMDML.g:580:1: ruleBasic EOF
            {
             before(grammarAccess.getBasicRule()); 
            pushFollow(FOLLOW_1);
            ruleBasic();

            state._fsp--;

             after(grammarAccess.getBasicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasic"


    // $ANTLR start "ruleBasic"
    // InternalMDML.g:587:1: ruleBasic : ( ( rule__Basic__TypenameAssignment ) ) ;
    public final void ruleBasic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:591:2: ( ( ( rule__Basic__TypenameAssignment ) ) )
            // InternalMDML.g:592:2: ( ( rule__Basic__TypenameAssignment ) )
            {
            // InternalMDML.g:592:2: ( ( rule__Basic__TypenameAssignment ) )
            // InternalMDML.g:593:3: ( rule__Basic__TypenameAssignment )
            {
             before(grammarAccess.getBasicAccess().getTypenameAssignment()); 
            // InternalMDML.g:594:3: ( rule__Basic__TypenameAssignment )
            // InternalMDML.g:594:4: rule__Basic__TypenameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Basic__TypenameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBasicAccess().getTypenameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasic"


    // $ANTLR start "entryRuleContainerElement"
    // InternalMDML.g:603:1: entryRuleContainerElement : ruleContainerElement EOF ;
    public final void entryRuleContainerElement() throws RecognitionException {
        try {
            // InternalMDML.g:604:1: ( ruleContainerElement EOF )
            // InternalMDML.g:605:1: ruleContainerElement EOF
            {
             before(grammarAccess.getContainerElementRule()); 
            pushFollow(FOLLOW_1);
            ruleContainerElement();

            state._fsp--;

             after(grammarAccess.getContainerElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContainerElement"


    // $ANTLR start "ruleContainerElement"
    // InternalMDML.g:612:1: ruleContainerElement : ( ( rule__ContainerElement__Alternatives ) ) ;
    public final void ruleContainerElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:616:2: ( ( ( rule__ContainerElement__Alternatives ) ) )
            // InternalMDML.g:617:2: ( ( rule__ContainerElement__Alternatives ) )
            {
            // InternalMDML.g:617:2: ( ( rule__ContainerElement__Alternatives ) )
            // InternalMDML.g:618:3: ( rule__ContainerElement__Alternatives )
            {
             before(grammarAccess.getContainerElementAccess().getAlternatives()); 
            // InternalMDML.g:619:3: ( rule__ContainerElement__Alternatives )
            // InternalMDML.g:619:4: rule__ContainerElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ContainerElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContainerElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainerElement"


    // $ANTLR start "entryRuleDataClass"
    // InternalMDML.g:628:1: entryRuleDataClass : ruleDataClass EOF ;
    public final void entryRuleDataClass() throws RecognitionException {
        try {
            // InternalMDML.g:629:1: ( ruleDataClass EOF )
            // InternalMDML.g:630:1: ruleDataClass EOF
            {
             before(grammarAccess.getDataClassRule()); 
            pushFollow(FOLLOW_1);
            ruleDataClass();

            state._fsp--;

             after(grammarAccess.getDataClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataClass"


    // $ANTLR start "ruleDataClass"
    // InternalMDML.g:637:1: ruleDataClass : ( ( rule__DataClass__Group__0 ) ) ;
    public final void ruleDataClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:641:2: ( ( ( rule__DataClass__Group__0 ) ) )
            // InternalMDML.g:642:2: ( ( rule__DataClass__Group__0 ) )
            {
            // InternalMDML.g:642:2: ( ( rule__DataClass__Group__0 ) )
            // InternalMDML.g:643:3: ( rule__DataClass__Group__0 )
            {
             before(grammarAccess.getDataClassAccess().getGroup()); 
            // InternalMDML.g:644:3: ( rule__DataClass__Group__0 )
            // InternalMDML.g:644:4: rule__DataClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataClass"


    // $ANTLR start "entryRuleDataElement"
    // InternalMDML.g:653:1: entryRuleDataElement : ruleDataElement EOF ;
    public final void entryRuleDataElement() throws RecognitionException {
        try {
            // InternalMDML.g:654:1: ( ruleDataElement EOF )
            // InternalMDML.g:655:1: ruleDataElement EOF
            {
             before(grammarAccess.getDataElementRule()); 
            pushFollow(FOLLOW_1);
            ruleDataElement();

            state._fsp--;

             after(grammarAccess.getDataElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataElement"


    // $ANTLR start "ruleDataElement"
    // InternalMDML.g:662:1: ruleDataElement : ( ( rule__DataElement__Group__0 ) ) ;
    public final void ruleDataElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:666:2: ( ( ( rule__DataElement__Group__0 ) ) )
            // InternalMDML.g:667:2: ( ( rule__DataElement__Group__0 ) )
            {
            // InternalMDML.g:667:2: ( ( rule__DataElement__Group__0 ) )
            // InternalMDML.g:668:3: ( rule__DataElement__Group__0 )
            {
             before(grammarAccess.getDataElementAccess().getGroup()); 
            // InternalMDML.g:669:3: ( rule__DataElement__Group__0 )
            // InternalMDML.g:669:4: rule__DataElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataElement"


    // $ANTLR start "entryRuleStatus"
    // InternalMDML.g:678:1: entryRuleStatus : ruleStatus EOF ;
    public final void entryRuleStatus() throws RecognitionException {
        try {
            // InternalMDML.g:679:1: ( ruleStatus EOF )
            // InternalMDML.g:680:1: ruleStatus EOF
            {
             before(grammarAccess.getStatusRule()); 
            pushFollow(FOLLOW_1);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getStatusRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatus"


    // $ANTLR start "ruleStatus"
    // InternalMDML.g:687:1: ruleStatus : ( ( rule__Status__Alternatives ) ) ;
    public final void ruleStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:691:2: ( ( ( rule__Status__Alternatives ) ) )
            // InternalMDML.g:692:2: ( ( rule__Status__Alternatives ) )
            {
            // InternalMDML.g:692:2: ( ( rule__Status__Alternatives ) )
            // InternalMDML.g:693:3: ( rule__Status__Alternatives )
            {
             before(grammarAccess.getStatusAccess().getAlternatives()); 
            // InternalMDML.g:694:3: ( rule__Status__Alternatives )
            // InternalMDML.g:694:4: rule__Status__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Status__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatusAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatus"


    // $ANTLR start "entryRuleConstraint"
    // InternalMDML.g:703:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalMDML.g:704:1: ( ruleConstraint EOF )
            // InternalMDML.g:705:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalMDML.g:712:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:716:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalMDML.g:717:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalMDML.g:717:2: ( ( rule__Constraint__Group__0 ) )
            // InternalMDML.g:718:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalMDML.g:719:3: ( rule__Constraint__Group__0 )
            // InternalMDML.g:719:4: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRulePredicate"
    // InternalMDML.g:728:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // InternalMDML.g:729:1: ( rulePredicate EOF )
            // InternalMDML.g:730:1: rulePredicate EOF
            {
             before(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getPredicateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalMDML.g:737:1: rulePredicate : ( ( rule__Predicate__Group__0 ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:741:2: ( ( ( rule__Predicate__Group__0 ) ) )
            // InternalMDML.g:742:2: ( ( rule__Predicate__Group__0 ) )
            {
            // InternalMDML.g:742:2: ( ( rule__Predicate__Group__0 ) )
            // InternalMDML.g:743:3: ( rule__Predicate__Group__0 )
            {
             before(grammarAccess.getPredicateAccess().getGroup()); 
            // InternalMDML.g:744:3: ( rule__Predicate__Group__0 )
            // InternalMDML.g:744:4: rule__Predicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "rule__DataItem__DataitemAlternatives_0"
    // InternalMDML.g:752:1: rule__DataItem__DataitemAlternatives_0 : ( ( ruleDataModel ) | ( ruleDataClass ) | ( ruleDataElement ) | ( ruleDataType ) | ( ruleImport ) | ( ruleExtensionItem ) );
    public final void rule__DataItem__DataitemAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:756:1: ( ( ruleDataModel ) | ( ruleDataClass ) | ( ruleDataElement ) | ( ruleDataType ) | ( ruleImport ) | ( ruleExtensionItem ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 41:
                {
                alt3=2;
                }
                break;
            case 42:
                {
                alt3=3;
                }
                break;
            case 37:
            case 39:
            case 40:
                {
                alt3=4;
                }
                break;
            case 35:
                {
                alt3=5;
                }
                break;
            case 32:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMDML.g:757:2: ( ruleDataModel )
                    {
                    // InternalMDML.g:757:2: ( ruleDataModel )
                    // InternalMDML.g:758:3: ruleDataModel
                    {
                     before(grammarAccess.getDataItemAccess().getDataitemDataModelParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataModel();

                    state._fsp--;

                     after(grammarAccess.getDataItemAccess().getDataitemDataModelParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMDML.g:763:2: ( ruleDataClass )
                    {
                    // InternalMDML.g:763:2: ( ruleDataClass )
                    // InternalMDML.g:764:3: ruleDataClass
                    {
                     before(grammarAccess.getDataItemAccess().getDataitemDataClassParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDataClass();

                    state._fsp--;

                     after(grammarAccess.getDataItemAccess().getDataitemDataClassParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMDML.g:769:2: ( ruleDataElement )
                    {
                    // InternalMDML.g:769:2: ( ruleDataElement )
                    // InternalMDML.g:770:3: ruleDataElement
                    {
                     before(grammarAccess.getDataItemAccess().getDataitemDataElementParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDataElement();

                    state._fsp--;

                     after(grammarAccess.getDataItemAccess().getDataitemDataElementParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMDML.g:775:2: ( ruleDataType )
                    {
                    // InternalMDML.g:775:2: ( ruleDataType )
                    // InternalMDML.g:776:3: ruleDataType
                    {
                     before(grammarAccess.getDataItemAccess().getDataitemDataTypeParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getDataItemAccess().getDataitemDataTypeParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMDML.g:781:2: ( ruleImport )
                    {
                    // InternalMDML.g:781:2: ( ruleImport )
                    // InternalMDML.g:782:3: ruleImport
                    {
                     before(grammarAccess.getDataItemAccess().getDataitemImportParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getDataItemAccess().getDataitemImportParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMDML.g:787:2: ( ruleExtensionItem )
                    {
                    // InternalMDML.g:787:2: ( ruleExtensionItem )
                    // InternalMDML.g:788:3: ruleExtensionItem
                    {
                     before(grammarAccess.getDataItemAccess().getDataitemExtensionItemParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleExtensionItem();

                    state._fsp--;

                     after(grammarAccess.getDataItemAccess().getDataitemExtensionItemParserRuleCall_0_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataItem__DataitemAlternatives_0"


    // $ANTLR start "rule__REFINE__Alternatives"
    // InternalMDML.g:797:1: rule__REFINE__Alternatives : ( ( ruleREFINES ) | ( ruleDOESNOTREFINE ) );
    public final void rule__REFINE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:801:1: ( ( ruleREFINES ) | ( ruleDOESNOTREFINE ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMDML.g:802:2: ( ruleREFINES )
                    {
                    // InternalMDML.g:802:2: ( ruleREFINES )
                    // InternalMDML.g:803:3: ruleREFINES
                    {
                     before(grammarAccess.getREFINEAccess().getREFINESParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleREFINES();

                    state._fsp--;

                     after(grammarAccess.getREFINEAccess().getREFINESParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMDML.g:808:2: ( ruleDOESNOTREFINE )
                    {
                    // InternalMDML.g:808:2: ( ruleDOESNOTREFINE )
                    // InternalMDML.g:809:3: ruleDOESNOTREFINE
                    {
                     before(grammarAccess.getREFINEAccess().getDOESNOTREFINEParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDOESNOTREFINE();

                    state._fsp--;

                     after(grammarAccess.getREFINEAccess().getDOESNOTREFINEParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REFINE__Alternatives"


    // $ANTLR start "rule__GUID__Alternatives_1"
    // InternalMDML.g:818:1: rule__GUID__Alternatives_1 : ( ( ( rule__GUID__Group_1_0__0 ) ) | ( ( rule__GUID__Group_1_1__0 ) ) );
    public final void rule__GUID__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:822:1: ( ( ( rule__GUID__Group_1_0__0 ) ) | ( ( rule__GUID__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            else if ( (LA5_0==29) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMDML.g:823:2: ( ( rule__GUID__Group_1_0__0 ) )
                    {
                    // InternalMDML.g:823:2: ( ( rule__GUID__Group_1_0__0 ) )
                    // InternalMDML.g:824:3: ( rule__GUID__Group_1_0__0 )
                    {
                     before(grammarAccess.getGUIDAccess().getGroup_1_0()); 
                    // InternalMDML.g:825:3: ( rule__GUID__Group_1_0__0 )
                    // InternalMDML.g:825:4: rule__GUID__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GUID__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGUIDAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMDML.g:829:2: ( ( rule__GUID__Group_1_1__0 ) )
                    {
                    // InternalMDML.g:829:2: ( ( rule__GUID__Group_1_1__0 ) )
                    // InternalMDML.g:830:3: ( rule__GUID__Group_1_1__0 )
                    {
                     before(grammarAccess.getGUIDAccess().getGroup_1_1()); 
                    // InternalMDML.g:831:3: ( rule__GUID__Group_1_1__0 )
                    // InternalMDML.g:831:4: rule__GUID__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GUID__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGUIDAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUID__Alternatives_1"


    // $ANTLR start "rule__RelationSource__Alternatives"
    // InternalMDML.g:839:1: rule__RelationSource__Alternatives : ( ( ruleDataModel ) | ( ruleDataClass ) | ( ruleDataElement ) | ( ruleDataType ) );
    public final void rule__RelationSource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:843:1: ( ( ruleDataModel ) | ( ruleDataClass ) | ( ruleDataElement ) | ( ruleDataType ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 41:
                {
                alt6=2;
                }
                break;
            case 42:
                {
                alt6=3;
                }
                break;
            case 37:
            case 39:
            case 40:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMDML.g:844:2: ( ruleDataModel )
                    {
                    // InternalMDML.g:844:2: ( ruleDataModel )
                    // InternalMDML.g:845:3: ruleDataModel
                    {
                     before(grammarAccess.getRelationSourceAccess().getDataModelParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataModel();

                    state._fsp--;

                     after(grammarAccess.getRelationSourceAccess().getDataModelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMDML.g:850:2: ( ruleDataClass )
                    {
                    // InternalMDML.g:850:2: ( ruleDataClass )
                    // InternalMDML.g:851:3: ruleDataClass
                    {
                     before(grammarAccess.getRelationSourceAccess().getDataClassParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDataClass();

                    state._fsp--;

                     after(grammarAccess.getRelationSourceAccess().getDataClassParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMDML.g:856:2: ( ruleDataElement )
                    {
                    // InternalMDML.g:856:2: ( ruleDataElement )
                    // InternalMDML.g:857:3: ruleDataElement
                    {
                     before(grammarAccess.getRelationSourceAccess().getDataElementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDataElement();

                    state._fsp--;

                     after(grammarAccess.getRelationSourceAccess().getDataElementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMDML.g:862:2: ( ruleDataType )
                    {
                    // InternalMDML.g:862:2: ( ruleDataType )
                    // InternalMDML.g:863:3: ruleDataType
                    {
                     before(grammarAccess.getRelationSourceAccess().getDataTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getRelationSourceAccess().getDataTypeParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationSource__Alternatives"


    // $ANTLR start "rule__RelationDestination__Alternatives"
    // InternalMDML.g:872:1: rule__RelationDestination__Alternatives : ( ( ruleDataModel ) | ( ruleDataClass ) | ( ruleDataElement ) | ( ruleDataType ) );
    public final void rule__RelationDestination__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:876:1: ( ( ruleDataModel ) | ( ruleDataClass ) | ( ruleDataElement ) | ( ruleDataType ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 41:
                {
                alt7=2;
                }
                break;
            case 42:
                {
                alt7=3;
                }
                break;
            case 37:
            case 39:
            case 40:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMDML.g:877:2: ( ruleDataModel )
                    {
                    // InternalMDML.g:877:2: ( ruleDataModel )
                    // InternalMDML.g:878:3: ruleDataModel
                    {
                     before(grammarAccess.getRelationDestinationAccess().getDataModelParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataModel();

                    state._fsp--;

                     after(grammarAccess.getRelationDestinationAccess().getDataModelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMDML.g:883:2: ( ruleDataClass )
                    {
                    // InternalMDML.g:883:2: ( ruleDataClass )
                    // InternalMDML.g:884:3: ruleDataClass
                    {
                     before(grammarAccess.getRelationDestinationAccess().getDataClassParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDataClass();

                    state._fsp--;

                     after(grammarAccess.getRelationDestinationAccess().getDataClassParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMDML.g:889:2: ( ruleDataElement )
                    {
                    // InternalMDML.g:889:2: ( ruleDataElement )
                    // InternalMDML.g:890:3: ruleDataElement
                    {
                     before(grammarAccess.getRelationDestinationAccess().getDataElementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDataElement();

                    state._fsp--;

                     after(grammarAccess.getRelationDestinationAccess().getDataElementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMDML.g:895:2: ( ruleDataType )
                    {
                    // InternalMDML.g:895:2: ( ruleDataType )
                    // InternalMDML.g:896:3: ruleDataType
                    {
                     before(grammarAccess.getRelationDestinationAccess().getDataTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getRelationDestinationAccess().getDataTypeParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDestination__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalMDML.g:905:1: rule__DataType__Alternatives : ( ( rulePrimitiveType ) | ( ruleReferenceType ) | ( ruleEnumeratedType ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:909:1: ( ( rulePrimitiveType ) | ( ruleReferenceType ) | ( ruleEnumeratedType ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt8=1;
                }
                break;
            case 39:
                {
                alt8=2;
                }
                break;
            case 37:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMDML.g:910:2: ( rulePrimitiveType )
                    {
                    // InternalMDML.g:910:2: ( rulePrimitiveType )
                    // InternalMDML.g:911:3: rulePrimitiveType
                    {
                     before(grammarAccess.getDataTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getPrimitiveTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMDML.g:916:2: ( ruleReferenceType )
                    {
                    // InternalMDML.g:916:2: ( ruleReferenceType )
                    // InternalMDML.g:917:3: ruleReferenceType
                    {
                     before(grammarAccess.getDataTypeAccess().getReferenceTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReferenceType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getReferenceTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMDML.g:922:2: ( ruleEnumeratedType )
                    {
                    // InternalMDML.g:922:2: ( ruleEnumeratedType )
                    // InternalMDML.g:923:3: ruleEnumeratedType
                    {
                     before(grammarAccess.getDataTypeAccess().getEnumeratedTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumeratedType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getEnumeratedTypeParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__Basic__TypenameAlternatives_0"
    // InternalMDML.g:932:1: rule__Basic__TypenameAlternatives_0 : ( ( 'STRING' ) | ( 'INT' ) | ( 'BOOLEAN' ) );
    public final void rule__Basic__TypenameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:936:1: ( ( 'STRING' ) | ( 'INT' ) | ( 'BOOLEAN' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt9=1;
                }
                break;
            case 12:
                {
                alt9=2;
                }
                break;
            case 13:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMDML.g:937:2: ( 'STRING' )
                    {
                    // InternalMDML.g:937:2: ( 'STRING' )
                    // InternalMDML.g:938:3: 'STRING'
                    {
                     before(grammarAccess.getBasicAccess().getTypenameSTRINGKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBasicAccess().getTypenameSTRINGKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMDML.g:943:2: ( 'INT' )
                    {
                    // InternalMDML.g:943:2: ( 'INT' )
                    // InternalMDML.g:944:3: 'INT'
                    {
                     before(grammarAccess.getBasicAccess().getTypenameINTKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBasicAccess().getTypenameINTKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMDML.g:949:2: ( 'BOOLEAN' )
                    {
                    // InternalMDML.g:949:2: ( 'BOOLEAN' )
                    // InternalMDML.g:950:3: 'BOOLEAN'
                    {
                     before(grammarAccess.getBasicAccess().getTypenameBOOLEANKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBasicAccess().getTypenameBOOLEANKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basic__TypenameAlternatives_0"


    // $ANTLR start "rule__ContainerElement__Alternatives"
    // InternalMDML.g:959:1: rule__ContainerElement__Alternatives : ( ( ruleDataClass ) | ( ruleDataElement ) | ( ruleReference ) );
    public final void rule__ContainerElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:963:1: ( ( ruleDataClass ) | ( ruleDataElement ) | ( ruleReference ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt10=1;
                }
                break;
            case 42:
                {
                alt10=2;
                }
                break;
            case 30:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMDML.g:964:2: ( ruleDataClass )
                    {
                    // InternalMDML.g:964:2: ( ruleDataClass )
                    // InternalMDML.g:965:3: ruleDataClass
                    {
                     before(grammarAccess.getContainerElementAccess().getDataClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataClass();

                    state._fsp--;

                     after(grammarAccess.getContainerElementAccess().getDataClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMDML.g:970:2: ( ruleDataElement )
                    {
                    // InternalMDML.g:970:2: ( ruleDataElement )
                    // InternalMDML.g:971:3: ruleDataElement
                    {
                     before(grammarAccess.getContainerElementAccess().getDataElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDataElement();

                    state._fsp--;

                     after(grammarAccess.getContainerElementAccess().getDataElementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMDML.g:976:2: ( ruleReference )
                    {
                    // InternalMDML.g:976:2: ( ruleReference )
                    // InternalMDML.g:977:3: ruleReference
                    {
                     before(grammarAccess.getContainerElementAccess().getReferenceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getContainerElementAccess().getReferenceParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElement__Alternatives"


    // $ANTLR start "rule__Status__Alternatives"
    // InternalMDML.g:986:1: rule__Status__Alternatives : ( ( 'draft' ) | ( 'finalized' ) | ( 'superceded' ) );
    public final void rule__Status__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:990:1: ( ( 'draft' ) | ( 'finalized' ) | ( 'superceded' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt11=1;
                }
                break;
            case 15:
                {
                alt11=2;
                }
                break;
            case 16:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMDML.g:991:2: ( 'draft' )
                    {
                    // InternalMDML.g:991:2: ( 'draft' )
                    // InternalMDML.g:992:3: 'draft'
                    {
                     before(grammarAccess.getStatusAccess().getDraftKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getStatusAccess().getDraftKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMDML.g:997:2: ( 'finalized' )
                    {
                    // InternalMDML.g:997:2: ( 'finalized' )
                    // InternalMDML.g:998:3: 'finalized'
                    {
                     before(grammarAccess.getStatusAccess().getFinalizedKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getStatusAccess().getFinalizedKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMDML.g:1003:2: ( 'superceded' )
                    {
                    // InternalMDML.g:1003:2: ( 'superceded' )
                    // InternalMDML.g:1004:3: 'superceded'
                    {
                     before(grammarAccess.getStatusAccess().getSupercededKeyword_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getStatusAccess().getSupercededKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__Alternatives"


    // $ANTLR start "rule__DataModel__Group__0"
    // InternalMDML.g:1013:1: rule__DataModel__Group__0 : rule__DataModel__Group__0__Impl rule__DataModel__Group__1 ;
    public final void rule__DataModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1017:1: ( rule__DataModel__Group__0__Impl rule__DataModel__Group__1 )
            // InternalMDML.g:1018:2: rule__DataModel__Group__0__Impl rule__DataModel__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__0"


    // $ANTLR start "rule__DataModel__Group__0__Impl"
    // InternalMDML.g:1025:1: rule__DataModel__Group__0__Impl : ( 'DataModel' ) ;
    public final void rule__DataModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1029:1: ( ( 'DataModel' ) )
            // InternalMDML.g:1030:1: ( 'DataModel' )
            {
            // InternalMDML.g:1030:1: ( 'DataModel' )
            // InternalMDML.g:1031:2: 'DataModel'
            {
             before(grammarAccess.getDataModelAccess().getDataModelKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getDataModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__0__Impl"


    // $ANTLR start "rule__DataModel__Group__1"
    // InternalMDML.g:1040:1: rule__DataModel__Group__1 : rule__DataModel__Group__1__Impl rule__DataModel__Group__2 ;
    public final void rule__DataModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1044:1: ( rule__DataModel__Group__1__Impl rule__DataModel__Group__2 )
            // InternalMDML.g:1045:2: rule__DataModel__Group__1__Impl rule__DataModel__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DataModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__1"


    // $ANTLR start "rule__DataModel__Group__1__Impl"
    // InternalMDML.g:1052:1: rule__DataModel__Group__1__Impl : ( ( rule__DataModel__NameAssignment_1 ) ) ;
    public final void rule__DataModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1056:1: ( ( ( rule__DataModel__NameAssignment_1 ) ) )
            // InternalMDML.g:1057:1: ( ( rule__DataModel__NameAssignment_1 ) )
            {
            // InternalMDML.g:1057:1: ( ( rule__DataModel__NameAssignment_1 ) )
            // InternalMDML.g:1058:2: ( rule__DataModel__NameAssignment_1 )
            {
             before(grammarAccess.getDataModelAccess().getNameAssignment_1()); 
            // InternalMDML.g:1059:2: ( rule__DataModel__NameAssignment_1 )
            // InternalMDML.g:1059:3: rule__DataModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__1__Impl"


    // $ANTLR start "rule__DataModel__Group__2"
    // InternalMDML.g:1067:1: rule__DataModel__Group__2 : rule__DataModel__Group__2__Impl rule__DataModel__Group__3 ;
    public final void rule__DataModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1071:1: ( rule__DataModel__Group__2__Impl rule__DataModel__Group__3 )
            // InternalMDML.g:1072:2: rule__DataModel__Group__2__Impl rule__DataModel__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DataModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__2"


    // $ANTLR start "rule__DataModel__Group__2__Impl"
    // InternalMDML.g:1079:1: rule__DataModel__Group__2__Impl : ( 'status:' ) ;
    public final void rule__DataModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1083:1: ( ( 'status:' ) )
            // InternalMDML.g:1084:1: ( 'status:' )
            {
            // InternalMDML.g:1084:1: ( 'status:' )
            // InternalMDML.g:1085:2: 'status:'
            {
             before(grammarAccess.getDataModelAccess().getStatusKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getStatusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__2__Impl"


    // $ANTLR start "rule__DataModel__Group__3"
    // InternalMDML.g:1094:1: rule__DataModel__Group__3 : rule__DataModel__Group__3__Impl rule__DataModel__Group__4 ;
    public final void rule__DataModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1098:1: ( rule__DataModel__Group__3__Impl rule__DataModel__Group__4 )
            // InternalMDML.g:1099:2: rule__DataModel__Group__3__Impl rule__DataModel__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__DataModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__3"


    // $ANTLR start "rule__DataModel__Group__3__Impl"
    // InternalMDML.g:1106:1: rule__DataModel__Group__3__Impl : ( ( rule__DataModel__StatusAssignment_3 ) ) ;
    public final void rule__DataModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1110:1: ( ( ( rule__DataModel__StatusAssignment_3 ) ) )
            // InternalMDML.g:1111:1: ( ( rule__DataModel__StatusAssignment_3 ) )
            {
            // InternalMDML.g:1111:1: ( ( rule__DataModel__StatusAssignment_3 ) )
            // InternalMDML.g:1112:2: ( rule__DataModel__StatusAssignment_3 )
            {
             before(grammarAccess.getDataModelAccess().getStatusAssignment_3()); 
            // InternalMDML.g:1113:2: ( rule__DataModel__StatusAssignment_3 )
            // InternalMDML.g:1113:3: rule__DataModel__StatusAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__StatusAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getStatusAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__3__Impl"


    // $ANTLR start "rule__DataModel__Group__4"
    // InternalMDML.g:1121:1: rule__DataModel__Group__4 : rule__DataModel__Group__4__Impl rule__DataModel__Group__5 ;
    public final void rule__DataModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1125:1: ( rule__DataModel__Group__4__Impl rule__DataModel__Group__5 )
            // InternalMDML.g:1126:2: rule__DataModel__Group__4__Impl rule__DataModel__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__DataModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__4"


    // $ANTLR start "rule__DataModel__Group__4__Impl"
    // InternalMDML.g:1133:1: rule__DataModel__Group__4__Impl : ( 'domainid:' ) ;
    public final void rule__DataModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1137:1: ( ( 'domainid:' ) )
            // InternalMDML.g:1138:1: ( 'domainid:' )
            {
            // InternalMDML.g:1138:1: ( 'domainid:' )
            // InternalMDML.g:1139:2: 'domainid:'
            {
             before(grammarAccess.getDataModelAccess().getDomainidKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getDomainidKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__4__Impl"


    // $ANTLR start "rule__DataModel__Group__5"
    // InternalMDML.g:1148:1: rule__DataModel__Group__5 : rule__DataModel__Group__5__Impl rule__DataModel__Group__6 ;
    public final void rule__DataModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1152:1: ( rule__DataModel__Group__5__Impl rule__DataModel__Group__6 )
            // InternalMDML.g:1153:2: rule__DataModel__Group__5__Impl rule__DataModel__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__DataModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__5"


    // $ANTLR start "rule__DataModel__Group__5__Impl"
    // InternalMDML.g:1160:1: rule__DataModel__Group__5__Impl : ( ( rule__DataModel__GuidAssignment_5 ) ) ;
    public final void rule__DataModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1164:1: ( ( ( rule__DataModel__GuidAssignment_5 ) ) )
            // InternalMDML.g:1165:1: ( ( rule__DataModel__GuidAssignment_5 ) )
            {
            // InternalMDML.g:1165:1: ( ( rule__DataModel__GuidAssignment_5 ) )
            // InternalMDML.g:1166:2: ( rule__DataModel__GuidAssignment_5 )
            {
             before(grammarAccess.getDataModelAccess().getGuidAssignment_5()); 
            // InternalMDML.g:1167:2: ( rule__DataModel__GuidAssignment_5 )
            // InternalMDML.g:1167:3: rule__DataModel__GuidAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__GuidAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getGuidAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__5__Impl"


    // $ANTLR start "rule__DataModel__Group__6"
    // InternalMDML.g:1175:1: rule__DataModel__Group__6 : rule__DataModel__Group__6__Impl rule__DataModel__Group__7 ;
    public final void rule__DataModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1179:1: ( rule__DataModel__Group__6__Impl rule__DataModel__Group__7 )
            // InternalMDML.g:1180:2: rule__DataModel__Group__6__Impl rule__DataModel__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__DataModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__6"


    // $ANTLR start "rule__DataModel__Group__6__Impl"
    // InternalMDML.g:1187:1: rule__DataModel__Group__6__Impl : ( '@' ) ;
    public final void rule__DataModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1191:1: ( ( '@' ) )
            // InternalMDML.g:1192:1: ( '@' )
            {
            // InternalMDML.g:1192:1: ( '@' )
            // InternalMDML.g:1193:2: '@'
            {
             before(grammarAccess.getDataModelAccess().getCommercialAtKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getCommercialAtKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__6__Impl"


    // $ANTLR start "rule__DataModel__Group__7"
    // InternalMDML.g:1202:1: rule__DataModel__Group__7 : rule__DataModel__Group__7__Impl rule__DataModel__Group__8 ;
    public final void rule__DataModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1206:1: ( rule__DataModel__Group__7__Impl rule__DataModel__Group__8 )
            // InternalMDML.g:1207:2: rule__DataModel__Group__7__Impl rule__DataModel__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__DataModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__7"


    // $ANTLR start "rule__DataModel__Group__7__Impl"
    // InternalMDML.g:1214:1: rule__DataModel__Group__7__Impl : ( '(' ) ;
    public final void rule__DataModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1218:1: ( ( '(' ) )
            // InternalMDML.g:1219:1: ( '(' )
            {
            // InternalMDML.g:1219:1: ( '(' )
            // InternalMDML.g:1220:2: '('
            {
             before(grammarAccess.getDataModelAccess().getLeftParenthesisKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getLeftParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__7__Impl"


    // $ANTLR start "rule__DataModel__Group__8"
    // InternalMDML.g:1229:1: rule__DataModel__Group__8 : rule__DataModel__Group__8__Impl rule__DataModel__Group__9 ;
    public final void rule__DataModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1233:1: ( rule__DataModel__Group__8__Impl rule__DataModel__Group__9 )
            // InternalMDML.g:1234:2: rule__DataModel__Group__8__Impl rule__DataModel__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__DataModel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__8"


    // $ANTLR start "rule__DataModel__Group__8__Impl"
    // InternalMDML.g:1241:1: rule__DataModel__Group__8__Impl : ( ruleVersion ) ;
    public final void rule__DataModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1245:1: ( ( ruleVersion ) )
            // InternalMDML.g:1246:1: ( ruleVersion )
            {
            // InternalMDML.g:1246:1: ( ruleVersion )
            // InternalMDML.g:1247:2: ruleVersion
            {
             before(grammarAccess.getDataModelAccess().getVersionParserRuleCall_8()); 
            pushFollow(FOLLOW_2);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getVersionParserRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__8__Impl"


    // $ANTLR start "rule__DataModel__Group__9"
    // InternalMDML.g:1256:1: rule__DataModel__Group__9 : rule__DataModel__Group__9__Impl rule__DataModel__Group__10 ;
    public final void rule__DataModel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1260:1: ( rule__DataModel__Group__9__Impl rule__DataModel__Group__10 )
            // InternalMDML.g:1261:2: rule__DataModel__Group__9__Impl rule__DataModel__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__DataModel__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__9"


    // $ANTLR start "rule__DataModel__Group__9__Impl"
    // InternalMDML.g:1268:1: rule__DataModel__Group__9__Impl : ( ')' ) ;
    public final void rule__DataModel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1272:1: ( ( ')' ) )
            // InternalMDML.g:1273:1: ( ')' )
            {
            // InternalMDML.g:1273:1: ( ')' )
            // InternalMDML.g:1274:2: ')'
            {
             before(grammarAccess.getDataModelAccess().getRightParenthesisKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__9__Impl"


    // $ANTLR start "rule__DataModel__Group__10"
    // InternalMDML.g:1283:1: rule__DataModel__Group__10 : rule__DataModel__Group__10__Impl rule__DataModel__Group__11 ;
    public final void rule__DataModel__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1287:1: ( rule__DataModel__Group__10__Impl rule__DataModel__Group__11 )
            // InternalMDML.g:1288:2: rule__DataModel__Group__10__Impl rule__DataModel__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__DataModel__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__10"


    // $ANTLR start "rule__DataModel__Group__10__Impl"
    // InternalMDML.g:1295:1: rule__DataModel__Group__10__Impl : ( ( rule__DataModel__RefinesAssignment_10 ) ) ;
    public final void rule__DataModel__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1299:1: ( ( ( rule__DataModel__RefinesAssignment_10 ) ) )
            // InternalMDML.g:1300:1: ( ( rule__DataModel__RefinesAssignment_10 ) )
            {
            // InternalMDML.g:1300:1: ( ( rule__DataModel__RefinesAssignment_10 ) )
            // InternalMDML.g:1301:2: ( rule__DataModel__RefinesAssignment_10 )
            {
             before(grammarAccess.getDataModelAccess().getRefinesAssignment_10()); 
            // InternalMDML.g:1302:2: ( rule__DataModel__RefinesAssignment_10 )
            // InternalMDML.g:1302:3: rule__DataModel__RefinesAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__RefinesAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getRefinesAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__10__Impl"


    // $ANTLR start "rule__DataModel__Group__11"
    // InternalMDML.g:1310:1: rule__DataModel__Group__11 : rule__DataModel__Group__11__Impl rule__DataModel__Group__12 ;
    public final void rule__DataModel__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1314:1: ( rule__DataModel__Group__11__Impl rule__DataModel__Group__12 )
            // InternalMDML.g:1315:2: rule__DataModel__Group__11__Impl rule__DataModel__Group__12
            {
            pushFollow(FOLLOW_14);
            rule__DataModel__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__11"


    // $ANTLR start "rule__DataModel__Group__11__Impl"
    // InternalMDML.g:1322:1: rule__DataModel__Group__11__Impl : ( '{' ) ;
    public final void rule__DataModel__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1326:1: ( ( '{' ) )
            // InternalMDML.g:1327:1: ( '{' )
            {
            // InternalMDML.g:1327:1: ( '{' )
            // InternalMDML.g:1328:2: '{'
            {
             before(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__11__Impl"


    // $ANTLR start "rule__DataModel__Group__12"
    // InternalMDML.g:1337:1: rule__DataModel__Group__12 : rule__DataModel__Group__12__Impl rule__DataModel__Group__13 ;
    public final void rule__DataModel__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1341:1: ( rule__DataModel__Group__12__Impl rule__DataModel__Group__13 )
            // InternalMDML.g:1342:2: rule__DataModel__Group__12__Impl rule__DataModel__Group__13
            {
            pushFollow(FOLLOW_14);
            rule__DataModel__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__12"


    // $ANTLR start "rule__DataModel__Group__12__Impl"
    // InternalMDML.g:1349:1: rule__DataModel__Group__12__Impl : ( ( rule__DataModel__ElementsAssignment_12 )* ) ;
    public final void rule__DataModel__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1353:1: ( ( ( rule__DataModel__ElementsAssignment_12 )* ) )
            // InternalMDML.g:1354:1: ( ( rule__DataModel__ElementsAssignment_12 )* )
            {
            // InternalMDML.g:1354:1: ( ( rule__DataModel__ElementsAssignment_12 )* )
            // InternalMDML.g:1355:2: ( rule__DataModel__ElementsAssignment_12 )*
            {
             before(grammarAccess.getDataModelAccess().getElementsAssignment_12()); 
            // InternalMDML.g:1356:2: ( rule__DataModel__ElementsAssignment_12 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17||LA12_0==32||LA12_0==35||LA12_0==37||(LA12_0>=39 && LA12_0<=42)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMDML.g:1356:3: rule__DataModel__ElementsAssignment_12
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__DataModel__ElementsAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getElementsAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__12__Impl"


    // $ANTLR start "rule__DataModel__Group__13"
    // InternalMDML.g:1364:1: rule__DataModel__Group__13 : rule__DataModel__Group__13__Impl rule__DataModel__Group__14 ;
    public final void rule__DataModel__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1368:1: ( rule__DataModel__Group__13__Impl rule__DataModel__Group__14 )
            // InternalMDML.g:1369:2: rule__DataModel__Group__13__Impl rule__DataModel__Group__14
            {
            pushFollow(FOLLOW_14);
            rule__DataModel__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__13"


    // $ANTLR start "rule__DataModel__Group__13__Impl"
    // InternalMDML.g:1376:1: rule__DataModel__Group__13__Impl : ( ( rule__DataModel__RelationsAssignment_13 )* ) ;
    public final void rule__DataModel__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1380:1: ( ( ( rule__DataModel__RelationsAssignment_13 )* ) )
            // InternalMDML.g:1381:1: ( ( rule__DataModel__RelationsAssignment_13 )* )
            {
            // InternalMDML.g:1381:1: ( ( rule__DataModel__RelationsAssignment_13 )* )
            // InternalMDML.g:1382:2: ( rule__DataModel__RelationsAssignment_13 )*
            {
             before(grammarAccess.getDataModelAccess().getRelationsAssignment_13()); 
            // InternalMDML.g:1383:2: ( rule__DataModel__RelationsAssignment_13 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMDML.g:1383:3: rule__DataModel__RelationsAssignment_13
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__DataModel__RelationsAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getRelationsAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__13__Impl"


    // $ANTLR start "rule__DataModel__Group__14"
    // InternalMDML.g:1391:1: rule__DataModel__Group__14 : rule__DataModel__Group__14__Impl rule__DataModel__Group__15 ;
    public final void rule__DataModel__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1395:1: ( rule__DataModel__Group__14__Impl rule__DataModel__Group__15 )
            // InternalMDML.g:1396:2: rule__DataModel__Group__14__Impl rule__DataModel__Group__15
            {
            pushFollow(FOLLOW_14);
            rule__DataModel__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__14"


    // $ANTLR start "rule__DataModel__Group__14__Impl"
    // InternalMDML.g:1403:1: rule__DataModel__Group__14__Impl : ( ( rule__DataModel__ConstraintAssignment_14 )* ) ;
    public final void rule__DataModel__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1407:1: ( ( ( rule__DataModel__ConstraintAssignment_14 )* ) )
            // InternalMDML.g:1408:1: ( ( rule__DataModel__ConstraintAssignment_14 )* )
            {
            // InternalMDML.g:1408:1: ( ( rule__DataModel__ConstraintAssignment_14 )* )
            // InternalMDML.g:1409:2: ( rule__DataModel__ConstraintAssignment_14 )*
            {
             before(grammarAccess.getDataModelAccess().getConstraintAssignment_14()); 
            // InternalMDML.g:1410:2: ( rule__DataModel__ConstraintAssignment_14 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==43) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMDML.g:1410:3: rule__DataModel__ConstraintAssignment_14
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__DataModel__ConstraintAssignment_14();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getConstraintAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__14__Impl"


    // $ANTLR start "rule__DataModel__Group__15"
    // InternalMDML.g:1418:1: rule__DataModel__Group__15 : rule__DataModel__Group__15__Impl rule__DataModel__Group__16 ;
    public final void rule__DataModel__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1422:1: ( rule__DataModel__Group__15__Impl rule__DataModel__Group__16 )
            // InternalMDML.g:1423:2: rule__DataModel__Group__15__Impl rule__DataModel__Group__16
            {
            pushFollow(FOLLOW_14);
            rule__DataModel__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__15"


    // $ANTLR start "rule__DataModel__Group__15__Impl"
    // InternalMDML.g:1430:1: rule__DataModel__Group__15__Impl : ( ( rule__DataModel__PredicateAssignment_15 )* ) ;
    public final void rule__DataModel__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1434:1: ( ( ( rule__DataModel__PredicateAssignment_15 )* ) )
            // InternalMDML.g:1435:1: ( ( rule__DataModel__PredicateAssignment_15 )* )
            {
            // InternalMDML.g:1435:1: ( ( rule__DataModel__PredicateAssignment_15 )* )
            // InternalMDML.g:1436:2: ( rule__DataModel__PredicateAssignment_15 )*
            {
             before(grammarAccess.getDataModelAccess().getPredicateAssignment_15()); 
            // InternalMDML.g:1437:2: ( rule__DataModel__PredicateAssignment_15 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==44) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMDML.g:1437:3: rule__DataModel__PredicateAssignment_15
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__DataModel__PredicateAssignment_15();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getPredicateAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__15__Impl"


    // $ANTLR start "rule__DataModel__Group__16"
    // InternalMDML.g:1445:1: rule__DataModel__Group__16 : rule__DataModel__Group__16__Impl ;
    public final void rule__DataModel__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1449:1: ( rule__DataModel__Group__16__Impl )
            // InternalMDML.g:1450:2: rule__DataModel__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__16"


    // $ANTLR start "rule__DataModel__Group__16__Impl"
    // InternalMDML.g:1456:1: rule__DataModel__Group__16__Impl : ( '}' ) ;
    public final void rule__DataModel__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1460:1: ( ( '}' ) )
            // InternalMDML.g:1461:1: ( '}' )
            {
            // InternalMDML.g:1461:1: ( '}' )
            // InternalMDML.g:1462:2: '}'
            {
             before(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_16()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__16__Impl"


    // $ANTLR start "rule__REFINES__Group__0"
    // InternalMDML.g:1472:1: rule__REFINES__Group__0 : rule__REFINES__Group__0__Impl rule__REFINES__Group__1 ;
    public final void rule__REFINES__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1476:1: ( rule__REFINES__Group__0__Impl rule__REFINES__Group__1 )
            // InternalMDML.g:1477:2: rule__REFINES__Group__0__Impl rule__REFINES__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__REFINES__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REFINES__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REFINES__Group__0"


    // $ANTLR start "rule__REFINES__Group__0__Impl"
    // InternalMDML.g:1484:1: rule__REFINES__Group__0__Impl : ( 'refines' ) ;
    public final void rule__REFINES__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1488:1: ( ( 'refines' ) )
            // InternalMDML.g:1489:1: ( 'refines' )
            {
            // InternalMDML.g:1489:1: ( 'refines' )
            // InternalMDML.g:1490:2: 'refines'
            {
             before(grammarAccess.getREFINESAccess().getRefinesKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getREFINESAccess().getRefinesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REFINES__Group__0__Impl"


    // $ANTLR start "rule__REFINES__Group__1"
    // InternalMDML.g:1499:1: rule__REFINES__Group__1 : rule__REFINES__Group__1__Impl rule__REFINES__Group__2 ;
    public final void rule__REFINES__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1503:1: ( rule__REFINES__Group__1__Impl rule__REFINES__Group__2 )
            // InternalMDML.g:1504:2: rule__REFINES__Group__1__Impl rule__REFINES__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__REFINES__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REFINES__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REFINES__Group__1"


    // $ANTLR start "rule__REFINES__Group__1__Impl"
    // InternalMDML.g:1511:1: rule__REFINES__Group__1__Impl : ( ':' ) ;
    public final void rule__REFINES__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1515:1: ( ( ':' ) )
            // InternalMDML.g:1516:1: ( ':' )
            {
            // InternalMDML.g:1516:1: ( ':' )
            // InternalMDML.g:1517:2: ':'
            {
             before(grammarAccess.getREFINESAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getREFINESAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REFINES__Group__1__Impl"


    // $ANTLR start "rule__REFINES__Group__2"
    // InternalMDML.g:1526:1: rule__REFINES__Group__2 : rule__REFINES__Group__2__Impl ;
    public final void rule__REFINES__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1530:1: ( rule__REFINES__Group__2__Impl )
            // InternalMDML.g:1531:2: rule__REFINES__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__REFINES__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REFINES__Group__2"


    // $ANTLR start "rule__REFINES__Group__2__Impl"
    // InternalMDML.g:1537:1: rule__REFINES__Group__2__Impl : ( rulePath ) ;
    public final void rule__REFINES__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1541:1: ( ( rulePath ) )
            // InternalMDML.g:1542:1: ( rulePath )
            {
            // InternalMDML.g:1542:1: ( rulePath )
            // InternalMDML.g:1543:2: rulePath
            {
             before(grammarAccess.getREFINESAccess().getPathParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;

             after(grammarAccess.getREFINESAccess().getPathParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REFINES__Group__2__Impl"


    // $ANTLR start "rule__DOESNOTREFINE__Group__0"
    // InternalMDML.g:1553:1: rule__DOESNOTREFINE__Group__0 : rule__DOESNOTREFINE__Group__0__Impl rule__DOESNOTREFINE__Group__1 ;
    public final void rule__DOESNOTREFINE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1557:1: ( rule__DOESNOTREFINE__Group__0__Impl rule__DOESNOTREFINE__Group__1 )
            // InternalMDML.g:1558:2: rule__DOESNOTREFINE__Group__0__Impl rule__DOESNOTREFINE__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__DOESNOTREFINE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOESNOTREFINE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOESNOTREFINE__Group__0"


    // $ANTLR start "rule__DOESNOTREFINE__Group__0__Impl"
    // InternalMDML.g:1565:1: rule__DOESNOTREFINE__Group__0__Impl : ( 'doesnotrefine' ) ;
    public final void rule__DOESNOTREFINE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1569:1: ( ( 'doesnotrefine' ) )
            // InternalMDML.g:1570:1: ( 'doesnotrefine' )
            {
            // InternalMDML.g:1570:1: ( 'doesnotrefine' )
            // InternalMDML.g:1571:2: 'doesnotrefine'
            {
             before(grammarAccess.getDOESNOTREFINEAccess().getDoesnotrefineKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDOESNOTREFINEAccess().getDoesnotrefineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOESNOTREFINE__Group__0__Impl"


    // $ANTLR start "rule__DOESNOTREFINE__Group__1"
    // InternalMDML.g:1580:1: rule__DOESNOTREFINE__Group__1 : rule__DOESNOTREFINE__Group__1__Impl rule__DOESNOTREFINE__Group__2 ;
    public final void rule__DOESNOTREFINE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1584:1: ( rule__DOESNOTREFINE__Group__1__Impl rule__DOESNOTREFINE__Group__2 )
            // InternalMDML.g:1585:2: rule__DOESNOTREFINE__Group__1__Impl rule__DOESNOTREFINE__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DOESNOTREFINE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOESNOTREFINE__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOESNOTREFINE__Group__1"


    // $ANTLR start "rule__DOESNOTREFINE__Group__1__Impl"
    // InternalMDML.g:1592:1: rule__DOESNOTREFINE__Group__1__Impl : ( ':' ) ;
    public final void rule__DOESNOTREFINE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1596:1: ( ( ':' ) )
            // InternalMDML.g:1597:1: ( ':' )
            {
            // InternalMDML.g:1597:1: ( ':' )
            // InternalMDML.g:1598:2: ':'
            {
             before(grammarAccess.getDOESNOTREFINEAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDOESNOTREFINEAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOESNOTREFINE__Group__1__Impl"


    // $ANTLR start "rule__DOESNOTREFINE__Group__2"
    // InternalMDML.g:1607:1: rule__DOESNOTREFINE__Group__2 : rule__DOESNOTREFINE__Group__2__Impl ;
    public final void rule__DOESNOTREFINE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1611:1: ( rule__DOESNOTREFINE__Group__2__Impl )
            // InternalMDML.g:1612:2: rule__DOESNOTREFINE__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOESNOTREFINE__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOESNOTREFINE__Group__2"


    // $ANTLR start "rule__DOESNOTREFINE__Group__2__Impl"
    // InternalMDML.g:1618:1: rule__DOESNOTREFINE__Group__2__Impl : ( rulePath ) ;
    public final void rule__DOESNOTREFINE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1622:1: ( ( rulePath ) )
            // InternalMDML.g:1623:1: ( rulePath )
            {
            // InternalMDML.g:1623:1: ( rulePath )
            // InternalMDML.g:1624:2: rulePath
            {
             before(grammarAccess.getDOESNOTREFINEAccess().getPathParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;

             after(grammarAccess.getDOESNOTREFINEAccess().getPathParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOESNOTREFINE__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalMDML.g:1634:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1638:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalMDML.g:1639:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalMDML.g:1646:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1650:1: ( ( RULE_ID ) )
            // InternalMDML.g:1651:1: ( RULE_ID )
            {
            // InternalMDML.g:1651:1: ( RULE_ID )
            // InternalMDML.g:1652:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalMDML.g:1661:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1665:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalMDML.g:1666:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalMDML.g:1672:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1676:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalMDML.g:1677:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalMDML.g:1677:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalMDML.g:1678:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalMDML.g:1679:2: ( rule__QualifiedName__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMDML.g:1679:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalMDML.g:1688:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1692:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalMDML.g:1693:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalMDML.g:1700:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1704:1: ( ( '.' ) )
            // InternalMDML.g:1705:1: ( '.' )
            {
            // InternalMDML.g:1705:1: ( '.' )
            // InternalMDML.g:1706:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalMDML.g:1715:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1719:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalMDML.g:1720:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalMDML.g:1726:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1730:1: ( ( RULE_ID ) )
            // InternalMDML.g:1731:1: ( RULE_ID )
            {
            // InternalMDML.g:1731:1: ( RULE_ID )
            // InternalMDML.g:1732:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Path__Group__0"
    // InternalMDML.g:1742:1: rule__Path__Group__0 : rule__Path__Group__0__Impl rule__Path__Group__1 ;
    public final void rule__Path__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1746:1: ( rule__Path__Group__0__Impl rule__Path__Group__1 )
            // InternalMDML.g:1747:2: rule__Path__Group__0__Impl rule__Path__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Path__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Path__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__0"


    // $ANTLR start "rule__Path__Group__0__Impl"
    // InternalMDML.g:1754:1: rule__Path__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__Path__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1758:1: ( ( ruleQualifiedName ) )
            // InternalMDML.g:1759:1: ( ruleQualifiedName )
            {
            // InternalMDML.g:1759:1: ( ruleQualifiedName )
            // InternalMDML.g:1760:2: ruleQualifiedName
            {
             before(grammarAccess.getPathAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPathAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__0__Impl"


    // $ANTLR start "rule__Path__Group__1"
    // InternalMDML.g:1769:1: rule__Path__Group__1 : rule__Path__Group__1__Impl ;
    public final void rule__Path__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1773:1: ( rule__Path__Group__1__Impl )
            // InternalMDML.g:1774:2: rule__Path__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Path__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__1"


    // $ANTLR start "rule__Path__Group__1__Impl"
    // InternalMDML.g:1780:1: rule__Path__Group__1__Impl : ( ( rule__Path__Group_1__0 )* ) ;
    public final void rule__Path__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1784:1: ( ( ( rule__Path__Group_1__0 )* ) )
            // InternalMDML.g:1785:1: ( ( rule__Path__Group_1__0 )* )
            {
            // InternalMDML.g:1785:1: ( ( rule__Path__Group_1__0 )* )
            // InternalMDML.g:1786:2: ( rule__Path__Group_1__0 )*
            {
             before(grammarAccess.getPathAccess().getGroup_1()); 
            // InternalMDML.g:1787:2: ( rule__Path__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMDML.g:1787:3: rule__Path__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Path__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getPathAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__1__Impl"


    // $ANTLR start "rule__Path__Group_1__0"
    // InternalMDML.g:1796:1: rule__Path__Group_1__0 : rule__Path__Group_1__0__Impl rule__Path__Group_1__1 ;
    public final void rule__Path__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1800:1: ( rule__Path__Group_1__0__Impl rule__Path__Group_1__1 )
            // InternalMDML.g:1801:2: rule__Path__Group_1__0__Impl rule__Path__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Path__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Path__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_1__0"


    // $ANTLR start "rule__Path__Group_1__0__Impl"
    // InternalMDML.g:1808:1: rule__Path__Group_1__0__Impl : ( '/' ) ;
    public final void rule__Path__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1812:1: ( ( '/' ) )
            // InternalMDML.g:1813:1: ( '/' )
            {
            // InternalMDML.g:1813:1: ( '/' )
            // InternalMDML.g:1814:2: '/'
            {
             before(grammarAccess.getPathAccess().getSolidusKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPathAccess().getSolidusKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_1__0__Impl"


    // $ANTLR start "rule__Path__Group_1__1"
    // InternalMDML.g:1823:1: rule__Path__Group_1__1 : rule__Path__Group_1__1__Impl ;
    public final void rule__Path__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1827:1: ( rule__Path__Group_1__1__Impl )
            // InternalMDML.g:1828:2: rule__Path__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Path__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_1__1"


    // $ANTLR start "rule__Path__Group_1__1__Impl"
    // InternalMDML.g:1834:1: rule__Path__Group_1__1__Impl : ( ruleQualifiedName ) ;
    public final void rule__Path__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1838:1: ( ( ruleQualifiedName ) )
            // InternalMDML.g:1839:1: ( ruleQualifiedName )
            {
            // InternalMDML.g:1839:1: ( ruleQualifiedName )
            // InternalMDML.g:1840:2: ruleQualifiedName
            {
             before(grammarAccess.getPathAccess().getQualifiedNameParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPathAccess().getQualifiedNameParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_1__1__Impl"


    // $ANTLR start "rule__GUID__Group__0"
    // InternalMDML.g:1850:1: rule__GUID__Group__0 : rule__GUID__Group__0__Impl rule__GUID__Group__1 ;
    public final void rule__GUID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1854:1: ( rule__GUID__Group__0__Impl rule__GUID__Group__1 )
            // InternalMDML.g:1855:2: rule__GUID__Group__0__Impl rule__GUID__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__GUID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GUID__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUID__Group__0"


    // $ANTLR start "rule__GUID__Group__0__Impl"
    // InternalMDML.g:1862:1: rule__GUID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__GUID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1866:1: ( ( RULE_ID ) )
            // InternalMDML.g:1867:1: ( RULE_ID )
            {
            // InternalMDML.g:1867:1: ( RULE_ID )
            // InternalMDML.g:1868:2: RULE_ID
            {
             before(grammarAccess.getGUIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGUIDAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUID__Group__0__Impl"


    // $ANTLR start "rule__GUID__Group__1"
    // InternalMDML.g:1877:1: rule__GUID__Group__1 : rule__GUID__Group__1__Impl ;
    public final void rule__GUID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1881:1: ( rule__GUID__Group__1__Impl )
            // InternalMDML.g:1882:2: rule__GUID__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GUID__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUID__Group__1"


    // $ANTLR start "rule__GUID__Group__1__Impl"
    // InternalMDML.g:1888:1: rule__GUID__Group__1__Impl : ( ( rule__GUID__Alternatives_1 )* ) ;
    public final void rule__GUID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1892:1: ( ( ( rule__GUID__Alternatives_1 )* ) )
            // InternalMDML.g:1893:1: ( ( rule__GUID__Alternatives_1 )* )
            {
            // InternalMDML.g:1893:1: ( ( rule__GUID__Alternatives_1 )* )
            // InternalMDML.g:1894:2: ( rule__GUID__Alternatives_1 )*
            {
             before(grammarAccess.getGUIDAccess().getAlternatives_1()); 
            // InternalMDML.g:1895:2: ( rule__GUID__Alternatives_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=28 && LA18_0<=29)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMDML.g:1895:3: rule__GUID__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__GUID__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getGUIDAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUID__Group__1__Impl"


    // $ANTLR start "rule__GUID__Group_1_0__0"
    // InternalMDML.g:1904:1: rule__GUID__Group_1_0__0 : rule__GUID__Group_1_0__0__Impl rule__GUID__Group_1_0__1 ;
    public final void rule__GUID__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1908:1: ( rule__GUID__Group_1_0__0__Impl rule__GUID__Group_1_0__1 )
            // InternalMDML.g:1909:2: rule__GUID__Group_1_0__0__Impl rule__GUID__Group_1_0__1
            {
            pushFollow(FOLLOW_4);
            rule__GUID__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GUID__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUID__Group_1_0__0"


    // $ANTLR start "rule__GUID__Group_1_0__0__Impl"
    // InternalMDML.g:1916:1: rule__GUID__Group_1_0__0__Impl : ( '.' ) ;
    public final void rule__GUID__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1920:1: ( ( '.' ) )
            // InternalMDML.g:1921:1: ( '.' )
            {
            // InternalMDML.g:1921:1: ( '.' )
            // InternalMDML.g:1922:2: '.'
            {
             before(grammarAccess.getGUIDAccess().getFullStopKeyword_1_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGUIDAccess().getFullStopKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUID__Group_1_0__0__Impl"


    // $ANTLR start "rule__GUID__Group_1_0__1"
    // InternalMDML.g:1931:1: rule__GUID__Group_1_0__1 : rule__GUID__Group_1_0__1__Impl ;
    public final void rule__GUID__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1935:1: ( rule__GUID__Group_1_0__1__Impl )
            // InternalMDML.g:1936:2: rule__GUID__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GUID__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUID__Group_1_0__1"


    // $ANTLR start "rule__GUID__Group_1_0__1__Impl"
    // InternalMDML.g:1942:1: rule__GUID__Group_1_0__1__Impl : ( RULE_ID ) ;
    public final void rule__GUID__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1946:1: ( ( RULE_ID ) )
            // InternalMDML.g:1947:1: ( RULE_ID )
            {
            // InternalMDML.g:1947:1: ( RULE_ID )
            // InternalMDML.g:1948:2: RULE_ID
            {
             before(grammarAccess.getGUIDAccess().getIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGUIDAccess().getIDTerminalRuleCall_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUID__Group_1_0__1__Impl"


    // $ANTLR start "rule__GUID__Group_1_1__0"
    // InternalMDML.g:1958:1: rule__GUID__Group_1_1__0 : rule__GUID__Group_1_1__0__Impl rule__GUID__Group_1_1__1 ;
    public final void rule__GUID__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1962:1: ( rule__GUID__Group_1_1__0__Impl rule__GUID__Group_1_1__1 )
            // InternalMDML.g:1963:2: rule__GUID__Group_1_1__0__Impl rule__GUID__Group_1_1__1
            {
            pushFollow(FOLLOW_4);
            rule__GUID__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GUID__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUID__Group_1_1__0"


    // $ANTLR start "rule__GUID__Group_1_1__0__Impl"
    // InternalMDML.g:1970:1: rule__GUID__Group_1_1__0__Impl : ( '/' ) ;
    public final void rule__GUID__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1974:1: ( ( '/' ) )
            // InternalMDML.g:1975:1: ( '/' )
            {
            // InternalMDML.g:1975:1: ( '/' )
            // InternalMDML.g:1976:2: '/'
            {
             before(grammarAccess.getGUIDAccess().getSolidusKeyword_1_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGUIDAccess().getSolidusKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUID__Group_1_1__0__Impl"


    // $ANTLR start "rule__GUID__Group_1_1__1"
    // InternalMDML.g:1985:1: rule__GUID__Group_1_1__1 : rule__GUID__Group_1_1__1__Impl ;
    public final void rule__GUID__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:1989:1: ( rule__GUID__Group_1_1__1__Impl )
            // InternalMDML.g:1990:2: rule__GUID__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GUID__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUID__Group_1_1__1"


    // $ANTLR start "rule__GUID__Group_1_1__1__Impl"
    // InternalMDML.g:1996:1: rule__GUID__Group_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__GUID__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2000:1: ( ( RULE_ID ) )
            // InternalMDML.g:2001:1: ( RULE_ID )
            {
            // InternalMDML.g:2001:1: ( RULE_ID )
            // InternalMDML.g:2002:2: RULE_ID
            {
             before(grammarAccess.getGUIDAccess().getIDTerminalRuleCall_1_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGUIDAccess().getIDTerminalRuleCall_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUID__Group_1_1__1__Impl"


    // $ANTLR start "rule__Version__Group__0"
    // InternalMDML.g:2012:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2016:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalMDML.g:2017:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Version__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__0"


    // $ANTLR start "rule__Version__Group__0__Impl"
    // InternalMDML.g:2024:1: rule__Version__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2028:1: ( ( RULE_INT ) )
            // InternalMDML.g:2029:1: ( RULE_INT )
            {
            // InternalMDML.g:2029:1: ( RULE_INT )
            // InternalMDML.g:2030:2: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__0__Impl"


    // $ANTLR start "rule__Version__Group__1"
    // InternalMDML.g:2039:1: rule__Version__Group__1 : rule__Version__Group__1__Impl rule__Version__Group__2 ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2043:1: ( rule__Version__Group__1__Impl rule__Version__Group__2 )
            // InternalMDML.g:2044:2: rule__Version__Group__1__Impl rule__Version__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Version__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__1"


    // $ANTLR start "rule__Version__Group__1__Impl"
    // InternalMDML.g:2051:1: rule__Version__Group__1__Impl : ( '.' ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2055:1: ( ( '.' ) )
            // InternalMDML.g:2056:1: ( '.' )
            {
            // InternalMDML.g:2056:1: ( '.' )
            // InternalMDML.g:2057:2: '.'
            {
             before(grammarAccess.getVersionAccess().getFullStopKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__1__Impl"


    // $ANTLR start "rule__Version__Group__2"
    // InternalMDML.g:2066:1: rule__Version__Group__2 : rule__Version__Group__2__Impl rule__Version__Group__3 ;
    public final void rule__Version__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2070:1: ( rule__Version__Group__2__Impl rule__Version__Group__3 )
            // InternalMDML.g:2071:2: rule__Version__Group__2__Impl rule__Version__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Version__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__2"


    // $ANTLR start "rule__Version__Group__2__Impl"
    // InternalMDML.g:2078:1: rule__Version__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2082:1: ( ( RULE_INT ) )
            // InternalMDML.g:2083:1: ( RULE_INT )
            {
            // InternalMDML.g:2083:1: ( RULE_INT )
            // InternalMDML.g:2084:2: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__2__Impl"


    // $ANTLR start "rule__Version__Group__3"
    // InternalMDML.g:2093:1: rule__Version__Group__3 : rule__Version__Group__3__Impl rule__Version__Group__4 ;
    public final void rule__Version__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2097:1: ( rule__Version__Group__3__Impl rule__Version__Group__4 )
            // InternalMDML.g:2098:2: rule__Version__Group__3__Impl rule__Version__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Version__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__3"


    // $ANTLR start "rule__Version__Group__3__Impl"
    // InternalMDML.g:2105:1: rule__Version__Group__3__Impl : ( '.' ) ;
    public final void rule__Version__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2109:1: ( ( '.' ) )
            // InternalMDML.g:2110:1: ( '.' )
            {
            // InternalMDML.g:2110:1: ( '.' )
            // InternalMDML.g:2111:2: '.'
            {
             before(grammarAccess.getVersionAccess().getFullStopKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__3__Impl"


    // $ANTLR start "rule__Version__Group__4"
    // InternalMDML.g:2120:1: rule__Version__Group__4 : rule__Version__Group__4__Impl ;
    public final void rule__Version__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2124:1: ( rule__Version__Group__4__Impl )
            // InternalMDML.g:2125:2: rule__Version__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Version__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__4"


    // $ANTLR start "rule__Version__Group__4__Impl"
    // InternalMDML.g:2131:1: rule__Version__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2135:1: ( ( RULE_INT ) )
            // InternalMDML.g:2136:1: ( RULE_INT )
            {
            // InternalMDML.g:2136:1: ( RULE_INT )
            // InternalMDML.g:2137:2: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__4__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalMDML.g:2147:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2151:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalMDML.g:2152:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // InternalMDML.g:2159:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2163:1: ( ( 'ref' ) )
            // InternalMDML.g:2164:1: ( 'ref' )
            {
            // InternalMDML.g:2164:1: ( 'ref' )
            // InternalMDML.g:2165:2: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalMDML.g:2174:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2178:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalMDML.g:2179:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // InternalMDML.g:2186:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2190:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // InternalMDML.g:2191:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // InternalMDML.g:2191:1: ( ( rule__Reference__NameAssignment_1 ) )
            // InternalMDML.g:2192:2: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // InternalMDML.g:2193:2: ( rule__Reference__NameAssignment_1 )
            // InternalMDML.g:2193:3: rule__Reference__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // InternalMDML.g:2201:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2205:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalMDML.g:2206:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // InternalMDML.g:2213:1: rule__Reference__Group__2__Impl : ( ':' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2217:1: ( ( ':' ) )
            // InternalMDML.g:2218:1: ( ':' )
            {
            // InternalMDML.g:2218:1: ( ':' )
            // InternalMDML.g:2219:2: ':'
            {
             before(grammarAccess.getReferenceAccess().getColonKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // InternalMDML.g:2228:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2232:1: ( rule__Reference__Group__3__Impl )
            // InternalMDML.g:2233:2: rule__Reference__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // InternalMDML.g:2239:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__TypeAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2243:1: ( ( ( rule__Reference__TypeAssignment_3 ) ) )
            // InternalMDML.g:2244:1: ( ( rule__Reference__TypeAssignment_3 ) )
            {
            // InternalMDML.g:2244:1: ( ( rule__Reference__TypeAssignment_3 ) )
            // InternalMDML.g:2245:2: ( rule__Reference__TypeAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getTypeAssignment_3()); 
            // InternalMDML.g:2246:2: ( rule__Reference__TypeAssignment_3 )
            // InternalMDML.g:2246:3: rule__Reference__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Reference__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Relationship__Group__0"
    // InternalMDML.g:2255:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2259:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // InternalMDML.g:2260:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Relationship__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0"


    // $ANTLR start "rule__Relationship__Group__0__Impl"
    // InternalMDML.g:2267:1: rule__Relationship__Group__0__Impl : ( 'relationship' ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2271:1: ( ( 'relationship' ) )
            // InternalMDML.g:2272:1: ( 'relationship' )
            {
            // InternalMDML.g:2272:1: ( 'relationship' )
            // InternalMDML.g:2273:2: 'relationship'
            {
             before(grammarAccess.getRelationshipAccess().getRelationshipKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getRelationshipKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0__Impl"


    // $ANTLR start "rule__Relationship__Group__1"
    // InternalMDML.g:2282:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2286:1: ( rule__Relationship__Group__1__Impl )
            // InternalMDML.g:2287:2: rule__Relationship__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__1"


    // $ANTLR start "rule__Relationship__Group__1__Impl"
    // InternalMDML.g:2293:1: rule__Relationship__Group__1__Impl : ( ( rule__Relationship__Group_1__0 ) ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2297:1: ( ( ( rule__Relationship__Group_1__0 ) ) )
            // InternalMDML.g:2298:1: ( ( rule__Relationship__Group_1__0 ) )
            {
            // InternalMDML.g:2298:1: ( ( rule__Relationship__Group_1__0 ) )
            // InternalMDML.g:2299:2: ( rule__Relationship__Group_1__0 )
            {
             before(grammarAccess.getRelationshipAccess().getGroup_1()); 
            // InternalMDML.g:2300:2: ( rule__Relationship__Group_1__0 )
            // InternalMDML.g:2300:3: rule__Relationship__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__1__Impl"


    // $ANTLR start "rule__Relationship__Group_1__0"
    // InternalMDML.g:2309:1: rule__Relationship__Group_1__0 : rule__Relationship__Group_1__0__Impl rule__Relationship__Group_1__1 ;
    public final void rule__Relationship__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2313:1: ( rule__Relationship__Group_1__0__Impl rule__Relationship__Group_1__1 )
            // InternalMDML.g:2314:2: rule__Relationship__Group_1__0__Impl rule__Relationship__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Relationship__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_1__0"


    // $ANTLR start "rule__Relationship__Group_1__0__Impl"
    // InternalMDML.g:2321:1: rule__Relationship__Group_1__0__Impl : ( ( rule__Relationship__SrcAssignment_1_0 ) ) ;
    public final void rule__Relationship__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2325:1: ( ( ( rule__Relationship__SrcAssignment_1_0 ) ) )
            // InternalMDML.g:2326:1: ( ( rule__Relationship__SrcAssignment_1_0 ) )
            {
            // InternalMDML.g:2326:1: ( ( rule__Relationship__SrcAssignment_1_0 ) )
            // InternalMDML.g:2327:2: ( rule__Relationship__SrcAssignment_1_0 )
            {
             before(grammarAccess.getRelationshipAccess().getSrcAssignment_1_0()); 
            // InternalMDML.g:2328:2: ( rule__Relationship__SrcAssignment_1_0 )
            // InternalMDML.g:2328:3: rule__Relationship__SrcAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__SrcAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getSrcAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_1__0__Impl"


    // $ANTLR start "rule__Relationship__Group_1__1"
    // InternalMDML.g:2336:1: rule__Relationship__Group_1__1 : rule__Relationship__Group_1__1__Impl rule__Relationship__Group_1__2 ;
    public final void rule__Relationship__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2340:1: ( rule__Relationship__Group_1__1__Impl rule__Relationship__Group_1__2 )
            // InternalMDML.g:2341:2: rule__Relationship__Group_1__1__Impl rule__Relationship__Group_1__2
            {
            pushFollow(FOLLOW_26);
            rule__Relationship__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_1__1"


    // $ANTLR start "rule__Relationship__Group_1__1__Impl"
    // InternalMDML.g:2348:1: rule__Relationship__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Relationship__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2352:1: ( ( ':' ) )
            // InternalMDML.g:2353:1: ( ':' )
            {
            // InternalMDML.g:2353:1: ( ':' )
            // InternalMDML.g:2354:2: ':'
            {
             before(grammarAccess.getRelationshipAccess().getColonKeyword_1_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_1__1__Impl"


    // $ANTLR start "rule__Relationship__Group_1__2"
    // InternalMDML.g:2363:1: rule__Relationship__Group_1__2 : rule__Relationship__Group_1__2__Impl ;
    public final void rule__Relationship__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2367:1: ( rule__Relationship__Group_1__2__Impl )
            // InternalMDML.g:2368:2: rule__Relationship__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_1__2"


    // $ANTLR start "rule__Relationship__Group_1__2__Impl"
    // InternalMDML.g:2374:1: rule__Relationship__Group_1__2__Impl : ( ( rule__Relationship__DestAssignment_1_2 ) ) ;
    public final void rule__Relationship__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2378:1: ( ( ( rule__Relationship__DestAssignment_1_2 ) ) )
            // InternalMDML.g:2379:1: ( ( rule__Relationship__DestAssignment_1_2 ) )
            {
            // InternalMDML.g:2379:1: ( ( rule__Relationship__DestAssignment_1_2 ) )
            // InternalMDML.g:2380:2: ( rule__Relationship__DestAssignment_1_2 )
            {
             before(grammarAccess.getRelationshipAccess().getDestAssignment_1_2()); 
            // InternalMDML.g:2381:2: ( rule__Relationship__DestAssignment_1_2 )
            // InternalMDML.g:2381:3: rule__Relationship__DestAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__DestAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getDestAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_1__2__Impl"


    // $ANTLR start "rule__ExtensionItem__Group__0"
    // InternalMDML.g:2390:1: rule__ExtensionItem__Group__0 : rule__ExtensionItem__Group__0__Impl rule__ExtensionItem__Group__1 ;
    public final void rule__ExtensionItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2394:1: ( rule__ExtensionItem__Group__0__Impl rule__ExtensionItem__Group__1 )
            // InternalMDML.g:2395:2: rule__ExtensionItem__Group__0__Impl rule__ExtensionItem__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ExtensionItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionItem__Group__0"


    // $ANTLR start "rule__ExtensionItem__Group__0__Impl"
    // InternalMDML.g:2402:1: rule__ExtensionItem__Group__0__Impl : ( 'extension' ) ;
    public final void rule__ExtensionItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2406:1: ( ( 'extension' ) )
            // InternalMDML.g:2407:1: ( 'extension' )
            {
            // InternalMDML.g:2407:1: ( 'extension' )
            // InternalMDML.g:2408:2: 'extension'
            {
             before(grammarAccess.getExtensionItemAccess().getExtensionKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getExtensionItemAccess().getExtensionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionItem__Group__0__Impl"


    // $ANTLR start "rule__ExtensionItem__Group__1"
    // InternalMDML.g:2417:1: rule__ExtensionItem__Group__1 : rule__ExtensionItem__Group__1__Impl rule__ExtensionItem__Group__2 ;
    public final void rule__ExtensionItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2421:1: ( rule__ExtensionItem__Group__1__Impl rule__ExtensionItem__Group__2 )
            // InternalMDML.g:2422:2: rule__ExtensionItem__Group__1__Impl rule__ExtensionItem__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__ExtensionItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionItem__Group__1"


    // $ANTLR start "rule__ExtensionItem__Group__1__Impl"
    // InternalMDML.g:2429:1: rule__ExtensionItem__Group__1__Impl : ( ( rule__ExtensionItem__KeyAssignment_1 ) ) ;
    public final void rule__ExtensionItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2433:1: ( ( ( rule__ExtensionItem__KeyAssignment_1 ) ) )
            // InternalMDML.g:2434:1: ( ( rule__ExtensionItem__KeyAssignment_1 ) )
            {
            // InternalMDML.g:2434:1: ( ( rule__ExtensionItem__KeyAssignment_1 ) )
            // InternalMDML.g:2435:2: ( rule__ExtensionItem__KeyAssignment_1 )
            {
             before(grammarAccess.getExtensionItemAccess().getKeyAssignment_1()); 
            // InternalMDML.g:2436:2: ( rule__ExtensionItem__KeyAssignment_1 )
            // InternalMDML.g:2436:3: rule__ExtensionItem__KeyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionItem__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExtensionItemAccess().getKeyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionItem__Group__1__Impl"


    // $ANTLR start "rule__ExtensionItem__Group__2"
    // InternalMDML.g:2444:1: rule__ExtensionItem__Group__2 : rule__ExtensionItem__Group__2__Impl rule__ExtensionItem__Group__3 ;
    public final void rule__ExtensionItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2448:1: ( rule__ExtensionItem__Group__2__Impl rule__ExtensionItem__Group__3 )
            // InternalMDML.g:2449:2: rule__ExtensionItem__Group__2__Impl rule__ExtensionItem__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__ExtensionItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionItem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionItem__Group__2"


    // $ANTLR start "rule__ExtensionItem__Group__2__Impl"
    // InternalMDML.g:2456:1: rule__ExtensionItem__Group__2__Impl : ( '=' ) ;
    public final void rule__ExtensionItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2460:1: ( ( '=' ) )
            // InternalMDML.g:2461:1: ( '=' )
            {
            // InternalMDML.g:2461:1: ( '=' )
            // InternalMDML.g:2462:2: '='
            {
             before(grammarAccess.getExtensionItemAccess().getEqualsSignKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getExtensionItemAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionItem__Group__2__Impl"


    // $ANTLR start "rule__ExtensionItem__Group__3"
    // InternalMDML.g:2471:1: rule__ExtensionItem__Group__3 : rule__ExtensionItem__Group__3__Impl rule__ExtensionItem__Group__4 ;
    public final void rule__ExtensionItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2475:1: ( rule__ExtensionItem__Group__3__Impl rule__ExtensionItem__Group__4 )
            // InternalMDML.g:2476:2: rule__ExtensionItem__Group__3__Impl rule__ExtensionItem__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__ExtensionItem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionItem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionItem__Group__3"


    // $ANTLR start "rule__ExtensionItem__Group__3__Impl"
    // InternalMDML.g:2483:1: rule__ExtensionItem__Group__3__Impl : ( ( rule__ExtensionItem__ValueAssignment_3 ) ) ;
    public final void rule__ExtensionItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2487:1: ( ( ( rule__ExtensionItem__ValueAssignment_3 ) ) )
            // InternalMDML.g:2488:1: ( ( rule__ExtensionItem__ValueAssignment_3 ) )
            {
            // InternalMDML.g:2488:1: ( ( rule__ExtensionItem__ValueAssignment_3 ) )
            // InternalMDML.g:2489:2: ( rule__ExtensionItem__ValueAssignment_3 )
            {
             before(grammarAccess.getExtensionItemAccess().getValueAssignment_3()); 
            // InternalMDML.g:2490:2: ( rule__ExtensionItem__ValueAssignment_3 )
            // InternalMDML.g:2490:3: rule__ExtensionItem__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionItem__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExtensionItemAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionItem__Group__3__Impl"


    // $ANTLR start "rule__ExtensionItem__Group__4"
    // InternalMDML.g:2498:1: rule__ExtensionItem__Group__4 : rule__ExtensionItem__Group__4__Impl ;
    public final void rule__ExtensionItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2502:1: ( rule__ExtensionItem__Group__4__Impl )
            // InternalMDML.g:2503:2: rule__ExtensionItem__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionItem__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionItem__Group__4"


    // $ANTLR start "rule__ExtensionItem__Group__4__Impl"
    // InternalMDML.g:2509:1: rule__ExtensionItem__Group__4__Impl : ( ';' ) ;
    public final void rule__ExtensionItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2513:1: ( ( ';' ) )
            // InternalMDML.g:2514:1: ( ';' )
            {
            // InternalMDML.g:2514:1: ( ';' )
            // InternalMDML.g:2515:2: ';'
            {
             before(grammarAccess.getExtensionItemAccess().getSemicolonKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getExtensionItemAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionItem__Group__4__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalMDML.g:2525:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2529:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMDML.g:2530:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalMDML.g:2537:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2541:1: ( ( 'import' ) )
            // InternalMDML.g:2542:1: ( 'import' )
            {
            // InternalMDML.g:2542:1: ( 'import' )
            // InternalMDML.g:2543:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalMDML.g:2552:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2556:1: ( rule__Import__Group__1__Impl )
            // InternalMDML.g:2557:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalMDML.g:2563:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2567:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalMDML.g:2568:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalMDML.g:2568:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalMDML.g:2569:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalMDML.g:2570:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalMDML.g:2570:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalMDML.g:2579:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2583:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalMDML.g:2584:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalMDML.g:2591:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2595:1: ( ( ruleQualifiedName ) )
            // InternalMDML.g:2596:1: ( ruleQualifiedName )
            {
            // InternalMDML.g:2596:1: ( ruleQualifiedName )
            // InternalMDML.g:2597:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalMDML.g:2606:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2610:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalMDML.g:2611:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalMDML.g:2617:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2621:1: ( ( ( '.*' )? ) )
            // InternalMDML.g:2622:1: ( ( '.*' )? )
            {
            // InternalMDML.g:2622:1: ( ( '.*' )? )
            // InternalMDML.g:2623:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalMDML.g:2624:2: ( '.*' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMDML.g:2624:3: '.*'
                    {
                    match(input,36,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__EnumeratedType__Group__0"
    // InternalMDML.g:2633:1: rule__EnumeratedType__Group__0 : rule__EnumeratedType__Group__0__Impl rule__EnumeratedType__Group__1 ;
    public final void rule__EnumeratedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2637:1: ( rule__EnumeratedType__Group__0__Impl rule__EnumeratedType__Group__1 )
            // InternalMDML.g:2638:2: rule__EnumeratedType__Group__0__Impl rule__EnumeratedType__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EnumeratedType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumeratedType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__0"


    // $ANTLR start "rule__EnumeratedType__Group__0__Impl"
    // InternalMDML.g:2645:1: rule__EnumeratedType__Group__0__Impl : ( 'enumtype' ) ;
    public final void rule__EnumeratedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2649:1: ( ( 'enumtype' ) )
            // InternalMDML.g:2650:1: ( 'enumtype' )
            {
            // InternalMDML.g:2650:1: ( 'enumtype' )
            // InternalMDML.g:2651:2: 'enumtype'
            {
             before(grammarAccess.getEnumeratedTypeAccess().getEnumtypeKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEnumeratedTypeAccess().getEnumtypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__0__Impl"


    // $ANTLR start "rule__EnumeratedType__Group__1"
    // InternalMDML.g:2660:1: rule__EnumeratedType__Group__1 : rule__EnumeratedType__Group__1__Impl rule__EnumeratedType__Group__2 ;
    public final void rule__EnumeratedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2664:1: ( rule__EnumeratedType__Group__1__Impl rule__EnumeratedType__Group__2 )
            // InternalMDML.g:2665:2: rule__EnumeratedType__Group__1__Impl rule__EnumeratedType__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__EnumeratedType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumeratedType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__1"


    // $ANTLR start "rule__EnumeratedType__Group__1__Impl"
    // InternalMDML.g:2672:1: rule__EnumeratedType__Group__1__Impl : ( 'status:' ) ;
    public final void rule__EnumeratedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2676:1: ( ( 'status:' ) )
            // InternalMDML.g:2677:1: ( 'status:' )
            {
            // InternalMDML.g:2677:1: ( 'status:' )
            // InternalMDML.g:2678:2: 'status:'
            {
             before(grammarAccess.getEnumeratedTypeAccess().getStatusKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEnumeratedTypeAccess().getStatusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__1__Impl"


    // $ANTLR start "rule__EnumeratedType__Group__2"
    // InternalMDML.g:2687:1: rule__EnumeratedType__Group__2 : rule__EnumeratedType__Group__2__Impl rule__EnumeratedType__Group__3 ;
    public final void rule__EnumeratedType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2691:1: ( rule__EnumeratedType__Group__2__Impl rule__EnumeratedType__Group__3 )
            // InternalMDML.g:2692:2: rule__EnumeratedType__Group__2__Impl rule__EnumeratedType__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__EnumeratedType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumeratedType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__2"


    // $ANTLR start "rule__EnumeratedType__Group__2__Impl"
    // InternalMDML.g:2699:1: rule__EnumeratedType__Group__2__Impl : ( ( rule__EnumeratedType__StatusAssignment_2 ) ) ;
    public final void rule__EnumeratedType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2703:1: ( ( ( rule__EnumeratedType__StatusAssignment_2 ) ) )
            // InternalMDML.g:2704:1: ( ( rule__EnumeratedType__StatusAssignment_2 ) )
            {
            // InternalMDML.g:2704:1: ( ( rule__EnumeratedType__StatusAssignment_2 ) )
            // InternalMDML.g:2705:2: ( rule__EnumeratedType__StatusAssignment_2 )
            {
             before(grammarAccess.getEnumeratedTypeAccess().getStatusAssignment_2()); 
            // InternalMDML.g:2706:2: ( rule__EnumeratedType__StatusAssignment_2 )
            // InternalMDML.g:2706:3: rule__EnumeratedType__StatusAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EnumeratedType__StatusAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumeratedTypeAccess().getStatusAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__2__Impl"


    // $ANTLR start "rule__EnumeratedType__Group__3"
    // InternalMDML.g:2714:1: rule__EnumeratedType__Group__3 : rule__EnumeratedType__Group__3__Impl rule__EnumeratedType__Group__4 ;
    public final void rule__EnumeratedType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2718:1: ( rule__EnumeratedType__Group__3__Impl rule__EnumeratedType__Group__4 )
            // InternalMDML.g:2719:2: rule__EnumeratedType__Group__3__Impl rule__EnumeratedType__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__EnumeratedType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumeratedType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__3"


    // $ANTLR start "rule__EnumeratedType__Group__3__Impl"
    // InternalMDML.g:2726:1: rule__EnumeratedType__Group__3__Impl : ( 'domainid:' ) ;
    public final void rule__EnumeratedType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2730:1: ( ( 'domainid:' ) )
            // InternalMDML.g:2731:1: ( 'domainid:' )
            {
            // InternalMDML.g:2731:1: ( 'domainid:' )
            // InternalMDML.g:2732:2: 'domainid:'
            {
             before(grammarAccess.getEnumeratedTypeAccess().getDomainidKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEnumeratedTypeAccess().getDomainidKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__3__Impl"


    // $ANTLR start "rule__EnumeratedType__Group__4"
    // InternalMDML.g:2741:1: rule__EnumeratedType__Group__4 : rule__EnumeratedType__Group__4__Impl rule__EnumeratedType__Group__5 ;
    public final void rule__EnumeratedType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2745:1: ( rule__EnumeratedType__Group__4__Impl rule__EnumeratedType__Group__5 )
            // InternalMDML.g:2746:2: rule__EnumeratedType__Group__4__Impl rule__EnumeratedType__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__EnumeratedType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumeratedType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__4"


    // $ANTLR start "rule__EnumeratedType__Group__4__Impl"
    // InternalMDML.g:2753:1: rule__EnumeratedType__Group__4__Impl : ( ( rule__EnumeratedType__GuidAssignment_4 ) ) ;
    public final void rule__EnumeratedType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2757:1: ( ( ( rule__EnumeratedType__GuidAssignment_4 ) ) )
            // InternalMDML.g:2758:1: ( ( rule__EnumeratedType__GuidAssignment_4 ) )
            {
            // InternalMDML.g:2758:1: ( ( rule__EnumeratedType__GuidAssignment_4 ) )
            // InternalMDML.g:2759:2: ( rule__EnumeratedType__GuidAssignment_4 )
            {
             before(grammarAccess.getEnumeratedTypeAccess().getGuidAssignment_4()); 
            // InternalMDML.g:2760:2: ( rule__EnumeratedType__GuidAssignment_4 )
            // InternalMDML.g:2760:3: rule__EnumeratedType__GuidAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EnumeratedType__GuidAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnumeratedTypeAccess().getGuidAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__4__Impl"


    // $ANTLR start "rule__EnumeratedType__Group__5"
    // InternalMDML.g:2768:1: rule__EnumeratedType__Group__5 : rule__EnumeratedType__Group__5__Impl rule__EnumeratedType__Group__6 ;
    public final void rule__EnumeratedType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2772:1: ( rule__EnumeratedType__Group__5__Impl rule__EnumeratedType__Group__6 )
            // InternalMDML.g:2773:2: rule__EnumeratedType__Group__5__Impl rule__EnumeratedType__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__EnumeratedType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumeratedType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__5"


    // $ANTLR start "rule__EnumeratedType__Group__5__Impl"
    // InternalMDML.g:2780:1: rule__EnumeratedType__Group__5__Impl : ( '@' ) ;
    public final void rule__EnumeratedType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2784:1: ( ( '@' ) )
            // InternalMDML.g:2785:1: ( '@' )
            {
            // InternalMDML.g:2785:1: ( '@' )
            // InternalMDML.g:2786:2: '@'
            {
             before(grammarAccess.getEnumeratedTypeAccess().getCommercialAtKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEnumeratedTypeAccess().getCommercialAtKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__5__Impl"


    // $ANTLR start "rule__EnumeratedType__Group__6"
    // InternalMDML.g:2795:1: rule__EnumeratedType__Group__6 : rule__EnumeratedType__Group__6__Impl rule__EnumeratedType__Group__7 ;
    public final void rule__EnumeratedType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2799:1: ( rule__EnumeratedType__Group__6__Impl rule__EnumeratedType__Group__7 )
            // InternalMDML.g:2800:2: rule__EnumeratedType__Group__6__Impl rule__EnumeratedType__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__EnumeratedType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumeratedType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__6"


    // $ANTLR start "rule__EnumeratedType__Group__6__Impl"
    // InternalMDML.g:2807:1: rule__EnumeratedType__Group__6__Impl : ( '(' ) ;
    public final void rule__EnumeratedType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2811:1: ( ( '(' ) )
            // InternalMDML.g:2812:1: ( '(' )
            {
            // InternalMDML.g:2812:1: ( '(' )
            // InternalMDML.g:2813:2: '('
            {
             before(grammarAccess.getEnumeratedTypeAccess().getLeftParenthesisKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEnumeratedTypeAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__6__Impl"


    // $ANTLR start "rule__EnumeratedType__Group__7"
    // InternalMDML.g:2822:1: rule__EnumeratedType__Group__7 : rule__EnumeratedType__Group__7__Impl rule__EnumeratedType__Group__8 ;
    public final void rule__EnumeratedType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2826:1: ( rule__EnumeratedType__Group__7__Impl rule__EnumeratedType__Group__8 )
            // InternalMDML.g:2827:2: rule__EnumeratedType__Group__7__Impl rule__EnumeratedType__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__EnumeratedType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumeratedType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__7"


    // $ANTLR start "rule__EnumeratedType__Group__7__Impl"
    // InternalMDML.g:2834:1: rule__EnumeratedType__Group__7__Impl : ( ruleVersion ) ;
    public final void rule__EnumeratedType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2838:1: ( ( ruleVersion ) )
            // InternalMDML.g:2839:1: ( ruleVersion )
            {
            // InternalMDML.g:2839:1: ( ruleVersion )
            // InternalMDML.g:2840:2: ruleVersion
            {
             before(grammarAccess.getEnumeratedTypeAccess().getVersionParserRuleCall_7()); 
            pushFollow(FOLLOW_2);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getEnumeratedTypeAccess().getVersionParserRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__7__Impl"


    // $ANTLR start "rule__EnumeratedType__Group__8"
    // InternalMDML.g:2849:1: rule__EnumeratedType__Group__8 : rule__EnumeratedType__Group__8__Impl rule__EnumeratedType__Group__9 ;
    public final void rule__EnumeratedType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2853:1: ( rule__EnumeratedType__Group__8__Impl rule__EnumeratedType__Group__9 )
            // InternalMDML.g:2854:2: rule__EnumeratedType__Group__8__Impl rule__EnumeratedType__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__EnumeratedType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumeratedType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__8"


    // $ANTLR start "rule__EnumeratedType__Group__8__Impl"
    // InternalMDML.g:2861:1: rule__EnumeratedType__Group__8__Impl : ( ')' ) ;
    public final void rule__EnumeratedType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2865:1: ( ( ')' ) )
            // InternalMDML.g:2866:1: ( ')' )
            {
            // InternalMDML.g:2866:1: ( ')' )
            // InternalMDML.g:2867:2: ')'
            {
             before(grammarAccess.getEnumeratedTypeAccess().getRightParenthesisKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumeratedTypeAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__8__Impl"


    // $ANTLR start "rule__EnumeratedType__Group__9"
    // InternalMDML.g:2876:1: rule__EnumeratedType__Group__9 : rule__EnumeratedType__Group__9__Impl rule__EnumeratedType__Group__10 ;
    public final void rule__EnumeratedType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2880:1: ( rule__EnumeratedType__Group__9__Impl rule__EnumeratedType__Group__10 )
            // InternalMDML.g:2881:2: rule__EnumeratedType__Group__9__Impl rule__EnumeratedType__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__EnumeratedType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumeratedType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__9"


    // $ANTLR start "rule__EnumeratedType__Group__9__Impl"
    // InternalMDML.g:2888:1: rule__EnumeratedType__Group__9__Impl : ( ( rule__EnumeratedType__RefinesAssignment_9 ) ) ;
    public final void rule__EnumeratedType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2892:1: ( ( ( rule__EnumeratedType__RefinesAssignment_9 ) ) )
            // InternalMDML.g:2893:1: ( ( rule__EnumeratedType__RefinesAssignment_9 ) )
            {
            // InternalMDML.g:2893:1: ( ( rule__EnumeratedType__RefinesAssignment_9 ) )
            // InternalMDML.g:2894:2: ( rule__EnumeratedType__RefinesAssignment_9 )
            {
             before(grammarAccess.getEnumeratedTypeAccess().getRefinesAssignment_9()); 
            // InternalMDML.g:2895:2: ( rule__EnumeratedType__RefinesAssignment_9 )
            // InternalMDML.g:2895:3: rule__EnumeratedType__RefinesAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__EnumeratedType__RefinesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getEnumeratedTypeAccess().getRefinesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__9__Impl"


    // $ANTLR start "rule__EnumeratedType__Group__10"
    // InternalMDML.g:2903:1: rule__EnumeratedType__Group__10 : rule__EnumeratedType__Group__10__Impl rule__EnumeratedType__Group__11 ;
    public final void rule__EnumeratedType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2907:1: ( rule__EnumeratedType__Group__10__Impl rule__EnumeratedType__Group__11 )
            // InternalMDML.g:2908:2: rule__EnumeratedType__Group__10__Impl rule__EnumeratedType__Group__11
            {
            pushFollow(FOLLOW_19);
            rule__EnumeratedType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumeratedType__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__10"


    // $ANTLR start "rule__EnumeratedType__Group__10__Impl"
    // InternalMDML.g:2915:1: rule__EnumeratedType__Group__10__Impl : ( ( rule__EnumeratedType__NameAssignment_10 ) ) ;
    public final void rule__EnumeratedType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2919:1: ( ( ( rule__EnumeratedType__NameAssignment_10 ) ) )
            // InternalMDML.g:2920:1: ( ( rule__EnumeratedType__NameAssignment_10 ) )
            {
            // InternalMDML.g:2920:1: ( ( rule__EnumeratedType__NameAssignment_10 ) )
            // InternalMDML.g:2921:2: ( rule__EnumeratedType__NameAssignment_10 )
            {
             before(grammarAccess.getEnumeratedTypeAccess().getNameAssignment_10()); 
            // InternalMDML.g:2922:2: ( rule__EnumeratedType__NameAssignment_10 )
            // InternalMDML.g:2922:3: rule__EnumeratedType__NameAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__EnumeratedType__NameAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getEnumeratedTypeAccess().getNameAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__10__Impl"


    // $ANTLR start "rule__EnumeratedType__Group__11"
    // InternalMDML.g:2930:1: rule__EnumeratedType__Group__11 : rule__EnumeratedType__Group__11__Impl rule__EnumeratedType__Group__12 ;
    public final void rule__EnumeratedType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2934:1: ( rule__EnumeratedType__Group__11__Impl rule__EnumeratedType__Group__12 )
            // InternalMDML.g:2935:2: rule__EnumeratedType__Group__11__Impl rule__EnumeratedType__Group__12
            {
            pushFollow(FOLLOW_31);
            rule__EnumeratedType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumeratedType__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__11"


    // $ANTLR start "rule__EnumeratedType__Group__11__Impl"
    // InternalMDML.g:2942:1: rule__EnumeratedType__Group__11__Impl : ( ':' ) ;
    public final void rule__EnumeratedType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2946:1: ( ( ':' ) )
            // InternalMDML.g:2947:1: ( ':' )
            {
            // InternalMDML.g:2947:1: ( ':' )
            // InternalMDML.g:2948:2: ':'
            {
             before(grammarAccess.getEnumeratedTypeAccess().getColonKeyword_11()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEnumeratedTypeAccess().getColonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__11__Impl"


    // $ANTLR start "rule__EnumeratedType__Group__12"
    // InternalMDML.g:2957:1: rule__EnumeratedType__Group__12 : rule__EnumeratedType__Group__12__Impl rule__EnumeratedType__Group__13 ;
    public final void rule__EnumeratedType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2961:1: ( rule__EnumeratedType__Group__12__Impl rule__EnumeratedType__Group__13 )
            // InternalMDML.g:2962:2: rule__EnumeratedType__Group__12__Impl rule__EnumeratedType__Group__13
            {
            pushFollow(FOLLOW_32);
            rule__EnumeratedType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumeratedType__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__12"


    // $ANTLR start "rule__EnumeratedType__Group__12__Impl"
    // InternalMDML.g:2969:1: rule__EnumeratedType__Group__12__Impl : ( ( rule__EnumeratedType__TypeAssignment_12 ) ) ;
    public final void rule__EnumeratedType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2973:1: ( ( ( rule__EnumeratedType__TypeAssignment_12 ) ) )
            // InternalMDML.g:2974:1: ( ( rule__EnumeratedType__TypeAssignment_12 ) )
            {
            // InternalMDML.g:2974:1: ( ( rule__EnumeratedType__TypeAssignment_12 ) )
            // InternalMDML.g:2975:2: ( rule__EnumeratedType__TypeAssignment_12 )
            {
             before(grammarAccess.getEnumeratedTypeAccess().getTypeAssignment_12()); 
            // InternalMDML.g:2976:2: ( rule__EnumeratedType__TypeAssignment_12 )
            // InternalMDML.g:2976:3: rule__EnumeratedType__TypeAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__EnumeratedType__TypeAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getEnumeratedTypeAccess().getTypeAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__12__Impl"


    // $ANTLR start "rule__EnumeratedType__Group__13"
    // InternalMDML.g:2984:1: rule__EnumeratedType__Group__13 : rule__EnumeratedType__Group__13__Impl ;
    public final void rule__EnumeratedType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2988:1: ( rule__EnumeratedType__Group__13__Impl )
            // InternalMDML.g:2989:2: rule__EnumeratedType__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumeratedType__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__13"


    // $ANTLR start "rule__EnumeratedType__Group__13__Impl"
    // InternalMDML.g:2995:1: rule__EnumeratedType__Group__13__Impl : ( ( rule__EnumeratedType__Group_13__0 )? ) ;
    public final void rule__EnumeratedType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:2999:1: ( ( ( rule__EnumeratedType__Group_13__0 )? ) )
            // InternalMDML.g:3000:1: ( ( rule__EnumeratedType__Group_13__0 )? )
            {
            // InternalMDML.g:3000:1: ( ( rule__EnumeratedType__Group_13__0 )? )
            // InternalMDML.g:3001:2: ( rule__EnumeratedType__Group_13__0 )?
            {
             before(grammarAccess.getEnumeratedTypeAccess().getGroup_13()); 
            // InternalMDML.g:3002:2: ( rule__EnumeratedType__Group_13__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==45) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMDML.g:3002:3: rule__EnumeratedType__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumeratedType__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumeratedTypeAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group__13__Impl"


    // $ANTLR start "rule__EnumeratedType__Group_13__0"
    // InternalMDML.g:3011:1: rule__EnumeratedType__Group_13__0 : rule__EnumeratedType__Group_13__0__Impl rule__EnumeratedType__Group_13__1 ;
    public final void rule__EnumeratedType__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3015:1: ( rule__EnumeratedType__Group_13__0__Impl rule__EnumeratedType__Group_13__1 )
            // InternalMDML.g:3016:2: rule__EnumeratedType__Group_13__0__Impl rule__EnumeratedType__Group_13__1
            {
            pushFollow(FOLLOW_33);
            rule__EnumeratedType__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumeratedType__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group_13__0"


    // $ANTLR start "rule__EnumeratedType__Group_13__0__Impl"
    // InternalMDML.g:3023:1: rule__EnumeratedType__Group_13__0__Impl : ( ( rule__EnumeratedType__ArrayAssignment_13_0 ) ) ;
    public final void rule__EnumeratedType__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3027:1: ( ( ( rule__EnumeratedType__ArrayAssignment_13_0 ) ) )
            // InternalMDML.g:3028:1: ( ( rule__EnumeratedType__ArrayAssignment_13_0 ) )
            {
            // InternalMDML.g:3028:1: ( ( rule__EnumeratedType__ArrayAssignment_13_0 ) )
            // InternalMDML.g:3029:2: ( rule__EnumeratedType__ArrayAssignment_13_0 )
            {
             before(grammarAccess.getEnumeratedTypeAccess().getArrayAssignment_13_0()); 
            // InternalMDML.g:3030:2: ( rule__EnumeratedType__ArrayAssignment_13_0 )
            // InternalMDML.g:3030:3: rule__EnumeratedType__ArrayAssignment_13_0
            {
            pushFollow(FOLLOW_2);
            rule__EnumeratedType__ArrayAssignment_13_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumeratedTypeAccess().getArrayAssignment_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group_13__0__Impl"


    // $ANTLR start "rule__EnumeratedType__Group_13__1"
    // InternalMDML.g:3038:1: rule__EnumeratedType__Group_13__1 : rule__EnumeratedType__Group_13__1__Impl rule__EnumeratedType__Group_13__2 ;
    public final void rule__EnumeratedType__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3042:1: ( rule__EnumeratedType__Group_13__1__Impl rule__EnumeratedType__Group_13__2 )
            // InternalMDML.g:3043:2: rule__EnumeratedType__Group_13__1__Impl rule__EnumeratedType__Group_13__2
            {
            pushFollow(FOLLOW_33);
            rule__EnumeratedType__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumeratedType__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group_13__1"


    // $ANTLR start "rule__EnumeratedType__Group_13__1__Impl"
    // InternalMDML.g:3050:1: rule__EnumeratedType__Group_13__1__Impl : ( ( rule__EnumeratedType__LengthAssignment_13_1 )? ) ;
    public final void rule__EnumeratedType__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3054:1: ( ( ( rule__EnumeratedType__LengthAssignment_13_1 )? ) )
            // InternalMDML.g:3055:1: ( ( rule__EnumeratedType__LengthAssignment_13_1 )? )
            {
            // InternalMDML.g:3055:1: ( ( rule__EnumeratedType__LengthAssignment_13_1 )? )
            // InternalMDML.g:3056:2: ( rule__EnumeratedType__LengthAssignment_13_1 )?
            {
             before(grammarAccess.getEnumeratedTypeAccess().getLengthAssignment_13_1()); 
            // InternalMDML.g:3057:2: ( rule__EnumeratedType__LengthAssignment_13_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMDML.g:3057:3: rule__EnumeratedType__LengthAssignment_13_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumeratedType__LengthAssignment_13_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumeratedTypeAccess().getLengthAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group_13__1__Impl"


    // $ANTLR start "rule__EnumeratedType__Group_13__2"
    // InternalMDML.g:3065:1: rule__EnumeratedType__Group_13__2 : rule__EnumeratedType__Group_13__2__Impl ;
    public final void rule__EnumeratedType__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3069:1: ( rule__EnumeratedType__Group_13__2__Impl )
            // InternalMDML.g:3070:2: rule__EnumeratedType__Group_13__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumeratedType__Group_13__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group_13__2"


    // $ANTLR start "rule__EnumeratedType__Group_13__2__Impl"
    // InternalMDML.g:3076:1: rule__EnumeratedType__Group_13__2__Impl : ( ']' ) ;
    public final void rule__EnumeratedType__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3080:1: ( ( ']' ) )
            // InternalMDML.g:3081:1: ( ']' )
            {
            // InternalMDML.g:3081:1: ( ']' )
            // InternalMDML.g:3082:2: ']'
            {
             before(grammarAccess.getEnumeratedTypeAccess().getRightSquareBracketKeyword_13_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEnumeratedTypeAccess().getRightSquareBracketKeyword_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__Group_13__2__Impl"


    // $ANTLR start "rule__ReferenceType__Group__0"
    // InternalMDML.g:3092:1: rule__ReferenceType__Group__0 : rule__ReferenceType__Group__0__Impl rule__ReferenceType__Group__1 ;
    public final void rule__ReferenceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3096:1: ( rule__ReferenceType__Group__0__Impl rule__ReferenceType__Group__1 )
            // InternalMDML.g:3097:2: rule__ReferenceType__Group__0__Impl rule__ReferenceType__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ReferenceType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__0"


    // $ANTLR start "rule__ReferenceType__Group__0__Impl"
    // InternalMDML.g:3104:1: rule__ReferenceType__Group__0__Impl : ( 'reftype' ) ;
    public final void rule__ReferenceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3108:1: ( ( 'reftype' ) )
            // InternalMDML.g:3109:1: ( 'reftype' )
            {
            // InternalMDML.g:3109:1: ( 'reftype' )
            // InternalMDML.g:3110:2: 'reftype'
            {
             before(grammarAccess.getReferenceTypeAccess().getReftypeKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getReferenceTypeAccess().getReftypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__0__Impl"


    // $ANTLR start "rule__ReferenceType__Group__1"
    // InternalMDML.g:3119:1: rule__ReferenceType__Group__1 : rule__ReferenceType__Group__1__Impl rule__ReferenceType__Group__2 ;
    public final void rule__ReferenceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3123:1: ( rule__ReferenceType__Group__1__Impl rule__ReferenceType__Group__2 )
            // InternalMDML.g:3124:2: rule__ReferenceType__Group__1__Impl rule__ReferenceType__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ReferenceType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__1"


    // $ANTLR start "rule__ReferenceType__Group__1__Impl"
    // InternalMDML.g:3131:1: rule__ReferenceType__Group__1__Impl : ( 'status:' ) ;
    public final void rule__ReferenceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3135:1: ( ( 'status:' ) )
            // InternalMDML.g:3136:1: ( 'status:' )
            {
            // InternalMDML.g:3136:1: ( 'status:' )
            // InternalMDML.g:3137:2: 'status:'
            {
             before(grammarAccess.getReferenceTypeAccess().getStatusKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getReferenceTypeAccess().getStatusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__1__Impl"


    // $ANTLR start "rule__ReferenceType__Group__2"
    // InternalMDML.g:3146:1: rule__ReferenceType__Group__2 : rule__ReferenceType__Group__2__Impl rule__ReferenceType__Group__3 ;
    public final void rule__ReferenceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3150:1: ( rule__ReferenceType__Group__2__Impl rule__ReferenceType__Group__3 )
            // InternalMDML.g:3151:2: rule__ReferenceType__Group__2__Impl rule__ReferenceType__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ReferenceType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__2"


    // $ANTLR start "rule__ReferenceType__Group__2__Impl"
    // InternalMDML.g:3158:1: rule__ReferenceType__Group__2__Impl : ( ( rule__ReferenceType__StatusAssignment_2 ) ) ;
    public final void rule__ReferenceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3162:1: ( ( ( rule__ReferenceType__StatusAssignment_2 ) ) )
            // InternalMDML.g:3163:1: ( ( rule__ReferenceType__StatusAssignment_2 ) )
            {
            // InternalMDML.g:3163:1: ( ( rule__ReferenceType__StatusAssignment_2 ) )
            // InternalMDML.g:3164:2: ( rule__ReferenceType__StatusAssignment_2 )
            {
             before(grammarAccess.getReferenceTypeAccess().getStatusAssignment_2()); 
            // InternalMDML.g:3165:2: ( rule__ReferenceType__StatusAssignment_2 )
            // InternalMDML.g:3165:3: rule__ReferenceType__StatusAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceType__StatusAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReferenceTypeAccess().getStatusAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__2__Impl"


    // $ANTLR start "rule__ReferenceType__Group__3"
    // InternalMDML.g:3173:1: rule__ReferenceType__Group__3 : rule__ReferenceType__Group__3__Impl rule__ReferenceType__Group__4 ;
    public final void rule__ReferenceType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3177:1: ( rule__ReferenceType__Group__3__Impl rule__ReferenceType__Group__4 )
            // InternalMDML.g:3178:2: rule__ReferenceType__Group__3__Impl rule__ReferenceType__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__ReferenceType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__3"


    // $ANTLR start "rule__ReferenceType__Group__3__Impl"
    // InternalMDML.g:3185:1: rule__ReferenceType__Group__3__Impl : ( 'domainid:' ) ;
    public final void rule__ReferenceType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3189:1: ( ( 'domainid:' ) )
            // InternalMDML.g:3190:1: ( 'domainid:' )
            {
            // InternalMDML.g:3190:1: ( 'domainid:' )
            // InternalMDML.g:3191:2: 'domainid:'
            {
             before(grammarAccess.getReferenceTypeAccess().getDomainidKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getReferenceTypeAccess().getDomainidKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__3__Impl"


    // $ANTLR start "rule__ReferenceType__Group__4"
    // InternalMDML.g:3200:1: rule__ReferenceType__Group__4 : rule__ReferenceType__Group__4__Impl rule__ReferenceType__Group__5 ;
    public final void rule__ReferenceType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3204:1: ( rule__ReferenceType__Group__4__Impl rule__ReferenceType__Group__5 )
            // InternalMDML.g:3205:2: rule__ReferenceType__Group__4__Impl rule__ReferenceType__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__ReferenceType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__4"


    // $ANTLR start "rule__ReferenceType__Group__4__Impl"
    // InternalMDML.g:3212:1: rule__ReferenceType__Group__4__Impl : ( ( rule__ReferenceType__GuidAssignment_4 ) ) ;
    public final void rule__ReferenceType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3216:1: ( ( ( rule__ReferenceType__GuidAssignment_4 ) ) )
            // InternalMDML.g:3217:1: ( ( rule__ReferenceType__GuidAssignment_4 ) )
            {
            // InternalMDML.g:3217:1: ( ( rule__ReferenceType__GuidAssignment_4 ) )
            // InternalMDML.g:3218:2: ( rule__ReferenceType__GuidAssignment_4 )
            {
             before(grammarAccess.getReferenceTypeAccess().getGuidAssignment_4()); 
            // InternalMDML.g:3219:2: ( rule__ReferenceType__GuidAssignment_4 )
            // InternalMDML.g:3219:3: rule__ReferenceType__GuidAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceType__GuidAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReferenceTypeAccess().getGuidAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__4__Impl"


    // $ANTLR start "rule__ReferenceType__Group__5"
    // InternalMDML.g:3227:1: rule__ReferenceType__Group__5 : rule__ReferenceType__Group__5__Impl rule__ReferenceType__Group__6 ;
    public final void rule__ReferenceType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3231:1: ( rule__ReferenceType__Group__5__Impl rule__ReferenceType__Group__6 )
            // InternalMDML.g:3232:2: rule__ReferenceType__Group__5__Impl rule__ReferenceType__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__ReferenceType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__5"


    // $ANTLR start "rule__ReferenceType__Group__5__Impl"
    // InternalMDML.g:3239:1: rule__ReferenceType__Group__5__Impl : ( '@' ) ;
    public final void rule__ReferenceType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3243:1: ( ( '@' ) )
            // InternalMDML.g:3244:1: ( '@' )
            {
            // InternalMDML.g:3244:1: ( '@' )
            // InternalMDML.g:3245:2: '@'
            {
             before(grammarAccess.getReferenceTypeAccess().getCommercialAtKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getReferenceTypeAccess().getCommercialAtKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__5__Impl"


    // $ANTLR start "rule__ReferenceType__Group__6"
    // InternalMDML.g:3254:1: rule__ReferenceType__Group__6 : rule__ReferenceType__Group__6__Impl rule__ReferenceType__Group__7 ;
    public final void rule__ReferenceType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3258:1: ( rule__ReferenceType__Group__6__Impl rule__ReferenceType__Group__7 )
            // InternalMDML.g:3259:2: rule__ReferenceType__Group__6__Impl rule__ReferenceType__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__ReferenceType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__6"


    // $ANTLR start "rule__ReferenceType__Group__6__Impl"
    // InternalMDML.g:3266:1: rule__ReferenceType__Group__6__Impl : ( '(' ) ;
    public final void rule__ReferenceType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3270:1: ( ( '(' ) )
            // InternalMDML.g:3271:1: ( '(' )
            {
            // InternalMDML.g:3271:1: ( '(' )
            // InternalMDML.g:3272:2: '('
            {
             before(grammarAccess.getReferenceTypeAccess().getLeftParenthesisKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getReferenceTypeAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__6__Impl"


    // $ANTLR start "rule__ReferenceType__Group__7"
    // InternalMDML.g:3281:1: rule__ReferenceType__Group__7 : rule__ReferenceType__Group__7__Impl rule__ReferenceType__Group__8 ;
    public final void rule__ReferenceType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3285:1: ( rule__ReferenceType__Group__7__Impl rule__ReferenceType__Group__8 )
            // InternalMDML.g:3286:2: rule__ReferenceType__Group__7__Impl rule__ReferenceType__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__ReferenceType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__7"


    // $ANTLR start "rule__ReferenceType__Group__7__Impl"
    // InternalMDML.g:3293:1: rule__ReferenceType__Group__7__Impl : ( ruleVersion ) ;
    public final void rule__ReferenceType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3297:1: ( ( ruleVersion ) )
            // InternalMDML.g:3298:1: ( ruleVersion )
            {
            // InternalMDML.g:3298:1: ( ruleVersion )
            // InternalMDML.g:3299:2: ruleVersion
            {
             before(grammarAccess.getReferenceTypeAccess().getVersionParserRuleCall_7()); 
            pushFollow(FOLLOW_2);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getReferenceTypeAccess().getVersionParserRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__7__Impl"


    // $ANTLR start "rule__ReferenceType__Group__8"
    // InternalMDML.g:3308:1: rule__ReferenceType__Group__8 : rule__ReferenceType__Group__8__Impl rule__ReferenceType__Group__9 ;
    public final void rule__ReferenceType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3312:1: ( rule__ReferenceType__Group__8__Impl rule__ReferenceType__Group__9 )
            // InternalMDML.g:3313:2: rule__ReferenceType__Group__8__Impl rule__ReferenceType__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__ReferenceType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__8"


    // $ANTLR start "rule__ReferenceType__Group__8__Impl"
    // InternalMDML.g:3320:1: rule__ReferenceType__Group__8__Impl : ( ')' ) ;
    public final void rule__ReferenceType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3324:1: ( ( ')' ) )
            // InternalMDML.g:3325:1: ( ')' )
            {
            // InternalMDML.g:3325:1: ( ')' )
            // InternalMDML.g:3326:2: ')'
            {
             before(grammarAccess.getReferenceTypeAccess().getRightParenthesisKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getReferenceTypeAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__8__Impl"


    // $ANTLR start "rule__ReferenceType__Group__9"
    // InternalMDML.g:3335:1: rule__ReferenceType__Group__9 : rule__ReferenceType__Group__9__Impl rule__ReferenceType__Group__10 ;
    public final void rule__ReferenceType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3339:1: ( rule__ReferenceType__Group__9__Impl rule__ReferenceType__Group__10 )
            // InternalMDML.g:3340:2: rule__ReferenceType__Group__9__Impl rule__ReferenceType__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__ReferenceType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__9"


    // $ANTLR start "rule__ReferenceType__Group__9__Impl"
    // InternalMDML.g:3347:1: rule__ReferenceType__Group__9__Impl : ( ( rule__ReferenceType__RefinesAssignment_9 ) ) ;
    public final void rule__ReferenceType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3351:1: ( ( ( rule__ReferenceType__RefinesAssignment_9 ) ) )
            // InternalMDML.g:3352:1: ( ( rule__ReferenceType__RefinesAssignment_9 ) )
            {
            // InternalMDML.g:3352:1: ( ( rule__ReferenceType__RefinesAssignment_9 ) )
            // InternalMDML.g:3353:2: ( rule__ReferenceType__RefinesAssignment_9 )
            {
             before(grammarAccess.getReferenceTypeAccess().getRefinesAssignment_9()); 
            // InternalMDML.g:3354:2: ( rule__ReferenceType__RefinesAssignment_9 )
            // InternalMDML.g:3354:3: rule__ReferenceType__RefinesAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceType__RefinesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getReferenceTypeAccess().getRefinesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__9__Impl"


    // $ANTLR start "rule__ReferenceType__Group__10"
    // InternalMDML.g:3362:1: rule__ReferenceType__Group__10 : rule__ReferenceType__Group__10__Impl rule__ReferenceType__Group__11 ;
    public final void rule__ReferenceType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3366:1: ( rule__ReferenceType__Group__10__Impl rule__ReferenceType__Group__11 )
            // InternalMDML.g:3367:2: rule__ReferenceType__Group__10__Impl rule__ReferenceType__Group__11
            {
            pushFollow(FOLLOW_19);
            rule__ReferenceType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__10"


    // $ANTLR start "rule__ReferenceType__Group__10__Impl"
    // InternalMDML.g:3374:1: rule__ReferenceType__Group__10__Impl : ( ( rule__ReferenceType__NameAssignment_10 ) ) ;
    public final void rule__ReferenceType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3378:1: ( ( ( rule__ReferenceType__NameAssignment_10 ) ) )
            // InternalMDML.g:3379:1: ( ( rule__ReferenceType__NameAssignment_10 ) )
            {
            // InternalMDML.g:3379:1: ( ( rule__ReferenceType__NameAssignment_10 ) )
            // InternalMDML.g:3380:2: ( rule__ReferenceType__NameAssignment_10 )
            {
             before(grammarAccess.getReferenceTypeAccess().getNameAssignment_10()); 
            // InternalMDML.g:3381:2: ( rule__ReferenceType__NameAssignment_10 )
            // InternalMDML.g:3381:3: rule__ReferenceType__NameAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceType__NameAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getReferenceTypeAccess().getNameAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__10__Impl"


    // $ANTLR start "rule__ReferenceType__Group__11"
    // InternalMDML.g:3389:1: rule__ReferenceType__Group__11 : rule__ReferenceType__Group__11__Impl rule__ReferenceType__Group__12 ;
    public final void rule__ReferenceType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3393:1: ( rule__ReferenceType__Group__11__Impl rule__ReferenceType__Group__12 )
            // InternalMDML.g:3394:2: rule__ReferenceType__Group__11__Impl rule__ReferenceType__Group__12
            {
            pushFollow(FOLLOW_4);
            rule__ReferenceType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__11"


    // $ANTLR start "rule__ReferenceType__Group__11__Impl"
    // InternalMDML.g:3401:1: rule__ReferenceType__Group__11__Impl : ( ':' ) ;
    public final void rule__ReferenceType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3405:1: ( ( ':' ) )
            // InternalMDML.g:3406:1: ( ':' )
            {
            // InternalMDML.g:3406:1: ( ':' )
            // InternalMDML.g:3407:2: ':'
            {
             before(grammarAccess.getReferenceTypeAccess().getColonKeyword_11()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getReferenceTypeAccess().getColonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__11__Impl"


    // $ANTLR start "rule__ReferenceType__Group__12"
    // InternalMDML.g:3416:1: rule__ReferenceType__Group__12 : rule__ReferenceType__Group__12__Impl ;
    public final void rule__ReferenceType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3420:1: ( rule__ReferenceType__Group__12__Impl )
            // InternalMDML.g:3421:2: rule__ReferenceType__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__12"


    // $ANTLR start "rule__ReferenceType__Group__12__Impl"
    // InternalMDML.g:3427:1: rule__ReferenceType__Group__12__Impl : ( ( rule__ReferenceType__TypeAssignment_12 ) ) ;
    public final void rule__ReferenceType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3431:1: ( ( ( rule__ReferenceType__TypeAssignment_12 ) ) )
            // InternalMDML.g:3432:1: ( ( rule__ReferenceType__TypeAssignment_12 ) )
            {
            // InternalMDML.g:3432:1: ( ( rule__ReferenceType__TypeAssignment_12 ) )
            // InternalMDML.g:3433:2: ( rule__ReferenceType__TypeAssignment_12 )
            {
             before(grammarAccess.getReferenceTypeAccess().getTypeAssignment_12()); 
            // InternalMDML.g:3434:2: ( rule__ReferenceType__TypeAssignment_12 )
            // InternalMDML.g:3434:3: rule__ReferenceType__TypeAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceType__TypeAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getReferenceTypeAccess().getTypeAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__Group__12__Impl"


    // $ANTLR start "rule__PrimitiveType__Group__0"
    // InternalMDML.g:3443:1: rule__PrimitiveType__Group__0 : rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 ;
    public final void rule__PrimitiveType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3447:1: ( rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 )
            // InternalMDML.g:3448:2: rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__PrimitiveType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group__0"


    // $ANTLR start "rule__PrimitiveType__Group__0__Impl"
    // InternalMDML.g:3455:1: rule__PrimitiveType__Group__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3459:1: ( ( () ) )
            // InternalMDML.g:3460:1: ( () )
            {
            // InternalMDML.g:3460:1: ( () )
            // InternalMDML.g:3461:2: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypeAction_0()); 
            // InternalMDML.g:3462:2: ()
            // InternalMDML.g:3462:3: 
            {
            }

             after(grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group__0__Impl"


    // $ANTLR start "rule__PrimitiveType__Group__1"
    // InternalMDML.g:3470:1: rule__PrimitiveType__Group__1 : rule__PrimitiveType__Group__1__Impl ;
    public final void rule__PrimitiveType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3474:1: ( rule__PrimitiveType__Group__1__Impl )
            // InternalMDML.g:3475:2: rule__PrimitiveType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group__1"


    // $ANTLR start "rule__PrimitiveType__Group__1__Impl"
    // InternalMDML.g:3481:1: rule__PrimitiveType__Group__1__Impl : ( ( rule__PrimitiveType__Group_1__0 ) ) ;
    public final void rule__PrimitiveType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3485:1: ( ( ( rule__PrimitiveType__Group_1__0 ) ) )
            // InternalMDML.g:3486:1: ( ( rule__PrimitiveType__Group_1__0 ) )
            {
            // InternalMDML.g:3486:1: ( ( rule__PrimitiveType__Group_1__0 ) )
            // InternalMDML.g:3487:2: ( rule__PrimitiveType__Group_1__0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getGroup_1()); 
            // InternalMDML.g:3488:2: ( rule__PrimitiveType__Group_1__0 )
            // InternalMDML.g:3488:3: rule__PrimitiveType__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group__1__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_1__0"
    // InternalMDML.g:3497:1: rule__PrimitiveType__Group_1__0 : rule__PrimitiveType__Group_1__0__Impl rule__PrimitiveType__Group_1__1 ;
    public final void rule__PrimitiveType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3501:1: ( rule__PrimitiveType__Group_1__0__Impl rule__PrimitiveType__Group_1__1 )
            // InternalMDML.g:3502:2: rule__PrimitiveType__Group_1__0__Impl rule__PrimitiveType__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__PrimitiveType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__0"


    // $ANTLR start "rule__PrimitiveType__Group_1__0__Impl"
    // InternalMDML.g:3509:1: rule__PrimitiveType__Group_1__0__Impl : ( 'datatype' ) ;
    public final void rule__PrimitiveType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3513:1: ( ( 'datatype' ) )
            // InternalMDML.g:3514:1: ( 'datatype' )
            {
            // InternalMDML.g:3514:1: ( 'datatype' )
            // InternalMDML.g:3515:2: 'datatype'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getDatatypeKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getDatatypeKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__0__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_1__1"
    // InternalMDML.g:3524:1: rule__PrimitiveType__Group_1__1 : rule__PrimitiveType__Group_1__1__Impl rule__PrimitiveType__Group_1__2 ;
    public final void rule__PrimitiveType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3528:1: ( rule__PrimitiveType__Group_1__1__Impl rule__PrimitiveType__Group_1__2 )
            // InternalMDML.g:3529:2: rule__PrimitiveType__Group_1__1__Impl rule__PrimitiveType__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__PrimitiveType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__1"


    // $ANTLR start "rule__PrimitiveType__Group_1__1__Impl"
    // InternalMDML.g:3536:1: rule__PrimitiveType__Group_1__1__Impl : ( 'status:' ) ;
    public final void rule__PrimitiveType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3540:1: ( ( 'status:' ) )
            // InternalMDML.g:3541:1: ( 'status:' )
            {
            // InternalMDML.g:3541:1: ( 'status:' )
            // InternalMDML.g:3542:2: 'status:'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getStatusKeyword_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getStatusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__1__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_1__2"
    // InternalMDML.g:3551:1: rule__PrimitiveType__Group_1__2 : rule__PrimitiveType__Group_1__2__Impl rule__PrimitiveType__Group_1__3 ;
    public final void rule__PrimitiveType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3555:1: ( rule__PrimitiveType__Group_1__2__Impl rule__PrimitiveType__Group_1__3 )
            // InternalMDML.g:3556:2: rule__PrimitiveType__Group_1__2__Impl rule__PrimitiveType__Group_1__3
            {
            pushFollow(FOLLOW_7);
            rule__PrimitiveType__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__2"


    // $ANTLR start "rule__PrimitiveType__Group_1__2__Impl"
    // InternalMDML.g:3563:1: rule__PrimitiveType__Group_1__2__Impl : ( ( rule__PrimitiveType__StatusAssignment_1_2 ) ) ;
    public final void rule__PrimitiveType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3567:1: ( ( ( rule__PrimitiveType__StatusAssignment_1_2 ) ) )
            // InternalMDML.g:3568:1: ( ( rule__PrimitiveType__StatusAssignment_1_2 ) )
            {
            // InternalMDML.g:3568:1: ( ( rule__PrimitiveType__StatusAssignment_1_2 ) )
            // InternalMDML.g:3569:2: ( rule__PrimitiveType__StatusAssignment_1_2 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getStatusAssignment_1_2()); 
            // InternalMDML.g:3570:2: ( rule__PrimitiveType__StatusAssignment_1_2 )
            // InternalMDML.g:3570:3: rule__PrimitiveType__StatusAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__StatusAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getStatusAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__2__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_1__3"
    // InternalMDML.g:3578:1: rule__PrimitiveType__Group_1__3 : rule__PrimitiveType__Group_1__3__Impl rule__PrimitiveType__Group_1__4 ;
    public final void rule__PrimitiveType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3582:1: ( rule__PrimitiveType__Group_1__3__Impl rule__PrimitiveType__Group_1__4 )
            // InternalMDML.g:3583:2: rule__PrimitiveType__Group_1__3__Impl rule__PrimitiveType__Group_1__4
            {
            pushFollow(FOLLOW_4);
            rule__PrimitiveType__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__3"


    // $ANTLR start "rule__PrimitiveType__Group_1__3__Impl"
    // InternalMDML.g:3590:1: rule__PrimitiveType__Group_1__3__Impl : ( 'domainid:' ) ;
    public final void rule__PrimitiveType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3594:1: ( ( 'domainid:' ) )
            // InternalMDML.g:3595:1: ( 'domainid:' )
            {
            // InternalMDML.g:3595:1: ( 'domainid:' )
            // InternalMDML.g:3596:2: 'domainid:'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getDomainidKeyword_1_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getDomainidKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__3__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_1__4"
    // InternalMDML.g:3605:1: rule__PrimitiveType__Group_1__4 : rule__PrimitiveType__Group_1__4__Impl rule__PrimitiveType__Group_1__5 ;
    public final void rule__PrimitiveType__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3609:1: ( rule__PrimitiveType__Group_1__4__Impl rule__PrimitiveType__Group_1__5 )
            // InternalMDML.g:3610:2: rule__PrimitiveType__Group_1__4__Impl rule__PrimitiveType__Group_1__5
            {
            pushFollow(FOLLOW_8);
            rule__PrimitiveType__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__4"


    // $ANTLR start "rule__PrimitiveType__Group_1__4__Impl"
    // InternalMDML.g:3617:1: rule__PrimitiveType__Group_1__4__Impl : ( ( rule__PrimitiveType__GuidAssignment_1_4 ) ) ;
    public final void rule__PrimitiveType__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3621:1: ( ( ( rule__PrimitiveType__GuidAssignment_1_4 ) ) )
            // InternalMDML.g:3622:1: ( ( rule__PrimitiveType__GuidAssignment_1_4 ) )
            {
            // InternalMDML.g:3622:1: ( ( rule__PrimitiveType__GuidAssignment_1_4 ) )
            // InternalMDML.g:3623:2: ( rule__PrimitiveType__GuidAssignment_1_4 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getGuidAssignment_1_4()); 
            // InternalMDML.g:3624:2: ( rule__PrimitiveType__GuidAssignment_1_4 )
            // InternalMDML.g:3624:3: rule__PrimitiveType__GuidAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__GuidAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getGuidAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__4__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_1__5"
    // InternalMDML.g:3632:1: rule__PrimitiveType__Group_1__5 : rule__PrimitiveType__Group_1__5__Impl rule__PrimitiveType__Group_1__6 ;
    public final void rule__PrimitiveType__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3636:1: ( rule__PrimitiveType__Group_1__5__Impl rule__PrimitiveType__Group_1__6 )
            // InternalMDML.g:3637:2: rule__PrimitiveType__Group_1__5__Impl rule__PrimitiveType__Group_1__6
            {
            pushFollow(FOLLOW_9);
            rule__PrimitiveType__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__5"


    // $ANTLR start "rule__PrimitiveType__Group_1__5__Impl"
    // InternalMDML.g:3644:1: rule__PrimitiveType__Group_1__5__Impl : ( '@' ) ;
    public final void rule__PrimitiveType__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3648:1: ( ( '@' ) )
            // InternalMDML.g:3649:1: ( '@' )
            {
            // InternalMDML.g:3649:1: ( '@' )
            // InternalMDML.g:3650:2: '@'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getCommercialAtKeyword_1_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getCommercialAtKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__5__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_1__6"
    // InternalMDML.g:3659:1: rule__PrimitiveType__Group_1__6 : rule__PrimitiveType__Group_1__6__Impl rule__PrimitiveType__Group_1__7 ;
    public final void rule__PrimitiveType__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3663:1: ( rule__PrimitiveType__Group_1__6__Impl rule__PrimitiveType__Group_1__7 )
            // InternalMDML.g:3664:2: rule__PrimitiveType__Group_1__6__Impl rule__PrimitiveType__Group_1__7
            {
            pushFollow(FOLLOW_10);
            rule__PrimitiveType__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_1__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__6"


    // $ANTLR start "rule__PrimitiveType__Group_1__6__Impl"
    // InternalMDML.g:3671:1: rule__PrimitiveType__Group_1__6__Impl : ( '(' ) ;
    public final void rule__PrimitiveType__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3675:1: ( ( '(' ) )
            // InternalMDML.g:3676:1: ( '(' )
            {
            // InternalMDML.g:3676:1: ( '(' )
            // InternalMDML.g:3677:2: '('
            {
             before(grammarAccess.getPrimitiveTypeAccess().getLeftParenthesisKeyword_1_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getLeftParenthesisKeyword_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__6__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_1__7"
    // InternalMDML.g:3686:1: rule__PrimitiveType__Group_1__7 : rule__PrimitiveType__Group_1__7__Impl rule__PrimitiveType__Group_1__8 ;
    public final void rule__PrimitiveType__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3690:1: ( rule__PrimitiveType__Group_1__7__Impl rule__PrimitiveType__Group_1__8 )
            // InternalMDML.g:3691:2: rule__PrimitiveType__Group_1__7__Impl rule__PrimitiveType__Group_1__8
            {
            pushFollow(FOLLOW_11);
            rule__PrimitiveType__Group_1__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_1__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__7"


    // $ANTLR start "rule__PrimitiveType__Group_1__7__Impl"
    // InternalMDML.g:3698:1: rule__PrimitiveType__Group_1__7__Impl : ( ruleVersion ) ;
    public final void rule__PrimitiveType__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3702:1: ( ( ruleVersion ) )
            // InternalMDML.g:3703:1: ( ruleVersion )
            {
            // InternalMDML.g:3703:1: ( ruleVersion )
            // InternalMDML.g:3704:2: ruleVersion
            {
             before(grammarAccess.getPrimitiveTypeAccess().getVersionParserRuleCall_1_7()); 
            pushFollow(FOLLOW_2);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeAccess().getVersionParserRuleCall_1_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__7__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_1__8"
    // InternalMDML.g:3713:1: rule__PrimitiveType__Group_1__8 : rule__PrimitiveType__Group_1__8__Impl rule__PrimitiveType__Group_1__9 ;
    public final void rule__PrimitiveType__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3717:1: ( rule__PrimitiveType__Group_1__8__Impl rule__PrimitiveType__Group_1__9 )
            // InternalMDML.g:3718:2: rule__PrimitiveType__Group_1__8__Impl rule__PrimitiveType__Group_1__9
            {
            pushFollow(FOLLOW_12);
            rule__PrimitiveType__Group_1__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_1__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__8"


    // $ANTLR start "rule__PrimitiveType__Group_1__8__Impl"
    // InternalMDML.g:3725:1: rule__PrimitiveType__Group_1__8__Impl : ( ')' ) ;
    public final void rule__PrimitiveType__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3729:1: ( ( ')' ) )
            // InternalMDML.g:3730:1: ( ')' )
            {
            // InternalMDML.g:3730:1: ( ')' )
            // InternalMDML.g:3731:2: ')'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getRightParenthesisKeyword_1_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getRightParenthesisKeyword_1_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__8__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_1__9"
    // InternalMDML.g:3740:1: rule__PrimitiveType__Group_1__9 : rule__PrimitiveType__Group_1__9__Impl rule__PrimitiveType__Group_1__10 ;
    public final void rule__PrimitiveType__Group_1__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3744:1: ( rule__PrimitiveType__Group_1__9__Impl rule__PrimitiveType__Group_1__10 )
            // InternalMDML.g:3745:2: rule__PrimitiveType__Group_1__9__Impl rule__PrimitiveType__Group_1__10
            {
            pushFollow(FOLLOW_4);
            rule__PrimitiveType__Group_1__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_1__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__9"


    // $ANTLR start "rule__PrimitiveType__Group_1__9__Impl"
    // InternalMDML.g:3752:1: rule__PrimitiveType__Group_1__9__Impl : ( ( rule__PrimitiveType__RefinesAssignment_1_9 ) ) ;
    public final void rule__PrimitiveType__Group_1__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3756:1: ( ( ( rule__PrimitiveType__RefinesAssignment_1_9 ) ) )
            // InternalMDML.g:3757:1: ( ( rule__PrimitiveType__RefinesAssignment_1_9 ) )
            {
            // InternalMDML.g:3757:1: ( ( rule__PrimitiveType__RefinesAssignment_1_9 ) )
            // InternalMDML.g:3758:2: ( rule__PrimitiveType__RefinesAssignment_1_9 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getRefinesAssignment_1_9()); 
            // InternalMDML.g:3759:2: ( rule__PrimitiveType__RefinesAssignment_1_9 )
            // InternalMDML.g:3759:3: rule__PrimitiveType__RefinesAssignment_1_9
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__RefinesAssignment_1_9();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getRefinesAssignment_1_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__9__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_1__10"
    // InternalMDML.g:3767:1: rule__PrimitiveType__Group_1__10 : rule__PrimitiveType__Group_1__10__Impl rule__PrimitiveType__Group_1__11 ;
    public final void rule__PrimitiveType__Group_1__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3771:1: ( rule__PrimitiveType__Group_1__10__Impl rule__PrimitiveType__Group_1__11 )
            // InternalMDML.g:3772:2: rule__PrimitiveType__Group_1__10__Impl rule__PrimitiveType__Group_1__11
            {
            pushFollow(FOLLOW_19);
            rule__PrimitiveType__Group_1__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_1__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__10"


    // $ANTLR start "rule__PrimitiveType__Group_1__10__Impl"
    // InternalMDML.g:3779:1: rule__PrimitiveType__Group_1__10__Impl : ( ( rule__PrimitiveType__NameAssignment_1_10 ) ) ;
    public final void rule__PrimitiveType__Group_1__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3783:1: ( ( ( rule__PrimitiveType__NameAssignment_1_10 ) ) )
            // InternalMDML.g:3784:1: ( ( rule__PrimitiveType__NameAssignment_1_10 ) )
            {
            // InternalMDML.g:3784:1: ( ( rule__PrimitiveType__NameAssignment_1_10 ) )
            // InternalMDML.g:3785:2: ( rule__PrimitiveType__NameAssignment_1_10 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getNameAssignment_1_10()); 
            // InternalMDML.g:3786:2: ( rule__PrimitiveType__NameAssignment_1_10 )
            // InternalMDML.g:3786:3: rule__PrimitiveType__NameAssignment_1_10
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__NameAssignment_1_10();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getNameAssignment_1_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__10__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_1__11"
    // InternalMDML.g:3794:1: rule__PrimitiveType__Group_1__11 : rule__PrimitiveType__Group_1__11__Impl rule__PrimitiveType__Group_1__12 ;
    public final void rule__PrimitiveType__Group_1__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3798:1: ( rule__PrimitiveType__Group_1__11__Impl rule__PrimitiveType__Group_1__12 )
            // InternalMDML.g:3799:2: rule__PrimitiveType__Group_1__11__Impl rule__PrimitiveType__Group_1__12
            {
            pushFollow(FOLLOW_34);
            rule__PrimitiveType__Group_1__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_1__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__11"


    // $ANTLR start "rule__PrimitiveType__Group_1__11__Impl"
    // InternalMDML.g:3806:1: rule__PrimitiveType__Group_1__11__Impl : ( ':' ) ;
    public final void rule__PrimitiveType__Group_1__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3810:1: ( ( ':' ) )
            // InternalMDML.g:3811:1: ( ':' )
            {
            // InternalMDML.g:3811:1: ( ':' )
            // InternalMDML.g:3812:2: ':'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getColonKeyword_1_11()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getColonKeyword_1_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__11__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_1__12"
    // InternalMDML.g:3821:1: rule__PrimitiveType__Group_1__12 : rule__PrimitiveType__Group_1__12__Impl rule__PrimitiveType__Group_1__13 ;
    public final void rule__PrimitiveType__Group_1__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3825:1: ( rule__PrimitiveType__Group_1__12__Impl rule__PrimitiveType__Group_1__13 )
            // InternalMDML.g:3826:2: rule__PrimitiveType__Group_1__12__Impl rule__PrimitiveType__Group_1__13
            {
            pushFollow(FOLLOW_4);
            rule__PrimitiveType__Group_1__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_1__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__12"


    // $ANTLR start "rule__PrimitiveType__Group_1__12__Impl"
    // InternalMDML.g:3833:1: rule__PrimitiveType__Group_1__12__Impl : ( ( rule__PrimitiveType__TypeAssignment_1_12 ) ) ;
    public final void rule__PrimitiveType__Group_1__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3837:1: ( ( ( rule__PrimitiveType__TypeAssignment_1_12 ) ) )
            // InternalMDML.g:3838:1: ( ( rule__PrimitiveType__TypeAssignment_1_12 ) )
            {
            // InternalMDML.g:3838:1: ( ( rule__PrimitiveType__TypeAssignment_1_12 ) )
            // InternalMDML.g:3839:2: ( rule__PrimitiveType__TypeAssignment_1_12 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getTypeAssignment_1_12()); 
            // InternalMDML.g:3840:2: ( rule__PrimitiveType__TypeAssignment_1_12 )
            // InternalMDML.g:3840:3: rule__PrimitiveType__TypeAssignment_1_12
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__TypeAssignment_1_12();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getTypeAssignment_1_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__12__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_1__13"
    // InternalMDML.g:3848:1: rule__PrimitiveType__Group_1__13 : rule__PrimitiveType__Group_1__13__Impl ;
    public final void rule__PrimitiveType__Group_1__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3852:1: ( rule__PrimitiveType__Group_1__13__Impl )
            // InternalMDML.g:3853:2: rule__PrimitiveType__Group_1__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_1__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__13"


    // $ANTLR start "rule__PrimitiveType__Group_1__13__Impl"
    // InternalMDML.g:3859:1: rule__PrimitiveType__Group_1__13__Impl : ( ( rule__PrimitiveType__RuleAssignment_1_13 )? ) ;
    public final void rule__PrimitiveType__Group_1__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3863:1: ( ( ( rule__PrimitiveType__RuleAssignment_1_13 )? ) )
            // InternalMDML.g:3864:1: ( ( rule__PrimitiveType__RuleAssignment_1_13 )? )
            {
            // InternalMDML.g:3864:1: ( ( rule__PrimitiveType__RuleAssignment_1_13 )? )
            // InternalMDML.g:3865:2: ( rule__PrimitiveType__RuleAssignment_1_13 )?
            {
             before(grammarAccess.getPrimitiveTypeAccess().getRuleAssignment_1_13()); 
            // InternalMDML.g:3866:2: ( rule__PrimitiveType__RuleAssignment_1_13 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMDML.g:3866:3: rule__PrimitiveType__RuleAssignment_1_13
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveType__RuleAssignment_1_13();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimitiveTypeAccess().getRuleAssignment_1_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__13__Impl"


    // $ANTLR start "rule__DataClass__Group__0"
    // InternalMDML.g:3875:1: rule__DataClass__Group__0 : rule__DataClass__Group__0__Impl rule__DataClass__Group__1 ;
    public final void rule__DataClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3879:1: ( rule__DataClass__Group__0__Impl rule__DataClass__Group__1 )
            // InternalMDML.g:3880:2: rule__DataClass__Group__0__Impl rule__DataClass__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DataClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__0"


    // $ANTLR start "rule__DataClass__Group__0__Impl"
    // InternalMDML.g:3887:1: rule__DataClass__Group__0__Impl : ( 'DataClass' ) ;
    public final void rule__DataClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3891:1: ( ( 'DataClass' ) )
            // InternalMDML.g:3892:1: ( 'DataClass' )
            {
            // InternalMDML.g:3892:1: ( 'DataClass' )
            // InternalMDML.g:3893:2: 'DataClass'
            {
             before(grammarAccess.getDataClassAccess().getDataClassKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDataClassAccess().getDataClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__0__Impl"


    // $ANTLR start "rule__DataClass__Group__1"
    // InternalMDML.g:3902:1: rule__DataClass__Group__1 : rule__DataClass__Group__1__Impl rule__DataClass__Group__2 ;
    public final void rule__DataClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3906:1: ( rule__DataClass__Group__1__Impl rule__DataClass__Group__2 )
            // InternalMDML.g:3907:2: rule__DataClass__Group__1__Impl rule__DataClass__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__DataClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__1"


    // $ANTLR start "rule__DataClass__Group__1__Impl"
    // InternalMDML.g:3914:1: rule__DataClass__Group__1__Impl : ( 'status:' ) ;
    public final void rule__DataClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3918:1: ( ( 'status:' ) )
            // InternalMDML.g:3919:1: ( 'status:' )
            {
            // InternalMDML.g:3919:1: ( 'status:' )
            // InternalMDML.g:3920:2: 'status:'
            {
             before(grammarAccess.getDataClassAccess().getStatusKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDataClassAccess().getStatusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__1__Impl"


    // $ANTLR start "rule__DataClass__Group__2"
    // InternalMDML.g:3929:1: rule__DataClass__Group__2 : rule__DataClass__Group__2__Impl rule__DataClass__Group__3 ;
    public final void rule__DataClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3933:1: ( rule__DataClass__Group__2__Impl rule__DataClass__Group__3 )
            // InternalMDML.g:3934:2: rule__DataClass__Group__2__Impl rule__DataClass__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__DataClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__2"


    // $ANTLR start "rule__DataClass__Group__2__Impl"
    // InternalMDML.g:3941:1: rule__DataClass__Group__2__Impl : ( ( rule__DataClass__StatusAssignment_2 ) ) ;
    public final void rule__DataClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3945:1: ( ( ( rule__DataClass__StatusAssignment_2 ) ) )
            // InternalMDML.g:3946:1: ( ( rule__DataClass__StatusAssignment_2 ) )
            {
            // InternalMDML.g:3946:1: ( ( rule__DataClass__StatusAssignment_2 ) )
            // InternalMDML.g:3947:2: ( rule__DataClass__StatusAssignment_2 )
            {
             before(grammarAccess.getDataClassAccess().getStatusAssignment_2()); 
            // InternalMDML.g:3948:2: ( rule__DataClass__StatusAssignment_2 )
            // InternalMDML.g:3948:3: rule__DataClass__StatusAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DataClass__StatusAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataClassAccess().getStatusAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__2__Impl"


    // $ANTLR start "rule__DataClass__Group__3"
    // InternalMDML.g:3956:1: rule__DataClass__Group__3 : rule__DataClass__Group__3__Impl rule__DataClass__Group__4 ;
    public final void rule__DataClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3960:1: ( rule__DataClass__Group__3__Impl rule__DataClass__Group__4 )
            // InternalMDML.g:3961:2: rule__DataClass__Group__3__Impl rule__DataClass__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__DataClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__3"


    // $ANTLR start "rule__DataClass__Group__3__Impl"
    // InternalMDML.g:3968:1: rule__DataClass__Group__3__Impl : ( 'domainid:' ) ;
    public final void rule__DataClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3972:1: ( ( 'domainid:' ) )
            // InternalMDML.g:3973:1: ( 'domainid:' )
            {
            // InternalMDML.g:3973:1: ( 'domainid:' )
            // InternalMDML.g:3974:2: 'domainid:'
            {
             before(grammarAccess.getDataClassAccess().getDomainidKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDataClassAccess().getDomainidKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__3__Impl"


    // $ANTLR start "rule__DataClass__Group__4"
    // InternalMDML.g:3983:1: rule__DataClass__Group__4 : rule__DataClass__Group__4__Impl rule__DataClass__Group__5 ;
    public final void rule__DataClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3987:1: ( rule__DataClass__Group__4__Impl rule__DataClass__Group__5 )
            // InternalMDML.g:3988:2: rule__DataClass__Group__4__Impl rule__DataClass__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__DataClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataClass__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__4"


    // $ANTLR start "rule__DataClass__Group__4__Impl"
    // InternalMDML.g:3995:1: rule__DataClass__Group__4__Impl : ( ( rule__DataClass__GuidAssignment_4 ) ) ;
    public final void rule__DataClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:3999:1: ( ( ( rule__DataClass__GuidAssignment_4 ) ) )
            // InternalMDML.g:4000:1: ( ( rule__DataClass__GuidAssignment_4 ) )
            {
            // InternalMDML.g:4000:1: ( ( rule__DataClass__GuidAssignment_4 ) )
            // InternalMDML.g:4001:2: ( rule__DataClass__GuidAssignment_4 )
            {
             before(grammarAccess.getDataClassAccess().getGuidAssignment_4()); 
            // InternalMDML.g:4002:2: ( rule__DataClass__GuidAssignment_4 )
            // InternalMDML.g:4002:3: rule__DataClass__GuidAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DataClass__GuidAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDataClassAccess().getGuidAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__4__Impl"


    // $ANTLR start "rule__DataClass__Group__5"
    // InternalMDML.g:4010:1: rule__DataClass__Group__5 : rule__DataClass__Group__5__Impl rule__DataClass__Group__6 ;
    public final void rule__DataClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4014:1: ( rule__DataClass__Group__5__Impl rule__DataClass__Group__6 )
            // InternalMDML.g:4015:2: rule__DataClass__Group__5__Impl rule__DataClass__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__DataClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataClass__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__5"


    // $ANTLR start "rule__DataClass__Group__5__Impl"
    // InternalMDML.g:4022:1: rule__DataClass__Group__5__Impl : ( '@' ) ;
    public final void rule__DataClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4026:1: ( ( '@' ) )
            // InternalMDML.g:4027:1: ( '@' )
            {
            // InternalMDML.g:4027:1: ( '@' )
            // InternalMDML.g:4028:2: '@'
            {
             before(grammarAccess.getDataClassAccess().getCommercialAtKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDataClassAccess().getCommercialAtKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__5__Impl"


    // $ANTLR start "rule__DataClass__Group__6"
    // InternalMDML.g:4037:1: rule__DataClass__Group__6 : rule__DataClass__Group__6__Impl rule__DataClass__Group__7 ;
    public final void rule__DataClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4041:1: ( rule__DataClass__Group__6__Impl rule__DataClass__Group__7 )
            // InternalMDML.g:4042:2: rule__DataClass__Group__6__Impl rule__DataClass__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__DataClass__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataClass__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__6"


    // $ANTLR start "rule__DataClass__Group__6__Impl"
    // InternalMDML.g:4049:1: rule__DataClass__Group__6__Impl : ( '(' ) ;
    public final void rule__DataClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4053:1: ( ( '(' ) )
            // InternalMDML.g:4054:1: ( '(' )
            {
            // InternalMDML.g:4054:1: ( '(' )
            // InternalMDML.g:4055:2: '('
            {
             before(grammarAccess.getDataClassAccess().getLeftParenthesisKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDataClassAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__6__Impl"


    // $ANTLR start "rule__DataClass__Group__7"
    // InternalMDML.g:4064:1: rule__DataClass__Group__7 : rule__DataClass__Group__7__Impl rule__DataClass__Group__8 ;
    public final void rule__DataClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4068:1: ( rule__DataClass__Group__7__Impl rule__DataClass__Group__8 )
            // InternalMDML.g:4069:2: rule__DataClass__Group__7__Impl rule__DataClass__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__DataClass__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataClass__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__7"


    // $ANTLR start "rule__DataClass__Group__7__Impl"
    // InternalMDML.g:4076:1: rule__DataClass__Group__7__Impl : ( ruleVersion ) ;
    public final void rule__DataClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4080:1: ( ( ruleVersion ) )
            // InternalMDML.g:4081:1: ( ruleVersion )
            {
            // InternalMDML.g:4081:1: ( ruleVersion )
            // InternalMDML.g:4082:2: ruleVersion
            {
             before(grammarAccess.getDataClassAccess().getVersionParserRuleCall_7()); 
            pushFollow(FOLLOW_2);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getDataClassAccess().getVersionParserRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__7__Impl"


    // $ANTLR start "rule__DataClass__Group__8"
    // InternalMDML.g:4091:1: rule__DataClass__Group__8 : rule__DataClass__Group__8__Impl rule__DataClass__Group__9 ;
    public final void rule__DataClass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4095:1: ( rule__DataClass__Group__8__Impl rule__DataClass__Group__9 )
            // InternalMDML.g:4096:2: rule__DataClass__Group__8__Impl rule__DataClass__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__DataClass__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataClass__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__8"


    // $ANTLR start "rule__DataClass__Group__8__Impl"
    // InternalMDML.g:4103:1: rule__DataClass__Group__8__Impl : ( ')' ) ;
    public final void rule__DataClass__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4107:1: ( ( ')' ) )
            // InternalMDML.g:4108:1: ( ')' )
            {
            // InternalMDML.g:4108:1: ( ')' )
            // InternalMDML.g:4109:2: ')'
            {
             before(grammarAccess.getDataClassAccess().getRightParenthesisKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDataClassAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__8__Impl"


    // $ANTLR start "rule__DataClass__Group__9"
    // InternalMDML.g:4118:1: rule__DataClass__Group__9 : rule__DataClass__Group__9__Impl rule__DataClass__Group__10 ;
    public final void rule__DataClass__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4122:1: ( rule__DataClass__Group__9__Impl rule__DataClass__Group__10 )
            // InternalMDML.g:4123:2: rule__DataClass__Group__9__Impl rule__DataClass__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__DataClass__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataClass__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__9"


    // $ANTLR start "rule__DataClass__Group__9__Impl"
    // InternalMDML.g:4130:1: rule__DataClass__Group__9__Impl : ( ( rule__DataClass__RefinesAssignment_9 ) ) ;
    public final void rule__DataClass__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4134:1: ( ( ( rule__DataClass__RefinesAssignment_9 ) ) )
            // InternalMDML.g:4135:1: ( ( rule__DataClass__RefinesAssignment_9 ) )
            {
            // InternalMDML.g:4135:1: ( ( rule__DataClass__RefinesAssignment_9 ) )
            // InternalMDML.g:4136:2: ( rule__DataClass__RefinesAssignment_9 )
            {
             before(grammarAccess.getDataClassAccess().getRefinesAssignment_9()); 
            // InternalMDML.g:4137:2: ( rule__DataClass__RefinesAssignment_9 )
            // InternalMDML.g:4137:3: rule__DataClass__RefinesAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__DataClass__RefinesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getDataClassAccess().getRefinesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__9__Impl"


    // $ANTLR start "rule__DataClass__Group__10"
    // InternalMDML.g:4145:1: rule__DataClass__Group__10 : rule__DataClass__Group__10__Impl rule__DataClass__Group__11 ;
    public final void rule__DataClass__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4149:1: ( rule__DataClass__Group__10__Impl rule__DataClass__Group__11 )
            // InternalMDML.g:4150:2: rule__DataClass__Group__10__Impl rule__DataClass__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__DataClass__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataClass__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__10"


    // $ANTLR start "rule__DataClass__Group__10__Impl"
    // InternalMDML.g:4157:1: rule__DataClass__Group__10__Impl : ( ( rule__DataClass__NameAssignment_10 ) ) ;
    public final void rule__DataClass__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4161:1: ( ( ( rule__DataClass__NameAssignment_10 ) ) )
            // InternalMDML.g:4162:1: ( ( rule__DataClass__NameAssignment_10 ) )
            {
            // InternalMDML.g:4162:1: ( ( rule__DataClass__NameAssignment_10 ) )
            // InternalMDML.g:4163:2: ( rule__DataClass__NameAssignment_10 )
            {
             before(grammarAccess.getDataClassAccess().getNameAssignment_10()); 
            // InternalMDML.g:4164:2: ( rule__DataClass__NameAssignment_10 )
            // InternalMDML.g:4164:3: rule__DataClass__NameAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__DataClass__NameAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getDataClassAccess().getNameAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__10__Impl"


    // $ANTLR start "rule__DataClass__Group__11"
    // InternalMDML.g:4172:1: rule__DataClass__Group__11 : rule__DataClass__Group__11__Impl rule__DataClass__Group__12 ;
    public final void rule__DataClass__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4176:1: ( rule__DataClass__Group__11__Impl rule__DataClass__Group__12 )
            // InternalMDML.g:4177:2: rule__DataClass__Group__11__Impl rule__DataClass__Group__12
            {
            pushFollow(FOLLOW_35);
            rule__DataClass__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataClass__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__11"


    // $ANTLR start "rule__DataClass__Group__11__Impl"
    // InternalMDML.g:4184:1: rule__DataClass__Group__11__Impl : ( '{' ) ;
    public final void rule__DataClass__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4188:1: ( ( '{' ) )
            // InternalMDML.g:4189:1: ( '{' )
            {
            // InternalMDML.g:4189:1: ( '{' )
            // InternalMDML.g:4190:2: '{'
            {
             before(grammarAccess.getDataClassAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDataClassAccess().getLeftCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__11__Impl"


    // $ANTLR start "rule__DataClass__Group__12"
    // InternalMDML.g:4199:1: rule__DataClass__Group__12 : rule__DataClass__Group__12__Impl rule__DataClass__Group__13 ;
    public final void rule__DataClass__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4203:1: ( rule__DataClass__Group__12__Impl rule__DataClass__Group__13 )
            // InternalMDML.g:4204:2: rule__DataClass__Group__12__Impl rule__DataClass__Group__13
            {
            pushFollow(FOLLOW_35);
            rule__DataClass__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataClass__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__12"


    // $ANTLR start "rule__DataClass__Group__12__Impl"
    // InternalMDML.g:4211:1: rule__DataClass__Group__12__Impl : ( ( rule__DataClass__DataelementsAssignment_12 )* ) ;
    public final void rule__DataClass__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4215:1: ( ( ( rule__DataClass__DataelementsAssignment_12 )* ) )
            // InternalMDML.g:4216:1: ( ( rule__DataClass__DataelementsAssignment_12 )* )
            {
            // InternalMDML.g:4216:1: ( ( rule__DataClass__DataelementsAssignment_12 )* )
            // InternalMDML.g:4217:2: ( rule__DataClass__DataelementsAssignment_12 )*
            {
             before(grammarAccess.getDataClassAccess().getDataelementsAssignment_12()); 
            // InternalMDML.g:4218:2: ( rule__DataClass__DataelementsAssignment_12 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==30||(LA23_0>=41 && LA23_0<=42)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMDML.g:4218:3: rule__DataClass__DataelementsAssignment_12
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__DataClass__DataelementsAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getDataClassAccess().getDataelementsAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__12__Impl"


    // $ANTLR start "rule__DataClass__Group__13"
    // InternalMDML.g:4226:1: rule__DataClass__Group__13 : rule__DataClass__Group__13__Impl rule__DataClass__Group__14 ;
    public final void rule__DataClass__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4230:1: ( rule__DataClass__Group__13__Impl rule__DataClass__Group__14 )
            // InternalMDML.g:4231:2: rule__DataClass__Group__13__Impl rule__DataClass__Group__14
            {
            pushFollow(FOLLOW_35);
            rule__DataClass__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataClass__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__13"


    // $ANTLR start "rule__DataClass__Group__13__Impl"
    // InternalMDML.g:4238:1: rule__DataClass__Group__13__Impl : ( ( rule__DataClass__ExtensionAssignment_13 )* ) ;
    public final void rule__DataClass__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4242:1: ( ( ( rule__DataClass__ExtensionAssignment_13 )* ) )
            // InternalMDML.g:4243:1: ( ( rule__DataClass__ExtensionAssignment_13 )* )
            {
            // InternalMDML.g:4243:1: ( ( rule__DataClass__ExtensionAssignment_13 )* )
            // InternalMDML.g:4244:2: ( rule__DataClass__ExtensionAssignment_13 )*
            {
             before(grammarAccess.getDataClassAccess().getExtensionAssignment_13()); 
            // InternalMDML.g:4245:2: ( rule__DataClass__ExtensionAssignment_13 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==32) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMDML.g:4245:3: rule__DataClass__ExtensionAssignment_13
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__DataClass__ExtensionAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getDataClassAccess().getExtensionAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__13__Impl"


    // $ANTLR start "rule__DataClass__Group__14"
    // InternalMDML.g:4253:1: rule__DataClass__Group__14 : rule__DataClass__Group__14__Impl ;
    public final void rule__DataClass__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4257:1: ( rule__DataClass__Group__14__Impl )
            // InternalMDML.g:4258:2: rule__DataClass__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataClass__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__14"


    // $ANTLR start "rule__DataClass__Group__14__Impl"
    // InternalMDML.g:4264:1: rule__DataClass__Group__14__Impl : ( '}' ) ;
    public final void rule__DataClass__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4268:1: ( ( '}' ) )
            // InternalMDML.g:4269:1: ( '}' )
            {
            // InternalMDML.g:4269:1: ( '}' )
            // InternalMDML.g:4270:2: '}'
            {
             before(grammarAccess.getDataClassAccess().getRightCurlyBracketKeyword_14()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDataClassAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__14__Impl"


    // $ANTLR start "rule__DataElement__Group__0"
    // InternalMDML.g:4280:1: rule__DataElement__Group__0 : rule__DataElement__Group__0__Impl rule__DataElement__Group__1 ;
    public final void rule__DataElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4284:1: ( rule__DataElement__Group__0__Impl rule__DataElement__Group__1 )
            // InternalMDML.g:4285:2: rule__DataElement__Group__0__Impl rule__DataElement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DataElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__0"


    // $ANTLR start "rule__DataElement__Group__0__Impl"
    // InternalMDML.g:4292:1: rule__DataElement__Group__0__Impl : ( 'DataElement' ) ;
    public final void rule__DataElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4296:1: ( ( 'DataElement' ) )
            // InternalMDML.g:4297:1: ( 'DataElement' )
            {
            // InternalMDML.g:4297:1: ( 'DataElement' )
            // InternalMDML.g:4298:2: 'DataElement'
            {
             before(grammarAccess.getDataElementAccess().getDataElementKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDataElementAccess().getDataElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__0__Impl"


    // $ANTLR start "rule__DataElement__Group__1"
    // InternalMDML.g:4307:1: rule__DataElement__Group__1 : rule__DataElement__Group__1__Impl rule__DataElement__Group__2 ;
    public final void rule__DataElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4311:1: ( rule__DataElement__Group__1__Impl rule__DataElement__Group__2 )
            // InternalMDML.g:4312:2: rule__DataElement__Group__1__Impl rule__DataElement__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__DataElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__1"


    // $ANTLR start "rule__DataElement__Group__1__Impl"
    // InternalMDML.g:4319:1: rule__DataElement__Group__1__Impl : ( 'status:' ) ;
    public final void rule__DataElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4323:1: ( ( 'status:' ) )
            // InternalMDML.g:4324:1: ( 'status:' )
            {
            // InternalMDML.g:4324:1: ( 'status:' )
            // InternalMDML.g:4325:2: 'status:'
            {
             before(grammarAccess.getDataElementAccess().getStatusKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDataElementAccess().getStatusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__1__Impl"


    // $ANTLR start "rule__DataElement__Group__2"
    // InternalMDML.g:4334:1: rule__DataElement__Group__2 : rule__DataElement__Group__2__Impl rule__DataElement__Group__3 ;
    public final void rule__DataElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4338:1: ( rule__DataElement__Group__2__Impl rule__DataElement__Group__3 )
            // InternalMDML.g:4339:2: rule__DataElement__Group__2__Impl rule__DataElement__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__DataElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__2"


    // $ANTLR start "rule__DataElement__Group__2__Impl"
    // InternalMDML.g:4346:1: rule__DataElement__Group__2__Impl : ( ( rule__DataElement__StatusAssignment_2 ) ) ;
    public final void rule__DataElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4350:1: ( ( ( rule__DataElement__StatusAssignment_2 ) ) )
            // InternalMDML.g:4351:1: ( ( rule__DataElement__StatusAssignment_2 ) )
            {
            // InternalMDML.g:4351:1: ( ( rule__DataElement__StatusAssignment_2 ) )
            // InternalMDML.g:4352:2: ( rule__DataElement__StatusAssignment_2 )
            {
             before(grammarAccess.getDataElementAccess().getStatusAssignment_2()); 
            // InternalMDML.g:4353:2: ( rule__DataElement__StatusAssignment_2 )
            // InternalMDML.g:4353:3: rule__DataElement__StatusAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DataElement__StatusAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataElementAccess().getStatusAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__2__Impl"


    // $ANTLR start "rule__DataElement__Group__3"
    // InternalMDML.g:4361:1: rule__DataElement__Group__3 : rule__DataElement__Group__3__Impl rule__DataElement__Group__4 ;
    public final void rule__DataElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4365:1: ( rule__DataElement__Group__3__Impl rule__DataElement__Group__4 )
            // InternalMDML.g:4366:2: rule__DataElement__Group__3__Impl rule__DataElement__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__DataElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__3"


    // $ANTLR start "rule__DataElement__Group__3__Impl"
    // InternalMDML.g:4373:1: rule__DataElement__Group__3__Impl : ( 'domainid:' ) ;
    public final void rule__DataElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4377:1: ( ( 'domainid:' ) )
            // InternalMDML.g:4378:1: ( 'domainid:' )
            {
            // InternalMDML.g:4378:1: ( 'domainid:' )
            // InternalMDML.g:4379:2: 'domainid:'
            {
             before(grammarAccess.getDataElementAccess().getDomainidKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDataElementAccess().getDomainidKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__3__Impl"


    // $ANTLR start "rule__DataElement__Group__4"
    // InternalMDML.g:4388:1: rule__DataElement__Group__4 : rule__DataElement__Group__4__Impl rule__DataElement__Group__5 ;
    public final void rule__DataElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4392:1: ( rule__DataElement__Group__4__Impl rule__DataElement__Group__5 )
            // InternalMDML.g:4393:2: rule__DataElement__Group__4__Impl rule__DataElement__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__DataElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataElement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__4"


    // $ANTLR start "rule__DataElement__Group__4__Impl"
    // InternalMDML.g:4400:1: rule__DataElement__Group__4__Impl : ( ( rule__DataElement__GuidAssignment_4 ) ) ;
    public final void rule__DataElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4404:1: ( ( ( rule__DataElement__GuidAssignment_4 ) ) )
            // InternalMDML.g:4405:1: ( ( rule__DataElement__GuidAssignment_4 ) )
            {
            // InternalMDML.g:4405:1: ( ( rule__DataElement__GuidAssignment_4 ) )
            // InternalMDML.g:4406:2: ( rule__DataElement__GuidAssignment_4 )
            {
             before(grammarAccess.getDataElementAccess().getGuidAssignment_4()); 
            // InternalMDML.g:4407:2: ( rule__DataElement__GuidAssignment_4 )
            // InternalMDML.g:4407:3: rule__DataElement__GuidAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DataElement__GuidAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDataElementAccess().getGuidAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__4__Impl"


    // $ANTLR start "rule__DataElement__Group__5"
    // InternalMDML.g:4415:1: rule__DataElement__Group__5 : rule__DataElement__Group__5__Impl rule__DataElement__Group__6 ;
    public final void rule__DataElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4419:1: ( rule__DataElement__Group__5__Impl rule__DataElement__Group__6 )
            // InternalMDML.g:4420:2: rule__DataElement__Group__5__Impl rule__DataElement__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__DataElement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataElement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__5"


    // $ANTLR start "rule__DataElement__Group__5__Impl"
    // InternalMDML.g:4427:1: rule__DataElement__Group__5__Impl : ( '@' ) ;
    public final void rule__DataElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4431:1: ( ( '@' ) )
            // InternalMDML.g:4432:1: ( '@' )
            {
            // InternalMDML.g:4432:1: ( '@' )
            // InternalMDML.g:4433:2: '@'
            {
             before(grammarAccess.getDataElementAccess().getCommercialAtKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDataElementAccess().getCommercialAtKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__5__Impl"


    // $ANTLR start "rule__DataElement__Group__6"
    // InternalMDML.g:4442:1: rule__DataElement__Group__6 : rule__DataElement__Group__6__Impl rule__DataElement__Group__7 ;
    public final void rule__DataElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4446:1: ( rule__DataElement__Group__6__Impl rule__DataElement__Group__7 )
            // InternalMDML.g:4447:2: rule__DataElement__Group__6__Impl rule__DataElement__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__DataElement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataElement__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__6"


    // $ANTLR start "rule__DataElement__Group__6__Impl"
    // InternalMDML.g:4454:1: rule__DataElement__Group__6__Impl : ( '(' ) ;
    public final void rule__DataElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4458:1: ( ( '(' ) )
            // InternalMDML.g:4459:1: ( '(' )
            {
            // InternalMDML.g:4459:1: ( '(' )
            // InternalMDML.g:4460:2: '('
            {
             before(grammarAccess.getDataElementAccess().getLeftParenthesisKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDataElementAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__6__Impl"


    // $ANTLR start "rule__DataElement__Group__7"
    // InternalMDML.g:4469:1: rule__DataElement__Group__7 : rule__DataElement__Group__7__Impl rule__DataElement__Group__8 ;
    public final void rule__DataElement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4473:1: ( rule__DataElement__Group__7__Impl rule__DataElement__Group__8 )
            // InternalMDML.g:4474:2: rule__DataElement__Group__7__Impl rule__DataElement__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__DataElement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataElement__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__7"


    // $ANTLR start "rule__DataElement__Group__7__Impl"
    // InternalMDML.g:4481:1: rule__DataElement__Group__7__Impl : ( ruleVersion ) ;
    public final void rule__DataElement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4485:1: ( ( ruleVersion ) )
            // InternalMDML.g:4486:1: ( ruleVersion )
            {
            // InternalMDML.g:4486:1: ( ruleVersion )
            // InternalMDML.g:4487:2: ruleVersion
            {
             before(grammarAccess.getDataElementAccess().getVersionParserRuleCall_7()); 
            pushFollow(FOLLOW_2);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getDataElementAccess().getVersionParserRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__7__Impl"


    // $ANTLR start "rule__DataElement__Group__8"
    // InternalMDML.g:4496:1: rule__DataElement__Group__8 : rule__DataElement__Group__8__Impl rule__DataElement__Group__9 ;
    public final void rule__DataElement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4500:1: ( rule__DataElement__Group__8__Impl rule__DataElement__Group__9 )
            // InternalMDML.g:4501:2: rule__DataElement__Group__8__Impl rule__DataElement__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__DataElement__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataElement__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__8"


    // $ANTLR start "rule__DataElement__Group__8__Impl"
    // InternalMDML.g:4508:1: rule__DataElement__Group__8__Impl : ( ')' ) ;
    public final void rule__DataElement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4512:1: ( ( ')' ) )
            // InternalMDML.g:4513:1: ( ')' )
            {
            // InternalMDML.g:4513:1: ( ')' )
            // InternalMDML.g:4514:2: ')'
            {
             before(grammarAccess.getDataElementAccess().getRightParenthesisKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDataElementAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__8__Impl"


    // $ANTLR start "rule__DataElement__Group__9"
    // InternalMDML.g:4523:1: rule__DataElement__Group__9 : rule__DataElement__Group__9__Impl rule__DataElement__Group__10 ;
    public final void rule__DataElement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4527:1: ( rule__DataElement__Group__9__Impl rule__DataElement__Group__10 )
            // InternalMDML.g:4528:2: rule__DataElement__Group__9__Impl rule__DataElement__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__DataElement__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataElement__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__9"


    // $ANTLR start "rule__DataElement__Group__9__Impl"
    // InternalMDML.g:4535:1: rule__DataElement__Group__9__Impl : ( ( rule__DataElement__RefinesAssignment_9 ) ) ;
    public final void rule__DataElement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4539:1: ( ( ( rule__DataElement__RefinesAssignment_9 ) ) )
            // InternalMDML.g:4540:1: ( ( rule__DataElement__RefinesAssignment_9 ) )
            {
            // InternalMDML.g:4540:1: ( ( rule__DataElement__RefinesAssignment_9 ) )
            // InternalMDML.g:4541:2: ( rule__DataElement__RefinesAssignment_9 )
            {
             before(grammarAccess.getDataElementAccess().getRefinesAssignment_9()); 
            // InternalMDML.g:4542:2: ( rule__DataElement__RefinesAssignment_9 )
            // InternalMDML.g:4542:3: rule__DataElement__RefinesAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__DataElement__RefinesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getDataElementAccess().getRefinesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__9__Impl"


    // $ANTLR start "rule__DataElement__Group__10"
    // InternalMDML.g:4550:1: rule__DataElement__Group__10 : rule__DataElement__Group__10__Impl rule__DataElement__Group__11 ;
    public final void rule__DataElement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4554:1: ( rule__DataElement__Group__10__Impl rule__DataElement__Group__11 )
            // InternalMDML.g:4555:2: rule__DataElement__Group__10__Impl rule__DataElement__Group__11
            {
            pushFollow(FOLLOW_19);
            rule__DataElement__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataElement__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__10"


    // $ANTLR start "rule__DataElement__Group__10__Impl"
    // InternalMDML.g:4562:1: rule__DataElement__Group__10__Impl : ( ( rule__DataElement__NameAssignment_10 ) ) ;
    public final void rule__DataElement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4566:1: ( ( ( rule__DataElement__NameAssignment_10 ) ) )
            // InternalMDML.g:4567:1: ( ( rule__DataElement__NameAssignment_10 ) )
            {
            // InternalMDML.g:4567:1: ( ( rule__DataElement__NameAssignment_10 ) )
            // InternalMDML.g:4568:2: ( rule__DataElement__NameAssignment_10 )
            {
             before(grammarAccess.getDataElementAccess().getNameAssignment_10()); 
            // InternalMDML.g:4569:2: ( rule__DataElement__NameAssignment_10 )
            // InternalMDML.g:4569:3: rule__DataElement__NameAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__DataElement__NameAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getDataElementAccess().getNameAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__10__Impl"


    // $ANTLR start "rule__DataElement__Group__11"
    // InternalMDML.g:4577:1: rule__DataElement__Group__11 : rule__DataElement__Group__11__Impl rule__DataElement__Group__12 ;
    public final void rule__DataElement__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4581:1: ( rule__DataElement__Group__11__Impl rule__DataElement__Group__12 )
            // InternalMDML.g:4582:2: rule__DataElement__Group__11__Impl rule__DataElement__Group__12
            {
            pushFollow(FOLLOW_4);
            rule__DataElement__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataElement__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__11"


    // $ANTLR start "rule__DataElement__Group__11__Impl"
    // InternalMDML.g:4589:1: rule__DataElement__Group__11__Impl : ( ':' ) ;
    public final void rule__DataElement__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4593:1: ( ( ':' ) )
            // InternalMDML.g:4594:1: ( ':' )
            {
            // InternalMDML.g:4594:1: ( ':' )
            // InternalMDML.g:4595:2: ':'
            {
             before(grammarAccess.getDataElementAccess().getColonKeyword_11()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDataElementAccess().getColonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__11__Impl"


    // $ANTLR start "rule__DataElement__Group__12"
    // InternalMDML.g:4604:1: rule__DataElement__Group__12 : rule__DataElement__Group__12__Impl ;
    public final void rule__DataElement__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4608:1: ( rule__DataElement__Group__12__Impl )
            // InternalMDML.g:4609:2: rule__DataElement__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataElement__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__12"


    // $ANTLR start "rule__DataElement__Group__12__Impl"
    // InternalMDML.g:4615:1: rule__DataElement__Group__12__Impl : ( ( rule__DataElement__TypeAssignment_12 ) ) ;
    public final void rule__DataElement__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4619:1: ( ( ( rule__DataElement__TypeAssignment_12 ) ) )
            // InternalMDML.g:4620:1: ( ( rule__DataElement__TypeAssignment_12 ) )
            {
            // InternalMDML.g:4620:1: ( ( rule__DataElement__TypeAssignment_12 ) )
            // InternalMDML.g:4621:2: ( rule__DataElement__TypeAssignment_12 )
            {
             before(grammarAccess.getDataElementAccess().getTypeAssignment_12()); 
            // InternalMDML.g:4622:2: ( rule__DataElement__TypeAssignment_12 )
            // InternalMDML.g:4622:3: rule__DataElement__TypeAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__DataElement__TypeAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getDataElementAccess().getTypeAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__12__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalMDML.g:4631:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4635:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalMDML.g:4636:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalMDML.g:4643:1: rule__Constraint__Group__0__Impl : ( () ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4647:1: ( ( () ) )
            // InternalMDML.g:4648:1: ( () )
            {
            // InternalMDML.g:4648:1: ( () )
            // InternalMDML.g:4649:2: ()
            {
             before(grammarAccess.getConstraintAccess().getConstraintAction_0()); 
            // InternalMDML.g:4650:2: ()
            // InternalMDML.g:4650:3: 
            {
            }

             after(grammarAccess.getConstraintAccess().getConstraintAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // InternalMDML.g:4658:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4662:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalMDML.g:4663:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalMDML.g:4670:1: rule__Constraint__Group__1__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4674:1: ( ( 'constraint' ) )
            // InternalMDML.g:4675:1: ( 'constraint' )
            {
            // InternalMDML.g:4675:1: ( 'constraint' )
            // InternalMDML.g:4676:2: 'constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getConstraintKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // InternalMDML.g:4685:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4689:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalMDML.g:4690:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Constraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // InternalMDML.g:4697:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__NameAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4701:1: ( ( ( rule__Constraint__NameAssignment_2 ) ) )
            // InternalMDML.g:4702:1: ( ( rule__Constraint__NameAssignment_2 ) )
            {
            // InternalMDML.g:4702:1: ( ( rule__Constraint__NameAssignment_2 ) )
            // InternalMDML.g:4703:2: ( rule__Constraint__NameAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_2()); 
            // InternalMDML.g:4704:2: ( rule__Constraint__NameAssignment_2 )
            // InternalMDML.g:4704:3: rule__Constraint__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__3"
    // InternalMDML.g:4712:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4716:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalMDML.g:4717:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__Constraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3"


    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // InternalMDML.g:4724:1: rule__Constraint__Group__3__Impl : ( '=' ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4728:1: ( ( '=' ) )
            // InternalMDML.g:4729:1: ( '=' )
            {
            // InternalMDML.g:4729:1: ( '=' )
            // InternalMDML.g:4730:2: '='
            {
             before(grammarAccess.getConstraintAccess().getEqualsSignKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3__Impl"


    // $ANTLR start "rule__Constraint__Group__4"
    // InternalMDML.g:4739:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4743:1: ( rule__Constraint__Group__4__Impl )
            // InternalMDML.g:4744:2: rule__Constraint__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__4"


    // $ANTLR start "rule__Constraint__Group__4__Impl"
    // InternalMDML.g:4750:1: rule__Constraint__Group__4__Impl : ( ( rule__Constraint__Group_4__0 ) ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4754:1: ( ( ( rule__Constraint__Group_4__0 ) ) )
            // InternalMDML.g:4755:1: ( ( rule__Constraint__Group_4__0 ) )
            {
            // InternalMDML.g:4755:1: ( ( rule__Constraint__Group_4__0 ) )
            // InternalMDML.g:4756:2: ( rule__Constraint__Group_4__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup_4()); 
            // InternalMDML.g:4757:2: ( rule__Constraint__Group_4__0 )
            // InternalMDML.g:4757:3: rule__Constraint__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__4__Impl"


    // $ANTLR start "rule__Constraint__Group_4__0"
    // InternalMDML.g:4766:1: rule__Constraint__Group_4__0 : rule__Constraint__Group_4__0__Impl rule__Constraint__Group_4__1 ;
    public final void rule__Constraint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4770:1: ( rule__Constraint__Group_4__0__Impl rule__Constraint__Group_4__1 )
            // InternalMDML.g:4771:2: rule__Constraint__Group_4__0__Impl rule__Constraint__Group_4__1
            {
            pushFollow(FOLLOW_38);
            rule__Constraint__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_4__0"


    // $ANTLR start "rule__Constraint__Group_4__0__Impl"
    // InternalMDML.g:4778:1: rule__Constraint__Group_4__0__Impl : ( ( rule__Constraint__Group_4_0__0 )? ) ;
    public final void rule__Constraint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4782:1: ( ( ( rule__Constraint__Group_4_0__0 )? ) )
            // InternalMDML.g:4783:1: ( ( rule__Constraint__Group_4_0__0 )? )
            {
            // InternalMDML.g:4783:1: ( ( rule__Constraint__Group_4_0__0 )? )
            // InternalMDML.g:4784:2: ( rule__Constraint__Group_4_0__0 )?
            {
             before(grammarAccess.getConstraintAccess().getGroup_4_0()); 
            // InternalMDML.g:4785:2: ( rule__Constraint__Group_4_0__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMDML.g:4785:3: rule__Constraint__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constraint__Group_4_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintAccess().getGroup_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_4__0__Impl"


    // $ANTLR start "rule__Constraint__Group_4__1"
    // InternalMDML.g:4793:1: rule__Constraint__Group_4__1 : rule__Constraint__Group_4__1__Impl rule__Constraint__Group_4__2 ;
    public final void rule__Constraint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4797:1: ( rule__Constraint__Group_4__1__Impl rule__Constraint__Group_4__2 )
            // InternalMDML.g:4798:2: rule__Constraint__Group_4__1__Impl rule__Constraint__Group_4__2
            {
            pushFollow(FOLLOW_19);
            rule__Constraint__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_4__1"


    // $ANTLR start "rule__Constraint__Group_4__1__Impl"
    // InternalMDML.g:4805:1: rule__Constraint__Group_4__1__Impl : ( ( rule__Constraint__PredAssignment_4_1 ) ) ;
    public final void rule__Constraint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4809:1: ( ( ( rule__Constraint__PredAssignment_4_1 ) ) )
            // InternalMDML.g:4810:1: ( ( rule__Constraint__PredAssignment_4_1 ) )
            {
            // InternalMDML.g:4810:1: ( ( rule__Constraint__PredAssignment_4_1 ) )
            // InternalMDML.g:4811:2: ( rule__Constraint__PredAssignment_4_1 )
            {
             before(grammarAccess.getConstraintAccess().getPredAssignment_4_1()); 
            // InternalMDML.g:4812:2: ( rule__Constraint__PredAssignment_4_1 )
            // InternalMDML.g:4812:3: rule__Constraint__PredAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__PredAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getPredAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_4__1__Impl"


    // $ANTLR start "rule__Constraint__Group_4__2"
    // InternalMDML.g:4820:1: rule__Constraint__Group_4__2 : rule__Constraint__Group_4__2__Impl ;
    public final void rule__Constraint__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4824:1: ( rule__Constraint__Group_4__2__Impl )
            // InternalMDML.g:4825:2: rule__Constraint__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_4__2"


    // $ANTLR start "rule__Constraint__Group_4__2__Impl"
    // InternalMDML.g:4831:1: rule__Constraint__Group_4__2__Impl : ( ( rule__Constraint__Group_4_2__0 )? ) ;
    public final void rule__Constraint__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4835:1: ( ( ( rule__Constraint__Group_4_2__0 )? ) )
            // InternalMDML.g:4836:1: ( ( rule__Constraint__Group_4_2__0 )? )
            {
            // InternalMDML.g:4836:1: ( ( rule__Constraint__Group_4_2__0 )? )
            // InternalMDML.g:4837:2: ( rule__Constraint__Group_4_2__0 )?
            {
             before(grammarAccess.getConstraintAccess().getGroup_4_2()); 
            // InternalMDML.g:4838:2: ( rule__Constraint__Group_4_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMDML.g:4838:3: rule__Constraint__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constraint__Group_4_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_4__2__Impl"


    // $ANTLR start "rule__Constraint__Group_4_0__0"
    // InternalMDML.g:4847:1: rule__Constraint__Group_4_0__0 : rule__Constraint__Group_4_0__0__Impl rule__Constraint__Group_4_0__1 ;
    public final void rule__Constraint__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4851:1: ( rule__Constraint__Group_4_0__0__Impl rule__Constraint__Group_4_0__1 )
            // InternalMDML.g:4852:2: rule__Constraint__Group_4_0__0__Impl rule__Constraint__Group_4_0__1
            {
            pushFollow(FOLLOW_19);
            rule__Constraint__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_4_0__0"


    // $ANTLR start "rule__Constraint__Group_4_0__0__Impl"
    // InternalMDML.g:4859:1: rule__Constraint__Group_4_0__0__Impl : ( ( rule__Constraint__SrcAssignment_4_0_0 ) ) ;
    public final void rule__Constraint__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4863:1: ( ( ( rule__Constraint__SrcAssignment_4_0_0 ) ) )
            // InternalMDML.g:4864:1: ( ( rule__Constraint__SrcAssignment_4_0_0 ) )
            {
            // InternalMDML.g:4864:1: ( ( rule__Constraint__SrcAssignment_4_0_0 ) )
            // InternalMDML.g:4865:2: ( rule__Constraint__SrcAssignment_4_0_0 )
            {
             before(grammarAccess.getConstraintAccess().getSrcAssignment_4_0_0()); 
            // InternalMDML.g:4866:2: ( rule__Constraint__SrcAssignment_4_0_0 )
            // InternalMDML.g:4866:3: rule__Constraint__SrcAssignment_4_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__SrcAssignment_4_0_0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getSrcAssignment_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_4_0__0__Impl"


    // $ANTLR start "rule__Constraint__Group_4_0__1"
    // InternalMDML.g:4874:1: rule__Constraint__Group_4_0__1 : rule__Constraint__Group_4_0__1__Impl ;
    public final void rule__Constraint__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4878:1: ( rule__Constraint__Group_4_0__1__Impl )
            // InternalMDML.g:4879:2: rule__Constraint__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_4_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_4_0__1"


    // $ANTLR start "rule__Constraint__Group_4_0__1__Impl"
    // InternalMDML.g:4885:1: rule__Constraint__Group_4_0__1__Impl : ( ':' ) ;
    public final void rule__Constraint__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4889:1: ( ( ':' ) )
            // InternalMDML.g:4890:1: ( ':' )
            {
            // InternalMDML.g:4890:1: ( ':' )
            // InternalMDML.g:4891:2: ':'
            {
             before(grammarAccess.getConstraintAccess().getColonKeyword_4_0_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getColonKeyword_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_4_0__1__Impl"


    // $ANTLR start "rule__Constraint__Group_4_2__0"
    // InternalMDML.g:4901:1: rule__Constraint__Group_4_2__0 : rule__Constraint__Group_4_2__0__Impl rule__Constraint__Group_4_2__1 ;
    public final void rule__Constraint__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4905:1: ( rule__Constraint__Group_4_2__0__Impl rule__Constraint__Group_4_2__1 )
            // InternalMDML.g:4906:2: rule__Constraint__Group_4_2__0__Impl rule__Constraint__Group_4_2__1
            {
            pushFollow(FOLLOW_39);
            rule__Constraint__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_4_2__0"


    // $ANTLR start "rule__Constraint__Group_4_2__0__Impl"
    // InternalMDML.g:4913:1: rule__Constraint__Group_4_2__0__Impl : ( ':' ) ;
    public final void rule__Constraint__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4917:1: ( ( ':' ) )
            // InternalMDML.g:4918:1: ( ':' )
            {
            // InternalMDML.g:4918:1: ( ':' )
            // InternalMDML.g:4919:2: ':'
            {
             before(grammarAccess.getConstraintAccess().getColonKeyword_4_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getColonKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_4_2__0__Impl"


    // $ANTLR start "rule__Constraint__Group_4_2__1"
    // InternalMDML.g:4928:1: rule__Constraint__Group_4_2__1 : rule__Constraint__Group_4_2__1__Impl ;
    public final void rule__Constraint__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4932:1: ( rule__Constraint__Group_4_2__1__Impl )
            // InternalMDML.g:4933:2: rule__Constraint__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_4_2__1"


    // $ANTLR start "rule__Constraint__Group_4_2__1__Impl"
    // InternalMDML.g:4939:1: rule__Constraint__Group_4_2__1__Impl : ( ( rule__Constraint__DestAssignment_4_2_1 ) ) ;
    public final void rule__Constraint__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4943:1: ( ( ( rule__Constraint__DestAssignment_4_2_1 ) ) )
            // InternalMDML.g:4944:1: ( ( rule__Constraint__DestAssignment_4_2_1 ) )
            {
            // InternalMDML.g:4944:1: ( ( rule__Constraint__DestAssignment_4_2_1 ) )
            // InternalMDML.g:4945:2: ( rule__Constraint__DestAssignment_4_2_1 )
            {
             before(grammarAccess.getConstraintAccess().getDestAssignment_4_2_1()); 
            // InternalMDML.g:4946:2: ( rule__Constraint__DestAssignment_4_2_1 )
            // InternalMDML.g:4946:3: rule__Constraint__DestAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__DestAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getDestAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_4_2__1__Impl"


    // $ANTLR start "rule__Predicate__Group__0"
    // InternalMDML.g:4955:1: rule__Predicate__Group__0 : rule__Predicate__Group__0__Impl rule__Predicate__Group__1 ;
    public final void rule__Predicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4959:1: ( rule__Predicate__Group__0__Impl rule__Predicate__Group__1 )
            // InternalMDML.g:4960:2: rule__Predicate__Group__0__Impl rule__Predicate__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Predicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__0"


    // $ANTLR start "rule__Predicate__Group__0__Impl"
    // InternalMDML.g:4967:1: rule__Predicate__Group__0__Impl : ( 'predicate' ) ;
    public final void rule__Predicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4971:1: ( ( 'predicate' ) )
            // InternalMDML.g:4972:1: ( 'predicate' )
            {
            // InternalMDML.g:4972:1: ( 'predicate' )
            // InternalMDML.g:4973:2: 'predicate'
            {
             before(grammarAccess.getPredicateAccess().getPredicateKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPredicateAccess().getPredicateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__0__Impl"


    // $ANTLR start "rule__Predicate__Group__1"
    // InternalMDML.g:4982:1: rule__Predicate__Group__1 : rule__Predicate__Group__1__Impl rule__Predicate__Group__2 ;
    public final void rule__Predicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4986:1: ( rule__Predicate__Group__1__Impl rule__Predicate__Group__2 )
            // InternalMDML.g:4987:2: rule__Predicate__Group__1__Impl rule__Predicate__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Predicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__1"


    // $ANTLR start "rule__Predicate__Group__1__Impl"
    // InternalMDML.g:4994:1: rule__Predicate__Group__1__Impl : ( ( rule__Predicate__NameAssignment_1 ) ) ;
    public final void rule__Predicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:4998:1: ( ( ( rule__Predicate__NameAssignment_1 ) ) )
            // InternalMDML.g:4999:1: ( ( rule__Predicate__NameAssignment_1 ) )
            {
            // InternalMDML.g:4999:1: ( ( rule__Predicate__NameAssignment_1 ) )
            // InternalMDML.g:5000:2: ( rule__Predicate__NameAssignment_1 )
            {
             before(grammarAccess.getPredicateAccess().getNameAssignment_1()); 
            // InternalMDML.g:5001:2: ( rule__Predicate__NameAssignment_1 )
            // InternalMDML.g:5001:3: rule__Predicate__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__1__Impl"


    // $ANTLR start "rule__Predicate__Group__2"
    // InternalMDML.g:5009:1: rule__Predicate__Group__2 : rule__Predicate__Group__2__Impl rule__Predicate__Group__3 ;
    public final void rule__Predicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5013:1: ( rule__Predicate__Group__2__Impl rule__Predicate__Group__3 )
            // InternalMDML.g:5014:2: rule__Predicate__Group__2__Impl rule__Predicate__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Predicate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__2"


    // $ANTLR start "rule__Predicate__Group__2__Impl"
    // InternalMDML.g:5021:1: rule__Predicate__Group__2__Impl : ( ':' ) ;
    public final void rule__Predicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5025:1: ( ( ':' ) )
            // InternalMDML.g:5026:1: ( ':' )
            {
            // InternalMDML.g:5026:1: ( ':' )
            // InternalMDML.g:5027:2: ':'
            {
             before(grammarAccess.getPredicateAccess().getColonKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPredicateAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__2__Impl"


    // $ANTLR start "rule__Predicate__Group__3"
    // InternalMDML.g:5036:1: rule__Predicate__Group__3 : rule__Predicate__Group__3__Impl ;
    public final void rule__Predicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5040:1: ( rule__Predicate__Group__3__Impl )
            // InternalMDML.g:5041:2: rule__Predicate__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__3"


    // $ANTLR start "rule__Predicate__Group__3__Impl"
    // InternalMDML.g:5047:1: rule__Predicate__Group__3__Impl : ( ( rule__Predicate__PredicateAssignment_3 ) ) ;
    public final void rule__Predicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5051:1: ( ( ( rule__Predicate__PredicateAssignment_3 ) ) )
            // InternalMDML.g:5052:1: ( ( rule__Predicate__PredicateAssignment_3 ) )
            {
            // InternalMDML.g:5052:1: ( ( rule__Predicate__PredicateAssignment_3 ) )
            // InternalMDML.g:5053:2: ( rule__Predicate__PredicateAssignment_3 )
            {
             before(grammarAccess.getPredicateAccess().getPredicateAssignment_3()); 
            // InternalMDML.g:5054:2: ( rule__Predicate__PredicateAssignment_3 )
            // InternalMDML.g:5054:3: rule__Predicate__PredicateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__PredicateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getPredicateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__3__Impl"


    // $ANTLR start "rule__DomainRegistry__RegisteredItemsAssignment"
    // InternalMDML.g:5063:1: rule__DomainRegistry__RegisteredItemsAssignment : ( ruleDataModel ) ;
    public final void rule__DomainRegistry__RegisteredItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5067:1: ( ( ruleDataModel ) )
            // InternalMDML.g:5068:2: ( ruleDataModel )
            {
            // InternalMDML.g:5068:2: ( ruleDataModel )
            // InternalMDML.g:5069:3: ruleDataModel
            {
             before(grammarAccess.getDomainRegistryAccess().getRegisteredItemsDataModelParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDataModel();

            state._fsp--;

             after(grammarAccess.getDomainRegistryAccess().getRegisteredItemsDataModelParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainRegistry__RegisteredItemsAssignment"


    // $ANTLR start "rule__DataModel__NameAssignment_1"
    // InternalMDML.g:5078:1: rule__DataModel__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__DataModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5082:1: ( ( ruleQualifiedName ) )
            // InternalMDML.g:5083:2: ( ruleQualifiedName )
            {
            // InternalMDML.g:5083:2: ( ruleQualifiedName )
            // InternalMDML.g:5084:3: ruleQualifiedName
            {
             before(grammarAccess.getDataModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__NameAssignment_1"


    // $ANTLR start "rule__DataModel__StatusAssignment_3"
    // InternalMDML.g:5093:1: rule__DataModel__StatusAssignment_3 : ( ruleStatus ) ;
    public final void rule__DataModel__StatusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5097:1: ( ( ruleStatus ) )
            // InternalMDML.g:5098:2: ( ruleStatus )
            {
            // InternalMDML.g:5098:2: ( ruleStatus )
            // InternalMDML.g:5099:3: ruleStatus
            {
             before(grammarAccess.getDataModelAccess().getStatusStatusParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getStatusStatusParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__StatusAssignment_3"


    // $ANTLR start "rule__DataModel__GuidAssignment_5"
    // InternalMDML.g:5108:1: rule__DataModel__GuidAssignment_5 : ( ruleGUID ) ;
    public final void rule__DataModel__GuidAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5112:1: ( ( ruleGUID ) )
            // InternalMDML.g:5113:2: ( ruleGUID )
            {
            // InternalMDML.g:5113:2: ( ruleGUID )
            // InternalMDML.g:5114:3: ruleGUID
            {
             before(grammarAccess.getDataModelAccess().getGuidGUIDParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleGUID();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getGuidGUIDParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__GuidAssignment_5"


    // $ANTLR start "rule__DataModel__RefinesAssignment_10"
    // InternalMDML.g:5123:1: rule__DataModel__RefinesAssignment_10 : ( ruleREFINE ) ;
    public final void rule__DataModel__RefinesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5127:1: ( ( ruleREFINE ) )
            // InternalMDML.g:5128:2: ( ruleREFINE )
            {
            // InternalMDML.g:5128:2: ( ruleREFINE )
            // InternalMDML.g:5129:3: ruleREFINE
            {
             before(grammarAccess.getDataModelAccess().getRefinesREFINEParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleREFINE();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getRefinesREFINEParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__RefinesAssignment_10"


    // $ANTLR start "rule__DataModel__ElementsAssignment_12"
    // InternalMDML.g:5138:1: rule__DataModel__ElementsAssignment_12 : ( ruleDataItem ) ;
    public final void rule__DataModel__ElementsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5142:1: ( ( ruleDataItem ) )
            // InternalMDML.g:5143:2: ( ruleDataItem )
            {
            // InternalMDML.g:5143:2: ( ruleDataItem )
            // InternalMDML.g:5144:3: ruleDataItem
            {
             before(grammarAccess.getDataModelAccess().getElementsDataItemParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleDataItem();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getElementsDataItemParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__ElementsAssignment_12"


    // $ANTLR start "rule__DataModel__RelationsAssignment_13"
    // InternalMDML.g:5153:1: rule__DataModel__RelationsAssignment_13 : ( ruleRelationship ) ;
    public final void rule__DataModel__RelationsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5157:1: ( ( ruleRelationship ) )
            // InternalMDML.g:5158:2: ( ruleRelationship )
            {
            // InternalMDML.g:5158:2: ( ruleRelationship )
            // InternalMDML.g:5159:3: ruleRelationship
            {
             before(grammarAccess.getDataModelAccess().getRelationsRelationshipParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getRelationsRelationshipParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__RelationsAssignment_13"


    // $ANTLR start "rule__DataModel__ConstraintAssignment_14"
    // InternalMDML.g:5168:1: rule__DataModel__ConstraintAssignment_14 : ( ruleConstraint ) ;
    public final void rule__DataModel__ConstraintAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5172:1: ( ( ruleConstraint ) )
            // InternalMDML.g:5173:2: ( ruleConstraint )
            {
            // InternalMDML.g:5173:2: ( ruleConstraint )
            // InternalMDML.g:5174:3: ruleConstraint
            {
             before(grammarAccess.getDataModelAccess().getConstraintConstraintParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getConstraintConstraintParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__ConstraintAssignment_14"


    // $ANTLR start "rule__DataModel__PredicateAssignment_15"
    // InternalMDML.g:5183:1: rule__DataModel__PredicateAssignment_15 : ( rulePredicate ) ;
    public final void rule__DataModel__PredicateAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5187:1: ( ( rulePredicate ) )
            // InternalMDML.g:5188:2: ( rulePredicate )
            {
            // InternalMDML.g:5188:2: ( rulePredicate )
            // InternalMDML.g:5189:3: rulePredicate
            {
             before(grammarAccess.getDataModelAccess().getPredicatePredicateParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getPredicatePredicateParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__PredicateAssignment_15"


    // $ANTLR start "rule__DataItem__DataitemAssignment"
    // InternalMDML.g:5198:1: rule__DataItem__DataitemAssignment : ( ( rule__DataItem__DataitemAlternatives_0 ) ) ;
    public final void rule__DataItem__DataitemAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5202:1: ( ( ( rule__DataItem__DataitemAlternatives_0 ) ) )
            // InternalMDML.g:5203:2: ( ( rule__DataItem__DataitemAlternatives_0 ) )
            {
            // InternalMDML.g:5203:2: ( ( rule__DataItem__DataitemAlternatives_0 ) )
            // InternalMDML.g:5204:3: ( rule__DataItem__DataitemAlternatives_0 )
            {
             before(grammarAccess.getDataItemAccess().getDataitemAlternatives_0()); 
            // InternalMDML.g:5205:3: ( rule__DataItem__DataitemAlternatives_0 )
            // InternalMDML.g:5205:4: rule__DataItem__DataitemAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__DataItem__DataitemAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDataItemAccess().getDataitemAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataItem__DataitemAssignment"


    // $ANTLR start "rule__Reference__NameAssignment_1"
    // InternalMDML.g:5213:1: rule__Reference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5217:1: ( ( RULE_ID ) )
            // InternalMDML.g:5218:2: ( RULE_ID )
            {
            // InternalMDML.g:5218:2: ( RULE_ID )
            // InternalMDML.g:5219:3: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__NameAssignment_1"


    // $ANTLR start "rule__Reference__TypeAssignment_3"
    // InternalMDML.g:5228:1: rule__Reference__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5232:1: ( ( ( RULE_ID ) ) )
            // InternalMDML.g:5233:2: ( ( RULE_ID ) )
            {
            // InternalMDML.g:5233:2: ( ( RULE_ID ) )
            // InternalMDML.g:5234:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getTypeDataItemCrossReference_3_0()); 
            // InternalMDML.g:5235:3: ( RULE_ID )
            // InternalMDML.g:5236:4: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getTypeDataItemIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getTypeDataItemIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getTypeDataItemCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__TypeAssignment_3"


    // $ANTLR start "rule__Relationship__SrcAssignment_1_0"
    // InternalMDML.g:5247:1: rule__Relationship__SrcAssignment_1_0 : ( ruleRelationSource ) ;
    public final void rule__Relationship__SrcAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5251:1: ( ( ruleRelationSource ) )
            // InternalMDML.g:5252:2: ( ruleRelationSource )
            {
            // InternalMDML.g:5252:2: ( ruleRelationSource )
            // InternalMDML.g:5253:3: ruleRelationSource
            {
             before(grammarAccess.getRelationshipAccess().getSrcRelationSourceParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationSource();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getSrcRelationSourceParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__SrcAssignment_1_0"


    // $ANTLR start "rule__Relationship__DestAssignment_1_2"
    // InternalMDML.g:5262:1: rule__Relationship__DestAssignment_1_2 : ( ruleRelationDestination ) ;
    public final void rule__Relationship__DestAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5266:1: ( ( ruleRelationDestination ) )
            // InternalMDML.g:5267:2: ( ruleRelationDestination )
            {
            // InternalMDML.g:5267:2: ( ruleRelationDestination )
            // InternalMDML.g:5268:3: ruleRelationDestination
            {
             before(grammarAccess.getRelationshipAccess().getDestRelationDestinationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationDestination();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getDestRelationDestinationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__DestAssignment_1_2"


    // $ANTLR start "rule__ExtensionItem__KeyAssignment_1"
    // InternalMDML.g:5277:1: rule__ExtensionItem__KeyAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExtensionItem__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5281:1: ( ( RULE_ID ) )
            // InternalMDML.g:5282:2: ( RULE_ID )
            {
            // InternalMDML.g:5282:2: ( RULE_ID )
            // InternalMDML.g:5283:3: RULE_ID
            {
             before(grammarAccess.getExtensionItemAccess().getKeyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExtensionItemAccess().getKeyIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionItem__KeyAssignment_1"


    // $ANTLR start "rule__ExtensionItem__ValueAssignment_3"
    // InternalMDML.g:5292:1: rule__ExtensionItem__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ExtensionItem__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5296:1: ( ( RULE_STRING ) )
            // InternalMDML.g:5297:2: ( RULE_STRING )
            {
            // InternalMDML.g:5297:2: ( RULE_STRING )
            // InternalMDML.g:5298:3: RULE_STRING
            {
             before(grammarAccess.getExtensionItemAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExtensionItemAccess().getValueSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionItem__ValueAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalMDML.g:5307:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5311:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalMDML.g:5312:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalMDML.g:5312:2: ( ruleQualifiedNameWithWildcard )
            // InternalMDML.g:5313:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__EnumeratedType__StatusAssignment_2"
    // InternalMDML.g:5322:1: rule__EnumeratedType__StatusAssignment_2 : ( ruleStatus ) ;
    public final void rule__EnumeratedType__StatusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5326:1: ( ( ruleStatus ) )
            // InternalMDML.g:5327:2: ( ruleStatus )
            {
            // InternalMDML.g:5327:2: ( ruleStatus )
            // InternalMDML.g:5328:3: ruleStatus
            {
             before(grammarAccess.getEnumeratedTypeAccess().getStatusStatusParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getEnumeratedTypeAccess().getStatusStatusParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__StatusAssignment_2"


    // $ANTLR start "rule__EnumeratedType__GuidAssignment_4"
    // InternalMDML.g:5337:1: rule__EnumeratedType__GuidAssignment_4 : ( ruleGUID ) ;
    public final void rule__EnumeratedType__GuidAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5341:1: ( ( ruleGUID ) )
            // InternalMDML.g:5342:2: ( ruleGUID )
            {
            // InternalMDML.g:5342:2: ( ruleGUID )
            // InternalMDML.g:5343:3: ruleGUID
            {
             before(grammarAccess.getEnumeratedTypeAccess().getGuidGUIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGUID();

            state._fsp--;

             after(grammarAccess.getEnumeratedTypeAccess().getGuidGUIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__GuidAssignment_4"


    // $ANTLR start "rule__EnumeratedType__RefinesAssignment_9"
    // InternalMDML.g:5352:1: rule__EnumeratedType__RefinesAssignment_9 : ( ruleREFINE ) ;
    public final void rule__EnumeratedType__RefinesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5356:1: ( ( ruleREFINE ) )
            // InternalMDML.g:5357:2: ( ruleREFINE )
            {
            // InternalMDML.g:5357:2: ( ruleREFINE )
            // InternalMDML.g:5358:3: ruleREFINE
            {
             before(grammarAccess.getEnumeratedTypeAccess().getRefinesREFINEParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleREFINE();

            state._fsp--;

             after(grammarAccess.getEnumeratedTypeAccess().getRefinesREFINEParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__RefinesAssignment_9"


    // $ANTLR start "rule__EnumeratedType__NameAssignment_10"
    // InternalMDML.g:5367:1: rule__EnumeratedType__NameAssignment_10 : ( ruleQualifiedName ) ;
    public final void rule__EnumeratedType__NameAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5371:1: ( ( ruleQualifiedName ) )
            // InternalMDML.g:5372:2: ( ruleQualifiedName )
            {
            // InternalMDML.g:5372:2: ( ruleQualifiedName )
            // InternalMDML.g:5373:3: ruleQualifiedName
            {
             before(grammarAccess.getEnumeratedTypeAccess().getNameQualifiedNameParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEnumeratedTypeAccess().getNameQualifiedNameParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__NameAssignment_10"


    // $ANTLR start "rule__EnumeratedType__TypeAssignment_12"
    // InternalMDML.g:5382:1: rule__EnumeratedType__TypeAssignment_12 : ( rulePrimitiveType ) ;
    public final void rule__EnumeratedType__TypeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5386:1: ( ( rulePrimitiveType ) )
            // InternalMDML.g:5387:2: ( rulePrimitiveType )
            {
            // InternalMDML.g:5387:2: ( rulePrimitiveType )
            // InternalMDML.g:5388:3: rulePrimitiveType
            {
             before(grammarAccess.getEnumeratedTypeAccess().getTypePrimitiveTypeParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getEnumeratedTypeAccess().getTypePrimitiveTypeParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__TypeAssignment_12"


    // $ANTLR start "rule__EnumeratedType__ArrayAssignment_13_0"
    // InternalMDML.g:5397:1: rule__EnumeratedType__ArrayAssignment_13_0 : ( ( '[' ) ) ;
    public final void rule__EnumeratedType__ArrayAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5401:1: ( ( ( '[' ) ) )
            // InternalMDML.g:5402:2: ( ( '[' ) )
            {
            // InternalMDML.g:5402:2: ( ( '[' ) )
            // InternalMDML.g:5403:3: ( '[' )
            {
             before(grammarAccess.getEnumeratedTypeAccess().getArrayLeftSquareBracketKeyword_13_0_0()); 
            // InternalMDML.g:5404:3: ( '[' )
            // InternalMDML.g:5405:4: '['
            {
             before(grammarAccess.getEnumeratedTypeAccess().getArrayLeftSquareBracketKeyword_13_0_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getEnumeratedTypeAccess().getArrayLeftSquareBracketKeyword_13_0_0()); 

            }

             after(grammarAccess.getEnumeratedTypeAccess().getArrayLeftSquareBracketKeyword_13_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__ArrayAssignment_13_0"


    // $ANTLR start "rule__EnumeratedType__LengthAssignment_13_1"
    // InternalMDML.g:5416:1: rule__EnumeratedType__LengthAssignment_13_1 : ( RULE_INT ) ;
    public final void rule__EnumeratedType__LengthAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5420:1: ( ( RULE_INT ) )
            // InternalMDML.g:5421:2: ( RULE_INT )
            {
            // InternalMDML.g:5421:2: ( RULE_INT )
            // InternalMDML.g:5422:3: RULE_INT
            {
             before(grammarAccess.getEnumeratedTypeAccess().getLengthINTTerminalRuleCall_13_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEnumeratedTypeAccess().getLengthINTTerminalRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumeratedType__LengthAssignment_13_1"


    // $ANTLR start "rule__ReferenceType__StatusAssignment_2"
    // InternalMDML.g:5431:1: rule__ReferenceType__StatusAssignment_2 : ( ruleStatus ) ;
    public final void rule__ReferenceType__StatusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5435:1: ( ( ruleStatus ) )
            // InternalMDML.g:5436:2: ( ruleStatus )
            {
            // InternalMDML.g:5436:2: ( ruleStatus )
            // InternalMDML.g:5437:3: ruleStatus
            {
             before(grammarAccess.getReferenceTypeAccess().getStatusStatusParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getReferenceTypeAccess().getStatusStatusParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__StatusAssignment_2"


    // $ANTLR start "rule__ReferenceType__GuidAssignment_4"
    // InternalMDML.g:5446:1: rule__ReferenceType__GuidAssignment_4 : ( ruleGUID ) ;
    public final void rule__ReferenceType__GuidAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5450:1: ( ( ruleGUID ) )
            // InternalMDML.g:5451:2: ( ruleGUID )
            {
            // InternalMDML.g:5451:2: ( ruleGUID )
            // InternalMDML.g:5452:3: ruleGUID
            {
             before(grammarAccess.getReferenceTypeAccess().getGuidGUIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGUID();

            state._fsp--;

             after(grammarAccess.getReferenceTypeAccess().getGuidGUIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__GuidAssignment_4"


    // $ANTLR start "rule__ReferenceType__RefinesAssignment_9"
    // InternalMDML.g:5461:1: rule__ReferenceType__RefinesAssignment_9 : ( ruleREFINE ) ;
    public final void rule__ReferenceType__RefinesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5465:1: ( ( ruleREFINE ) )
            // InternalMDML.g:5466:2: ( ruleREFINE )
            {
            // InternalMDML.g:5466:2: ( ruleREFINE )
            // InternalMDML.g:5467:3: ruleREFINE
            {
             before(grammarAccess.getReferenceTypeAccess().getRefinesREFINEParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleREFINE();

            state._fsp--;

             after(grammarAccess.getReferenceTypeAccess().getRefinesREFINEParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__RefinesAssignment_9"


    // $ANTLR start "rule__ReferenceType__NameAssignment_10"
    // InternalMDML.g:5476:1: rule__ReferenceType__NameAssignment_10 : ( ruleQualifiedName ) ;
    public final void rule__ReferenceType__NameAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5480:1: ( ( ruleQualifiedName ) )
            // InternalMDML.g:5481:2: ( ruleQualifiedName )
            {
            // InternalMDML.g:5481:2: ( ruleQualifiedName )
            // InternalMDML.g:5482:3: ruleQualifiedName
            {
             before(grammarAccess.getReferenceTypeAccess().getNameQualifiedNameParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceTypeAccess().getNameQualifiedNameParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__NameAssignment_10"


    // $ANTLR start "rule__ReferenceType__TypeAssignment_12"
    // InternalMDML.g:5491:1: rule__ReferenceType__TypeAssignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceType__TypeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5495:1: ( ( ( RULE_ID ) ) )
            // InternalMDML.g:5496:2: ( ( RULE_ID ) )
            {
            // InternalMDML.g:5496:2: ( ( RULE_ID ) )
            // InternalMDML.g:5497:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceTypeAccess().getTypeDataClassCrossReference_12_0()); 
            // InternalMDML.g:5498:3: ( RULE_ID )
            // InternalMDML.g:5499:4: RULE_ID
            {
             before(grammarAccess.getReferenceTypeAccess().getTypeDataClassIDTerminalRuleCall_12_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceTypeAccess().getTypeDataClassIDTerminalRuleCall_12_0_1()); 

            }

             after(grammarAccess.getReferenceTypeAccess().getTypeDataClassCrossReference_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceType__TypeAssignment_12"


    // $ANTLR start "rule__PrimitiveType__StatusAssignment_1_2"
    // InternalMDML.g:5510:1: rule__PrimitiveType__StatusAssignment_1_2 : ( ruleStatus ) ;
    public final void rule__PrimitiveType__StatusAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5514:1: ( ( ruleStatus ) )
            // InternalMDML.g:5515:2: ( ruleStatus )
            {
            // InternalMDML.g:5515:2: ( ruleStatus )
            // InternalMDML.g:5516:3: ruleStatus
            {
             before(grammarAccess.getPrimitiveTypeAccess().getStatusStatusParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeAccess().getStatusStatusParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__StatusAssignment_1_2"


    // $ANTLR start "rule__PrimitiveType__GuidAssignment_1_4"
    // InternalMDML.g:5525:1: rule__PrimitiveType__GuidAssignment_1_4 : ( ruleGUID ) ;
    public final void rule__PrimitiveType__GuidAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5529:1: ( ( ruleGUID ) )
            // InternalMDML.g:5530:2: ( ruleGUID )
            {
            // InternalMDML.g:5530:2: ( ruleGUID )
            // InternalMDML.g:5531:3: ruleGUID
            {
             before(grammarAccess.getPrimitiveTypeAccess().getGuidGUIDParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGUID();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeAccess().getGuidGUIDParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__GuidAssignment_1_4"


    // $ANTLR start "rule__PrimitiveType__RefinesAssignment_1_9"
    // InternalMDML.g:5540:1: rule__PrimitiveType__RefinesAssignment_1_9 : ( ruleREFINE ) ;
    public final void rule__PrimitiveType__RefinesAssignment_1_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5544:1: ( ( ruleREFINE ) )
            // InternalMDML.g:5545:2: ( ruleREFINE )
            {
            // InternalMDML.g:5545:2: ( ruleREFINE )
            // InternalMDML.g:5546:3: ruleREFINE
            {
             before(grammarAccess.getPrimitiveTypeAccess().getRefinesREFINEParserRuleCall_1_9_0()); 
            pushFollow(FOLLOW_2);
            ruleREFINE();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeAccess().getRefinesREFINEParserRuleCall_1_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__RefinesAssignment_1_9"


    // $ANTLR start "rule__PrimitiveType__NameAssignment_1_10"
    // InternalMDML.g:5555:1: rule__PrimitiveType__NameAssignment_1_10 : ( ruleQualifiedName ) ;
    public final void rule__PrimitiveType__NameAssignment_1_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5559:1: ( ( ruleQualifiedName ) )
            // InternalMDML.g:5560:2: ( ruleQualifiedName )
            {
            // InternalMDML.g:5560:2: ( ruleQualifiedName )
            // InternalMDML.g:5561:3: ruleQualifiedName
            {
             before(grammarAccess.getPrimitiveTypeAccess().getNameQualifiedNameParserRuleCall_1_10_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeAccess().getNameQualifiedNameParserRuleCall_1_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__NameAssignment_1_10"


    // $ANTLR start "rule__PrimitiveType__TypeAssignment_1_12"
    // InternalMDML.g:5570:1: rule__PrimitiveType__TypeAssignment_1_12 : ( ruleBasic ) ;
    public final void rule__PrimitiveType__TypeAssignment_1_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5574:1: ( ( ruleBasic ) )
            // InternalMDML.g:5575:2: ( ruleBasic )
            {
            // InternalMDML.g:5575:2: ( ruleBasic )
            // InternalMDML.g:5576:3: ruleBasic
            {
             before(grammarAccess.getPrimitiveTypeAccess().getTypeBasicParserRuleCall_1_12_0()); 
            pushFollow(FOLLOW_2);
            ruleBasic();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeAccess().getTypeBasicParserRuleCall_1_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__TypeAssignment_1_12"


    // $ANTLR start "rule__PrimitiveType__RuleAssignment_1_13"
    // InternalMDML.g:5585:1: rule__PrimitiveType__RuleAssignment_1_13 : ( ( RULE_ID ) ) ;
    public final void rule__PrimitiveType__RuleAssignment_1_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5589:1: ( ( ( RULE_ID ) ) )
            // InternalMDML.g:5590:2: ( ( RULE_ID ) )
            {
            // InternalMDML.g:5590:2: ( ( RULE_ID ) )
            // InternalMDML.g:5591:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getRuleConstraintCrossReference_1_13_0()); 
            // InternalMDML.g:5592:3: ( RULE_ID )
            // InternalMDML.g:5593:4: RULE_ID
            {
             before(grammarAccess.getPrimitiveTypeAccess().getRuleConstraintIDTerminalRuleCall_1_13_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getRuleConstraintIDTerminalRuleCall_1_13_0_1()); 

            }

             after(grammarAccess.getPrimitiveTypeAccess().getRuleConstraintCrossReference_1_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__RuleAssignment_1_13"


    // $ANTLR start "rule__Basic__TypenameAssignment"
    // InternalMDML.g:5604:1: rule__Basic__TypenameAssignment : ( ( rule__Basic__TypenameAlternatives_0 ) ) ;
    public final void rule__Basic__TypenameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5608:1: ( ( ( rule__Basic__TypenameAlternatives_0 ) ) )
            // InternalMDML.g:5609:2: ( ( rule__Basic__TypenameAlternatives_0 ) )
            {
            // InternalMDML.g:5609:2: ( ( rule__Basic__TypenameAlternatives_0 ) )
            // InternalMDML.g:5610:3: ( rule__Basic__TypenameAlternatives_0 )
            {
             before(grammarAccess.getBasicAccess().getTypenameAlternatives_0()); 
            // InternalMDML.g:5611:3: ( rule__Basic__TypenameAlternatives_0 )
            // InternalMDML.g:5611:4: rule__Basic__TypenameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Basic__TypenameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicAccess().getTypenameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basic__TypenameAssignment"


    // $ANTLR start "rule__DataClass__StatusAssignment_2"
    // InternalMDML.g:5619:1: rule__DataClass__StatusAssignment_2 : ( ruleStatus ) ;
    public final void rule__DataClass__StatusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5623:1: ( ( ruleStatus ) )
            // InternalMDML.g:5624:2: ( ruleStatus )
            {
            // InternalMDML.g:5624:2: ( ruleStatus )
            // InternalMDML.g:5625:3: ruleStatus
            {
             before(grammarAccess.getDataClassAccess().getStatusStatusParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getDataClassAccess().getStatusStatusParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__StatusAssignment_2"


    // $ANTLR start "rule__DataClass__GuidAssignment_4"
    // InternalMDML.g:5634:1: rule__DataClass__GuidAssignment_4 : ( ruleGUID ) ;
    public final void rule__DataClass__GuidAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5638:1: ( ( ruleGUID ) )
            // InternalMDML.g:5639:2: ( ruleGUID )
            {
            // InternalMDML.g:5639:2: ( ruleGUID )
            // InternalMDML.g:5640:3: ruleGUID
            {
             before(grammarAccess.getDataClassAccess().getGuidGUIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGUID();

            state._fsp--;

             after(grammarAccess.getDataClassAccess().getGuidGUIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__GuidAssignment_4"


    // $ANTLR start "rule__DataClass__RefinesAssignment_9"
    // InternalMDML.g:5649:1: rule__DataClass__RefinesAssignment_9 : ( ruleREFINE ) ;
    public final void rule__DataClass__RefinesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5653:1: ( ( ruleREFINE ) )
            // InternalMDML.g:5654:2: ( ruleREFINE )
            {
            // InternalMDML.g:5654:2: ( ruleREFINE )
            // InternalMDML.g:5655:3: ruleREFINE
            {
             before(grammarAccess.getDataClassAccess().getRefinesREFINEParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleREFINE();

            state._fsp--;

             after(grammarAccess.getDataClassAccess().getRefinesREFINEParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__RefinesAssignment_9"


    // $ANTLR start "rule__DataClass__NameAssignment_10"
    // InternalMDML.g:5664:1: rule__DataClass__NameAssignment_10 : ( ruleQualifiedName ) ;
    public final void rule__DataClass__NameAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5668:1: ( ( ruleQualifiedName ) )
            // InternalMDML.g:5669:2: ( ruleQualifiedName )
            {
            // InternalMDML.g:5669:2: ( ruleQualifiedName )
            // InternalMDML.g:5670:3: ruleQualifiedName
            {
             before(grammarAccess.getDataClassAccess().getNameQualifiedNameParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDataClassAccess().getNameQualifiedNameParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__NameAssignment_10"


    // $ANTLR start "rule__DataClass__DataelementsAssignment_12"
    // InternalMDML.g:5679:1: rule__DataClass__DataelementsAssignment_12 : ( ruleContainerElement ) ;
    public final void rule__DataClass__DataelementsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5683:1: ( ( ruleContainerElement ) )
            // InternalMDML.g:5684:2: ( ruleContainerElement )
            {
            // InternalMDML.g:5684:2: ( ruleContainerElement )
            // InternalMDML.g:5685:3: ruleContainerElement
            {
             before(grammarAccess.getDataClassAccess().getDataelementsContainerElementParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleContainerElement();

            state._fsp--;

             after(grammarAccess.getDataClassAccess().getDataelementsContainerElementParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__DataelementsAssignment_12"


    // $ANTLR start "rule__DataClass__ExtensionAssignment_13"
    // InternalMDML.g:5694:1: rule__DataClass__ExtensionAssignment_13 : ( ruleExtensionItem ) ;
    public final void rule__DataClass__ExtensionAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5698:1: ( ( ruleExtensionItem ) )
            // InternalMDML.g:5699:2: ( ruleExtensionItem )
            {
            // InternalMDML.g:5699:2: ( ruleExtensionItem )
            // InternalMDML.g:5700:3: ruleExtensionItem
            {
             before(grammarAccess.getDataClassAccess().getExtensionExtensionItemParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleExtensionItem();

            state._fsp--;

             after(grammarAccess.getDataClassAccess().getExtensionExtensionItemParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__ExtensionAssignment_13"


    // $ANTLR start "rule__DataElement__StatusAssignment_2"
    // InternalMDML.g:5709:1: rule__DataElement__StatusAssignment_2 : ( ruleStatus ) ;
    public final void rule__DataElement__StatusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5713:1: ( ( ruleStatus ) )
            // InternalMDML.g:5714:2: ( ruleStatus )
            {
            // InternalMDML.g:5714:2: ( ruleStatus )
            // InternalMDML.g:5715:3: ruleStatus
            {
             before(grammarAccess.getDataElementAccess().getStatusStatusParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getDataElementAccess().getStatusStatusParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__StatusAssignment_2"


    // $ANTLR start "rule__DataElement__GuidAssignment_4"
    // InternalMDML.g:5724:1: rule__DataElement__GuidAssignment_4 : ( ruleGUID ) ;
    public final void rule__DataElement__GuidAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5728:1: ( ( ruleGUID ) )
            // InternalMDML.g:5729:2: ( ruleGUID )
            {
            // InternalMDML.g:5729:2: ( ruleGUID )
            // InternalMDML.g:5730:3: ruleGUID
            {
             before(grammarAccess.getDataElementAccess().getGuidGUIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGUID();

            state._fsp--;

             after(grammarAccess.getDataElementAccess().getGuidGUIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__GuidAssignment_4"


    // $ANTLR start "rule__DataElement__RefinesAssignment_9"
    // InternalMDML.g:5739:1: rule__DataElement__RefinesAssignment_9 : ( ruleREFINE ) ;
    public final void rule__DataElement__RefinesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5743:1: ( ( ruleREFINE ) )
            // InternalMDML.g:5744:2: ( ruleREFINE )
            {
            // InternalMDML.g:5744:2: ( ruleREFINE )
            // InternalMDML.g:5745:3: ruleREFINE
            {
             before(grammarAccess.getDataElementAccess().getRefinesREFINEParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleREFINE();

            state._fsp--;

             after(grammarAccess.getDataElementAccess().getRefinesREFINEParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__RefinesAssignment_9"


    // $ANTLR start "rule__DataElement__NameAssignment_10"
    // InternalMDML.g:5754:1: rule__DataElement__NameAssignment_10 : ( ruleQualifiedName ) ;
    public final void rule__DataElement__NameAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5758:1: ( ( ruleQualifiedName ) )
            // InternalMDML.g:5759:2: ( ruleQualifiedName )
            {
            // InternalMDML.g:5759:2: ( ruleQualifiedName )
            // InternalMDML.g:5760:3: ruleQualifiedName
            {
             before(grammarAccess.getDataElementAccess().getNameQualifiedNameParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDataElementAccess().getNameQualifiedNameParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__NameAssignment_10"


    // $ANTLR start "rule__DataElement__TypeAssignment_12"
    // InternalMDML.g:5769:1: rule__DataElement__TypeAssignment_12 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DataElement__TypeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5773:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMDML.g:5774:2: ( ( ruleQualifiedName ) )
            {
            // InternalMDML.g:5774:2: ( ( ruleQualifiedName ) )
            // InternalMDML.g:5775:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getDataElementAccess().getTypeDataTypeCrossReference_12_0()); 
            // InternalMDML.g:5776:3: ( ruleQualifiedName )
            // InternalMDML.g:5777:4: ruleQualifiedName
            {
             before(grammarAccess.getDataElementAccess().getTypeDataTypeQualifiedNameParserRuleCall_12_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDataElementAccess().getTypeDataTypeQualifiedNameParserRuleCall_12_0_1()); 

            }

             after(grammarAccess.getDataElementAccess().getTypeDataTypeCrossReference_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__TypeAssignment_12"


    // $ANTLR start "rule__Constraint__NameAssignment_2"
    // InternalMDML.g:5788:1: rule__Constraint__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Constraint__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5792:1: ( ( ruleQualifiedName ) )
            // InternalMDML.g:5793:2: ( ruleQualifiedName )
            {
            // InternalMDML.g:5793:2: ( ruleQualifiedName )
            // InternalMDML.g:5794:3: ruleQualifiedName
            {
             before(grammarAccess.getConstraintAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getNameQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__NameAssignment_2"


    // $ANTLR start "rule__Constraint__SrcAssignment_4_0_0"
    // InternalMDML.g:5803:1: rule__Constraint__SrcAssignment_4_0_0 : ( ruleDataElement ) ;
    public final void rule__Constraint__SrcAssignment_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5807:1: ( ( ruleDataElement ) )
            // InternalMDML.g:5808:2: ( ruleDataElement )
            {
            // InternalMDML.g:5808:2: ( ruleDataElement )
            // InternalMDML.g:5809:3: ruleDataElement
            {
             before(grammarAccess.getConstraintAccess().getSrcDataElementParserRuleCall_4_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataElement();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getSrcDataElementParserRuleCall_4_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__SrcAssignment_4_0_0"


    // $ANTLR start "rule__Constraint__PredAssignment_4_1"
    // InternalMDML.g:5818:1: rule__Constraint__PredAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__PredAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5822:1: ( ( ( RULE_ID ) ) )
            // InternalMDML.g:5823:2: ( ( RULE_ID ) )
            {
            // InternalMDML.g:5823:2: ( ( RULE_ID ) )
            // InternalMDML.g:5824:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getPredPredicateCrossReference_4_1_0()); 
            // InternalMDML.g:5825:3: ( RULE_ID )
            // InternalMDML.g:5826:4: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getPredPredicateIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getPredPredicateIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getConstraintAccess().getPredPredicateCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__PredAssignment_4_1"


    // $ANTLR start "rule__Constraint__DestAssignment_4_2_1"
    // InternalMDML.g:5837:1: rule__Constraint__DestAssignment_4_2_1 : ( ruleDataElement ) ;
    public final void rule__Constraint__DestAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5841:1: ( ( ruleDataElement ) )
            // InternalMDML.g:5842:2: ( ruleDataElement )
            {
            // InternalMDML.g:5842:2: ( ruleDataElement )
            // InternalMDML.g:5843:3: ruleDataElement
            {
             before(grammarAccess.getConstraintAccess().getDestDataElementParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataElement();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getDestDataElementParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__DestAssignment_4_2_1"


    // $ANTLR start "rule__Predicate__NameAssignment_1"
    // InternalMDML.g:5852:1: rule__Predicate__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Predicate__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5856:1: ( ( ruleQualifiedName ) )
            // InternalMDML.g:5857:2: ( ruleQualifiedName )
            {
            // InternalMDML.g:5857:2: ( ruleQualifiedName )
            // InternalMDML.g:5858:3: ruleQualifiedName
            {
             before(grammarAccess.getPredicateAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__NameAssignment_1"


    // $ANTLR start "rule__Predicate__PredicateAssignment_3"
    // InternalMDML.g:5867:1: rule__Predicate__PredicateAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Predicate__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDML.g:5871:1: ( ( RULE_STRING ) )
            // InternalMDML.g:5872:2: ( RULE_STRING )
            {
            // InternalMDML.g:5872:2: ( RULE_STRING )
            // InternalMDML.g:5873:3: RULE_STRING
            {
             before(grammarAccess.getPredicateAccess().getPredicateSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPredicateAccess().getPredicateSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__PredicateAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00001FA981020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000007A900020002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000007A000020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000007A941020000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000060040000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});

}