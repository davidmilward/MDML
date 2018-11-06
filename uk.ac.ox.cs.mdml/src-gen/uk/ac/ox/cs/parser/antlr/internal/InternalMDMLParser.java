package uk.ac.ox.cs.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.ox.cs.services.MDMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMDMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DataModel'", "'status:'", "'domainid:'", "'@'", "'('", "')'", "'{'", "'}'", "'refines'", "':'", "'doesnotrefine'", "'.'", "'/'", "'ref'", "'relationship'", "'extension'", "'='", "';'", "'import'", "'.*'", "'enumtype'", "'['", "']'", "'reftype'", "'datatype'", "'STRING'", "'INT'", "'BOOLEAN'", "'DataClass'", "'DataElement'", "'draft'", "'finalized'", "'superceded'", "'constraint'", "'predicate'"
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

        public InternalMDMLParser(TokenStream input, MDMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DomainRegistry";
       	}

       	@Override
       	protected MDMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainRegistry"
    // InternalMDML.g:64:1: entryRuleDomainRegistry returns [EObject current=null] : iv_ruleDomainRegistry= ruleDomainRegistry EOF ;
    public final EObject entryRuleDomainRegistry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainRegistry = null;


        try {
            // InternalMDML.g:64:55: (iv_ruleDomainRegistry= ruleDomainRegistry EOF )
            // InternalMDML.g:65:2: iv_ruleDomainRegistry= ruleDomainRegistry EOF
            {
             newCompositeNode(grammarAccess.getDomainRegistryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainRegistry=ruleDomainRegistry();

            state._fsp--;

             current =iv_ruleDomainRegistry; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainRegistry"


    // $ANTLR start "ruleDomainRegistry"
    // InternalMDML.g:71:1: ruleDomainRegistry returns [EObject current=null] : ( (lv_registeredItems_0_0= ruleDataModel ) )* ;
    public final EObject ruleDomainRegistry() throws RecognitionException {
        EObject current = null;

        EObject lv_registeredItems_0_0 = null;



        	enterRule();

        try {
            // InternalMDML.g:77:2: ( ( (lv_registeredItems_0_0= ruleDataModel ) )* )
            // InternalMDML.g:78:2: ( (lv_registeredItems_0_0= ruleDataModel ) )*
            {
            // InternalMDML.g:78:2: ( (lv_registeredItems_0_0= ruleDataModel ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMDML.g:79:3: (lv_registeredItems_0_0= ruleDataModel )
            	    {
            	    // InternalMDML.g:79:3: (lv_registeredItems_0_0= ruleDataModel )
            	    // InternalMDML.g:80:4: lv_registeredItems_0_0= ruleDataModel
            	    {

            	    				newCompositeNode(grammarAccess.getDomainRegistryAccess().getRegisteredItemsDataModelParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_registeredItems_0_0=ruleDataModel();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDomainRegistryRule());
            	    				}
            	    				add(
            	    					current,
            	    					"registeredItems",
            	    					lv_registeredItems_0_0,
            	    					"uk.ac.ox.cs.MDML.DataModel");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainRegistry"


    // $ANTLR start "entryRuleDataModel"
    // InternalMDML.g:100:1: entryRuleDataModel returns [EObject current=null] : iv_ruleDataModel= ruleDataModel EOF ;
    public final EObject entryRuleDataModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataModel = null;


        try {
            // InternalMDML.g:100:50: (iv_ruleDataModel= ruleDataModel EOF )
            // InternalMDML.g:101:2: iv_ruleDataModel= ruleDataModel EOF
            {
             newCompositeNode(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataModel=ruleDataModel();

            state._fsp--;

             current =iv_ruleDataModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // InternalMDML.g:107:1: ruleDataModel returns [EObject current=null] : (otherlv_0= 'DataModel' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'status:' ( (lv_status_3_0= ruleStatus ) ) otherlv_4= 'domainid:' ( (lv_guid_5_0= ruleGUID ) ) otherlv_6= '@' otherlv_7= '(' ruleVersion otherlv_9= ')' ( (lv_refines_10_0= ruleREFINE ) ) otherlv_11= '{' ( (lv_elements_12_0= ruleDataItem ) )* ( (lv_relations_13_0= ruleRelationship ) )* ( (lv_constraint_14_0= ruleConstraint ) )* ( (lv_predicate_15_0= rulePredicate ) )* otherlv_16= '}' ) ;
    public final EObject ruleDataModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_status_3_0 = null;

        AntlrDatatypeRuleToken lv_guid_5_0 = null;

        AntlrDatatypeRuleToken lv_refines_10_0 = null;

        EObject lv_elements_12_0 = null;

        EObject lv_relations_13_0 = null;

        EObject lv_constraint_14_0 = null;

        EObject lv_predicate_15_0 = null;



        	enterRule();

        try {
            // InternalMDML.g:113:2: ( (otherlv_0= 'DataModel' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'status:' ( (lv_status_3_0= ruleStatus ) ) otherlv_4= 'domainid:' ( (lv_guid_5_0= ruleGUID ) ) otherlv_6= '@' otherlv_7= '(' ruleVersion otherlv_9= ')' ( (lv_refines_10_0= ruleREFINE ) ) otherlv_11= '{' ( (lv_elements_12_0= ruleDataItem ) )* ( (lv_relations_13_0= ruleRelationship ) )* ( (lv_constraint_14_0= ruleConstraint ) )* ( (lv_predicate_15_0= rulePredicate ) )* otherlv_16= '}' ) )
            // InternalMDML.g:114:2: (otherlv_0= 'DataModel' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'status:' ( (lv_status_3_0= ruleStatus ) ) otherlv_4= 'domainid:' ( (lv_guid_5_0= ruleGUID ) ) otherlv_6= '@' otherlv_7= '(' ruleVersion otherlv_9= ')' ( (lv_refines_10_0= ruleREFINE ) ) otherlv_11= '{' ( (lv_elements_12_0= ruleDataItem ) )* ( (lv_relations_13_0= ruleRelationship ) )* ( (lv_constraint_14_0= ruleConstraint ) )* ( (lv_predicate_15_0= rulePredicate ) )* otherlv_16= '}' )
            {
            // InternalMDML.g:114:2: (otherlv_0= 'DataModel' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'status:' ( (lv_status_3_0= ruleStatus ) ) otherlv_4= 'domainid:' ( (lv_guid_5_0= ruleGUID ) ) otherlv_6= '@' otherlv_7= '(' ruleVersion otherlv_9= ')' ( (lv_refines_10_0= ruleREFINE ) ) otherlv_11= '{' ( (lv_elements_12_0= ruleDataItem ) )* ( (lv_relations_13_0= ruleRelationship ) )* ( (lv_constraint_14_0= ruleConstraint ) )* ( (lv_predicate_15_0= rulePredicate ) )* otherlv_16= '}' )
            // InternalMDML.g:115:3: otherlv_0= 'DataModel' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'status:' ( (lv_status_3_0= ruleStatus ) ) otherlv_4= 'domainid:' ( (lv_guid_5_0= ruleGUID ) ) otherlv_6= '@' otherlv_7= '(' ruleVersion otherlv_9= ')' ( (lv_refines_10_0= ruleREFINE ) ) otherlv_11= '{' ( (lv_elements_12_0= ruleDataItem ) )* ( (lv_relations_13_0= ruleRelationship ) )* ( (lv_constraint_14_0= ruleConstraint ) )* ( (lv_predicate_15_0= rulePredicate ) )* otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataModelAccess().getDataModelKeyword_0());
            		
            // InternalMDML.g:119:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalMDML.g:120:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalMDML.g:120:4: (lv_name_1_0= ruleQualifiedName )
            // InternalMDML.g:121:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getDataModelAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uk.ac.ox.cs.MDML.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDataModelAccess().getStatusKeyword_2());
            		
            // InternalMDML.g:142:3: ( (lv_status_3_0= ruleStatus ) )
            // InternalMDML.g:143:4: (lv_status_3_0= ruleStatus )
            {
            // InternalMDML.g:143:4: (lv_status_3_0= ruleStatus )
            // InternalMDML.g:144:5: lv_status_3_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getDataModelAccess().getStatusStatusParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_status_3_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataModelRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_3_0,
            						"uk.ac.ox.cs.MDML.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getDataModelAccess().getDomainidKeyword_4());
            		
            // InternalMDML.g:165:3: ( (lv_guid_5_0= ruleGUID ) )
            // InternalMDML.g:166:4: (lv_guid_5_0= ruleGUID )
            {
            // InternalMDML.g:166:4: (lv_guid_5_0= ruleGUID )
            // InternalMDML.g:167:5: lv_guid_5_0= ruleGUID
            {

            					newCompositeNode(grammarAccess.getDataModelAccess().getGuidGUIDParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_guid_5_0=ruleGUID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataModelRule());
            					}
            					set(
            						current,
            						"guid",
            						lv_guid_5_0,
            						"uk.ac.ox.cs.MDML.GUID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getDataModelAccess().getCommercialAtKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getDataModelAccess().getLeftParenthesisKeyword_7());
            		

            			newCompositeNode(grammarAccess.getDataModelAccess().getVersionParserRuleCall_8());
            		
            pushFollow(FOLLOW_11);
            ruleVersion();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_9=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getDataModelAccess().getRightParenthesisKeyword_9());
            		
            // InternalMDML.g:203:3: ( (lv_refines_10_0= ruleREFINE ) )
            // InternalMDML.g:204:4: (lv_refines_10_0= ruleREFINE )
            {
            // InternalMDML.g:204:4: (lv_refines_10_0= ruleREFINE )
            // InternalMDML.g:205:5: lv_refines_10_0= ruleREFINE
            {

            					newCompositeNode(grammarAccess.getDataModelAccess().getRefinesREFINEParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_13);
            lv_refines_10_0=ruleREFINE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataModelRule());
            					}
            					set(
            						current,
            						"refines",
            						lv_refines_10_0,
            						"uk.ac.ox.cs.MDML.REFINE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_11, grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalMDML.g:226:3: ( (lv_elements_12_0= ruleDataItem ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||LA2_0==26||LA2_0==29||LA2_0==31||(LA2_0>=34 && LA2_0<=35)||(LA2_0>=39 && LA2_0<=40)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMDML.g:227:4: (lv_elements_12_0= ruleDataItem )
            	    {
            	    // InternalMDML.g:227:4: (lv_elements_12_0= ruleDataItem )
            	    // InternalMDML.g:228:5: lv_elements_12_0= ruleDataItem
            	    {

            	    					newCompositeNode(grammarAccess.getDataModelAccess().getElementsDataItemParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_elements_12_0=ruleDataItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_12_0,
            	    						"uk.ac.ox.cs.MDML.DataItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMDML.g:245:3: ( (lv_relations_13_0= ruleRelationship ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMDML.g:246:4: (lv_relations_13_0= ruleRelationship )
            	    {
            	    // InternalMDML.g:246:4: (lv_relations_13_0= ruleRelationship )
            	    // InternalMDML.g:247:5: lv_relations_13_0= ruleRelationship
            	    {

            	    					newCompositeNode(grammarAccess.getDataModelAccess().getRelationsRelationshipParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_relations_13_0=ruleRelationship();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_13_0,
            	    						"uk.ac.ox.cs.MDML.Relationship");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalMDML.g:264:3: ( (lv_constraint_14_0= ruleConstraint ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==44) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMDML.g:265:4: (lv_constraint_14_0= ruleConstraint )
            	    {
            	    // InternalMDML.g:265:4: (lv_constraint_14_0= ruleConstraint )
            	    // InternalMDML.g:266:5: lv_constraint_14_0= ruleConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getDataModelAccess().getConstraintConstraintParserRuleCall_14_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_constraint_14_0=ruleConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraint",
            	    						lv_constraint_14_0,
            	    						"uk.ac.ox.cs.MDML.Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalMDML.g:283:3: ( (lv_predicate_15_0= rulePredicate ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==45) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMDML.g:284:4: (lv_predicate_15_0= rulePredicate )
            	    {
            	    // InternalMDML.g:284:4: (lv_predicate_15_0= rulePredicate )
            	    // InternalMDML.g:285:5: lv_predicate_15_0= rulePredicate
            	    {

            	    					newCompositeNode(grammarAccess.getDataModelAccess().getPredicatePredicateParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_predicate_15_0=rulePredicate();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"predicate",
            	    						lv_predicate_15_0,
            	    						"uk.ac.ox.cs.MDML.Predicate");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_16=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleDataItem"
    // InternalMDML.g:310:1: entryRuleDataItem returns [EObject current=null] : iv_ruleDataItem= ruleDataItem EOF ;
    public final EObject entryRuleDataItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataItem = null;


        try {
            // InternalMDML.g:310:49: (iv_ruleDataItem= ruleDataItem EOF )
            // InternalMDML.g:311:2: iv_ruleDataItem= ruleDataItem EOF
            {
             newCompositeNode(grammarAccess.getDataItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataItem=ruleDataItem();

            state._fsp--;

             current =iv_ruleDataItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataItem"


    // $ANTLR start "ruleDataItem"
    // InternalMDML.g:317:1: ruleDataItem returns [EObject current=null] : ( ( (lv_dataitem_0_1= ruleDataModel | lv_dataitem_0_2= ruleDataClass | lv_dataitem_0_3= ruleDataElement | lv_dataitem_0_4= ruleDataType | lv_dataitem_0_5= ruleImport | lv_dataitem_0_6= ruleExtensionItem ) ) ) ;
    public final EObject ruleDataItem() throws RecognitionException {
        EObject current = null;

        EObject lv_dataitem_0_1 = null;

        EObject lv_dataitem_0_2 = null;

        EObject lv_dataitem_0_3 = null;

        EObject lv_dataitem_0_4 = null;

        EObject lv_dataitem_0_5 = null;

        EObject lv_dataitem_0_6 = null;



        	enterRule();

        try {
            // InternalMDML.g:323:2: ( ( ( (lv_dataitem_0_1= ruleDataModel | lv_dataitem_0_2= ruleDataClass | lv_dataitem_0_3= ruleDataElement | lv_dataitem_0_4= ruleDataType | lv_dataitem_0_5= ruleImport | lv_dataitem_0_6= ruleExtensionItem ) ) ) )
            // InternalMDML.g:324:2: ( ( (lv_dataitem_0_1= ruleDataModel | lv_dataitem_0_2= ruleDataClass | lv_dataitem_0_3= ruleDataElement | lv_dataitem_0_4= ruleDataType | lv_dataitem_0_5= ruleImport | lv_dataitem_0_6= ruleExtensionItem ) ) )
            {
            // InternalMDML.g:324:2: ( ( (lv_dataitem_0_1= ruleDataModel | lv_dataitem_0_2= ruleDataClass | lv_dataitem_0_3= ruleDataElement | lv_dataitem_0_4= ruleDataType | lv_dataitem_0_5= ruleImport | lv_dataitem_0_6= ruleExtensionItem ) ) )
            // InternalMDML.g:325:3: ( (lv_dataitem_0_1= ruleDataModel | lv_dataitem_0_2= ruleDataClass | lv_dataitem_0_3= ruleDataElement | lv_dataitem_0_4= ruleDataType | lv_dataitem_0_5= ruleImport | lv_dataitem_0_6= ruleExtensionItem ) )
            {
            // InternalMDML.g:325:3: ( (lv_dataitem_0_1= ruleDataModel | lv_dataitem_0_2= ruleDataClass | lv_dataitem_0_3= ruleDataElement | lv_dataitem_0_4= ruleDataType | lv_dataitem_0_5= ruleImport | lv_dataitem_0_6= ruleExtensionItem ) )
            // InternalMDML.g:326:4: (lv_dataitem_0_1= ruleDataModel | lv_dataitem_0_2= ruleDataClass | lv_dataitem_0_3= ruleDataElement | lv_dataitem_0_4= ruleDataType | lv_dataitem_0_5= ruleImport | lv_dataitem_0_6= ruleExtensionItem )
            {
            // InternalMDML.g:326:4: (lv_dataitem_0_1= ruleDataModel | lv_dataitem_0_2= ruleDataClass | lv_dataitem_0_3= ruleDataElement | lv_dataitem_0_4= ruleDataType | lv_dataitem_0_5= ruleImport | lv_dataitem_0_6= ruleExtensionItem )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 39:
                {
                alt6=2;
                }
                break;
            case 40:
                {
                alt6=3;
                }
                break;
            case 31:
            case 34:
            case 35:
                {
                alt6=4;
                }
                break;
            case 29:
                {
                alt6=5;
                }
                break;
            case 26:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMDML.g:327:5: lv_dataitem_0_1= ruleDataModel
                    {

                    					newCompositeNode(grammarAccess.getDataItemAccess().getDataitemDataModelParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_dataitem_0_1=ruleDataModel();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataItemRule());
                    					}
                    					set(
                    						current,
                    						"dataitem",
                    						lv_dataitem_0_1,
                    						"uk.ac.ox.cs.MDML.DataModel");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalMDML.g:343:5: lv_dataitem_0_2= ruleDataClass
                    {

                    					newCompositeNode(grammarAccess.getDataItemAccess().getDataitemDataClassParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_dataitem_0_2=ruleDataClass();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataItemRule());
                    					}
                    					set(
                    						current,
                    						"dataitem",
                    						lv_dataitem_0_2,
                    						"uk.ac.ox.cs.MDML.DataClass");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalMDML.g:359:5: lv_dataitem_0_3= ruleDataElement
                    {

                    					newCompositeNode(grammarAccess.getDataItemAccess().getDataitemDataElementParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_dataitem_0_3=ruleDataElement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataItemRule());
                    					}
                    					set(
                    						current,
                    						"dataitem",
                    						lv_dataitem_0_3,
                    						"uk.ac.ox.cs.MDML.DataElement");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 4 :
                    // InternalMDML.g:375:5: lv_dataitem_0_4= ruleDataType
                    {

                    					newCompositeNode(grammarAccess.getDataItemAccess().getDataitemDataTypeParserRuleCall_0_3());
                    				
                    pushFollow(FOLLOW_2);
                    lv_dataitem_0_4=ruleDataType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataItemRule());
                    					}
                    					set(
                    						current,
                    						"dataitem",
                    						lv_dataitem_0_4,
                    						"uk.ac.ox.cs.MDML.DataType");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 5 :
                    // InternalMDML.g:391:5: lv_dataitem_0_5= ruleImport
                    {

                    					newCompositeNode(grammarAccess.getDataItemAccess().getDataitemImportParserRuleCall_0_4());
                    				
                    pushFollow(FOLLOW_2);
                    lv_dataitem_0_5=ruleImport();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataItemRule());
                    					}
                    					set(
                    						current,
                    						"dataitem",
                    						lv_dataitem_0_5,
                    						"uk.ac.ox.cs.MDML.Import");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 6 :
                    // InternalMDML.g:407:5: lv_dataitem_0_6= ruleExtensionItem
                    {

                    					newCompositeNode(grammarAccess.getDataItemAccess().getDataitemExtensionItemParserRuleCall_0_5());
                    				
                    pushFollow(FOLLOW_2);
                    lv_dataitem_0_6=ruleExtensionItem();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataItemRule());
                    					}
                    					set(
                    						current,
                    						"dataitem",
                    						lv_dataitem_0_6,
                    						"uk.ac.ox.cs.MDML.ExtensionItem");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataItem"


    // $ANTLR start "entryRuleREFINE"
    // InternalMDML.g:428:1: entryRuleREFINE returns [String current=null] : iv_ruleREFINE= ruleREFINE EOF ;
    public final String entryRuleREFINE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREFINE = null;


        try {
            // InternalMDML.g:428:46: (iv_ruleREFINE= ruleREFINE EOF )
            // InternalMDML.g:429:2: iv_ruleREFINE= ruleREFINE EOF
            {
             newCompositeNode(grammarAccess.getREFINERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREFINE=ruleREFINE();

            state._fsp--;

             current =iv_ruleREFINE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleREFINE"


    // $ANTLR start "ruleREFINE"
    // InternalMDML.g:435:1: ruleREFINE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_REFINES_0= ruleREFINES | this_DOESNOTREFINE_1= ruleDOESNOTREFINE )? ;
    public final AntlrDatatypeRuleToken ruleREFINE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_REFINES_0 = null;

        AntlrDatatypeRuleToken this_DOESNOTREFINE_1 = null;



        	enterRule();

        try {
            // InternalMDML.g:441:2: ( (this_REFINES_0= ruleREFINES | this_DOESNOTREFINE_1= ruleDOESNOTREFINE )? )
            // InternalMDML.g:442:2: (this_REFINES_0= ruleREFINES | this_DOESNOTREFINE_1= ruleDOESNOTREFINE )?
            {
            // InternalMDML.g:442:2: (this_REFINES_0= ruleREFINES | this_DOESNOTREFINE_1= ruleDOESNOTREFINE )?
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            switch (alt7) {
                case 1 :
                    // InternalMDML.g:443:3: this_REFINES_0= ruleREFINES
                    {

                    			newCompositeNode(grammarAccess.getREFINEAccess().getREFINESParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_REFINES_0=ruleREFINES();

                    state._fsp--;


                    			current.merge(this_REFINES_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMDML.g:454:3: this_DOESNOTREFINE_1= ruleDOESNOTREFINE
                    {

                    			newCompositeNode(grammarAccess.getREFINEAccess().getDOESNOTREFINEParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DOESNOTREFINE_1=ruleDOESNOTREFINE();

                    state._fsp--;


                    			current.merge(this_DOESNOTREFINE_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleREFINE"


    // $ANTLR start "entryRuleREFINES"
    // InternalMDML.g:468:1: entryRuleREFINES returns [String current=null] : iv_ruleREFINES= ruleREFINES EOF ;
    public final String entryRuleREFINES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREFINES = null;


        try {
            // InternalMDML.g:468:47: (iv_ruleREFINES= ruleREFINES EOF )
            // InternalMDML.g:469:2: iv_ruleREFINES= ruleREFINES EOF
            {
             newCompositeNode(grammarAccess.getREFINESRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREFINES=ruleREFINES();

            state._fsp--;

             current =iv_ruleREFINES.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleREFINES"


    // $ANTLR start "ruleREFINES"
    // InternalMDML.g:475:1: ruleREFINES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'refines' kw= ':' this_Path_2= rulePath ) ;
    public final AntlrDatatypeRuleToken ruleREFINES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Path_2 = null;



        	enterRule();

        try {
            // InternalMDML.g:481:2: ( (kw= 'refines' kw= ':' this_Path_2= rulePath ) )
            // InternalMDML.g:482:2: (kw= 'refines' kw= ':' this_Path_2= rulePath )
            {
            // InternalMDML.g:482:2: (kw= 'refines' kw= ':' this_Path_2= rulePath )
            // InternalMDML.g:483:3: kw= 'refines' kw= ':' this_Path_2= rulePath
            {
            kw=(Token)match(input,19,FOLLOW_18); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getREFINESAccess().getRefinesKeyword_0());
            		
            kw=(Token)match(input,20,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getREFINESAccess().getColonKeyword_1());
            		

            			newCompositeNode(grammarAccess.getREFINESAccess().getPathParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_Path_2=rulePath();

            state._fsp--;


            			current.merge(this_Path_2);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleREFINES"


    // $ANTLR start "entryRuleDOESNOTREFINE"
    // InternalMDML.g:507:1: entryRuleDOESNOTREFINE returns [String current=null] : iv_ruleDOESNOTREFINE= ruleDOESNOTREFINE EOF ;
    public final String entryRuleDOESNOTREFINE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOESNOTREFINE = null;


        try {
            // InternalMDML.g:507:53: (iv_ruleDOESNOTREFINE= ruleDOESNOTREFINE EOF )
            // InternalMDML.g:508:2: iv_ruleDOESNOTREFINE= ruleDOESNOTREFINE EOF
            {
             newCompositeNode(grammarAccess.getDOESNOTREFINERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOESNOTREFINE=ruleDOESNOTREFINE();

            state._fsp--;

             current =iv_ruleDOESNOTREFINE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOESNOTREFINE"


    // $ANTLR start "ruleDOESNOTREFINE"
    // InternalMDML.g:514:1: ruleDOESNOTREFINE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'doesnotrefine' kw= ':' this_Path_2= rulePath ) ;
    public final AntlrDatatypeRuleToken ruleDOESNOTREFINE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Path_2 = null;



        	enterRule();

        try {
            // InternalMDML.g:520:2: ( (kw= 'doesnotrefine' kw= ':' this_Path_2= rulePath ) )
            // InternalMDML.g:521:2: (kw= 'doesnotrefine' kw= ':' this_Path_2= rulePath )
            {
            // InternalMDML.g:521:2: (kw= 'doesnotrefine' kw= ':' this_Path_2= rulePath )
            // InternalMDML.g:522:3: kw= 'doesnotrefine' kw= ':' this_Path_2= rulePath
            {
            kw=(Token)match(input,21,FOLLOW_18); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDOESNOTREFINEAccess().getDoesnotrefineKeyword_0());
            		
            kw=(Token)match(input,20,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDOESNOTREFINEAccess().getColonKeyword_1());
            		

            			newCompositeNode(grammarAccess.getDOESNOTREFINEAccess().getPathParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_Path_2=rulePath();

            state._fsp--;


            			current.merge(this_Path_2);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOESNOTREFINE"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMDML.g:546:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMDML.g:546:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMDML.g:547:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMDML.g:553:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMDML.g:559:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalMDML.g:560:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalMDML.g:560:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalMDML.g:561:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalMDML.g:568:3: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMDML.g:569:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,22,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRulePath"
    // InternalMDML.g:586:1: entryRulePath returns [String current=null] : iv_rulePath= rulePath EOF ;
    public final String entryRulePath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePath = null;


        try {
            // InternalMDML.g:586:44: (iv_rulePath= rulePath EOF )
            // InternalMDML.g:587:2: iv_rulePath= rulePath EOF
            {
             newCompositeNode(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePath=rulePath();

            state._fsp--;

             current =iv_rulePath.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // InternalMDML.g:593:1: rulePath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '/' this_QualifiedName_2= ruleQualifiedName )* ) ;
    public final AntlrDatatypeRuleToken rulePath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_QualifiedName_2 = null;



        	enterRule();

        try {
            // InternalMDML.g:599:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '/' this_QualifiedName_2= ruleQualifiedName )* ) )
            // InternalMDML.g:600:2: (this_QualifiedName_0= ruleQualifiedName (kw= '/' this_QualifiedName_2= ruleQualifiedName )* )
            {
            // InternalMDML.g:600:2: (this_QualifiedName_0= ruleQualifiedName (kw= '/' this_QualifiedName_2= ruleQualifiedName )* )
            // InternalMDML.g:601:3: this_QualifiedName_0= ruleQualifiedName (kw= '/' this_QualifiedName_2= ruleQualifiedName )*
            {

            			newCompositeNode(grammarAccess.getPathAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMDML.g:611:3: (kw= '/' this_QualifiedName_2= ruleQualifiedName )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMDML.g:612:4: kw= '/' this_QualifiedName_2= ruleQualifiedName
            	    {
            	    kw=(Token)match(input,23,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getPathAccess().getSolidusKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getPathAccess().getQualifiedNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_20);
            	    this_QualifiedName_2=ruleQualifiedName();

            	    state._fsp--;


            	    				current.merge(this_QualifiedName_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleGUID"
    // InternalMDML.g:632:1: entryRuleGUID returns [String current=null] : iv_ruleGUID= ruleGUID EOF ;
    public final String entryRuleGUID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGUID = null;


        try {
            // InternalMDML.g:632:44: (iv_ruleGUID= ruleGUID EOF )
            // InternalMDML.g:633:2: iv_ruleGUID= ruleGUID EOF
            {
             newCompositeNode(grammarAccess.getGUIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGUID=ruleGUID();

            state._fsp--;

             current =iv_ruleGUID.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGUID"


    // $ANTLR start "ruleGUID"
    // InternalMDML.g:639:1: ruleGUID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( (kw= '.' this_ID_2= RULE_ID ) | (kw= '/' this_ID_4= RULE_ID ) )* ) ;
    public final AntlrDatatypeRuleToken ruleGUID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;


        	enterRule();

        try {
            // InternalMDML.g:645:2: ( (this_ID_0= RULE_ID ( (kw= '.' this_ID_2= RULE_ID ) | (kw= '/' this_ID_4= RULE_ID ) )* ) )
            // InternalMDML.g:646:2: (this_ID_0= RULE_ID ( (kw= '.' this_ID_2= RULE_ID ) | (kw= '/' this_ID_4= RULE_ID ) )* )
            {
            // InternalMDML.g:646:2: (this_ID_0= RULE_ID ( (kw= '.' this_ID_2= RULE_ID ) | (kw= '/' this_ID_4= RULE_ID ) )* )
            // InternalMDML.g:647:3: this_ID_0= RULE_ID ( (kw= '.' this_ID_2= RULE_ID ) | (kw= '/' this_ID_4= RULE_ID ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getGUIDAccess().getIDTerminalRuleCall_0());
            		
            // InternalMDML.g:654:3: ( (kw= '.' this_ID_2= RULE_ID ) | (kw= '/' this_ID_4= RULE_ID ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }
                else if ( (LA10_0==23) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMDML.g:655:4: (kw= '.' this_ID_2= RULE_ID )
            	    {
            	    // InternalMDML.g:655:4: (kw= '.' this_ID_2= RULE_ID )
            	    // InternalMDML.g:656:5: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,22,FOLLOW_4); 

            	    					current.merge(kw);
            	    					newLeafNode(kw, grammarAccess.getGUIDAccess().getFullStopKeyword_1_0_0());
            	    				
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    					current.merge(this_ID_2);
            	    				

            	    					newLeafNode(this_ID_2, grammarAccess.getGUIDAccess().getIDTerminalRuleCall_1_0_1());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMDML.g:670:4: (kw= '/' this_ID_4= RULE_ID )
            	    {
            	    // InternalMDML.g:670:4: (kw= '/' this_ID_4= RULE_ID )
            	    // InternalMDML.g:671:5: kw= '/' this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,23,FOLLOW_4); 

            	    					current.merge(kw);
            	    					newLeafNode(kw, grammarAccess.getGUIDAccess().getSolidusKeyword_1_1_0());
            	    				
            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    					current.merge(this_ID_4);
            	    				

            	    					newLeafNode(this_ID_4, grammarAccess.getGUIDAccess().getIDTerminalRuleCall_1_1_1());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGUID"


    // $ANTLR start "entryRuleVersion"
    // InternalMDML.g:689:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalMDML.g:689:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalMDML.g:690:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalMDML.g:696:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleVersion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalMDML.g:702:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) )
            // InternalMDML.g:703:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            {
            // InternalMDML.g:703:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            // InternalMDML.g:704:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,22,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_22); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getVersionAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,22,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_3());
            		
            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_4);
            		

            			newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleReference"
    // InternalMDML.g:739:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalMDML.g:739:50: (iv_ruleReference= ruleReference EOF )
            // InternalMDML.g:740:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalMDML.g:746:1: ruleReference returns [EObject current=null] : (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMDML.g:752:2: ( (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMDML.g:753:2: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalMDML.g:753:2: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalMDML.g:754:3: otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getRefKeyword_0());
            		
            // InternalMDML.g:758:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMDML.g:759:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMDML.g:759:4: (lv_name_1_0= RULE_ID )
            // InternalMDML.g:760:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getColonKeyword_2());
            		
            // InternalMDML.g:780:3: ( (otherlv_3= RULE_ID ) )
            // InternalMDML.g:781:4: (otherlv_3= RULE_ID )
            {
            // InternalMDML.g:781:4: (otherlv_3= RULE_ID )
            // InternalMDML.g:782:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getTypeDataItemCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleRelationSource"
    // InternalMDML.g:797:1: entryRuleRelationSource returns [EObject current=null] : iv_ruleRelationSource= ruleRelationSource EOF ;
    public final EObject entryRuleRelationSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationSource = null;


        try {
            // InternalMDML.g:797:55: (iv_ruleRelationSource= ruleRelationSource EOF )
            // InternalMDML.g:798:2: iv_ruleRelationSource= ruleRelationSource EOF
            {
             newCompositeNode(grammarAccess.getRelationSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationSource=ruleRelationSource();

            state._fsp--;

             current =iv_ruleRelationSource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationSource"


    // $ANTLR start "ruleRelationSource"
    // InternalMDML.g:804:1: ruleRelationSource returns [EObject current=null] : (this_DataModel_0= ruleDataModel | this_DataClass_1= ruleDataClass | this_DataElement_2= ruleDataElement | this_DataType_3= ruleDataType ) ;
    public final EObject ruleRelationSource() throws RecognitionException {
        EObject current = null;

        EObject this_DataModel_0 = null;

        EObject this_DataClass_1 = null;

        EObject this_DataElement_2 = null;

        EObject this_DataType_3 = null;



        	enterRule();

        try {
            // InternalMDML.g:810:2: ( (this_DataModel_0= ruleDataModel | this_DataClass_1= ruleDataClass | this_DataElement_2= ruleDataElement | this_DataType_3= ruleDataType ) )
            // InternalMDML.g:811:2: (this_DataModel_0= ruleDataModel | this_DataClass_1= ruleDataClass | this_DataElement_2= ruleDataElement | this_DataType_3= ruleDataType )
            {
            // InternalMDML.g:811:2: (this_DataModel_0= ruleDataModel | this_DataClass_1= ruleDataClass | this_DataElement_2= ruleDataElement | this_DataType_3= ruleDataType )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt11=1;
                }
                break;
            case 39:
                {
                alt11=2;
                }
                break;
            case 40:
                {
                alt11=3;
                }
                break;
            case 31:
            case 34:
            case 35:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMDML.g:812:3: this_DataModel_0= ruleDataModel
                    {

                    			newCompositeNode(grammarAccess.getRelationSourceAccess().getDataModelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataModel_0=ruleDataModel();

                    state._fsp--;


                    			current = this_DataModel_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMDML.g:821:3: this_DataClass_1= ruleDataClass
                    {

                    			newCompositeNode(grammarAccess.getRelationSourceAccess().getDataClassParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataClass_1=ruleDataClass();

                    state._fsp--;


                    			current = this_DataClass_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMDML.g:830:3: this_DataElement_2= ruleDataElement
                    {

                    			newCompositeNode(grammarAccess.getRelationSourceAccess().getDataElementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataElement_2=ruleDataElement();

                    state._fsp--;


                    			current = this_DataElement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMDML.g:839:3: this_DataType_3= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getRelationSourceAccess().getDataTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_3=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationSource"


    // $ANTLR start "entryRuleRelationDestination"
    // InternalMDML.g:851:1: entryRuleRelationDestination returns [EObject current=null] : iv_ruleRelationDestination= ruleRelationDestination EOF ;
    public final EObject entryRuleRelationDestination() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationDestination = null;


        try {
            // InternalMDML.g:851:60: (iv_ruleRelationDestination= ruleRelationDestination EOF )
            // InternalMDML.g:852:2: iv_ruleRelationDestination= ruleRelationDestination EOF
            {
             newCompositeNode(grammarAccess.getRelationDestinationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationDestination=ruleRelationDestination();

            state._fsp--;

             current =iv_ruleRelationDestination; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationDestination"


    // $ANTLR start "ruleRelationDestination"
    // InternalMDML.g:858:1: ruleRelationDestination returns [EObject current=null] : (this_DataModel_0= ruleDataModel | this_DataClass_1= ruleDataClass | this_DataElement_2= ruleDataElement | this_DataType_3= ruleDataType ) ;
    public final EObject ruleRelationDestination() throws RecognitionException {
        EObject current = null;

        EObject this_DataModel_0 = null;

        EObject this_DataClass_1 = null;

        EObject this_DataElement_2 = null;

        EObject this_DataType_3 = null;



        	enterRule();

        try {
            // InternalMDML.g:864:2: ( (this_DataModel_0= ruleDataModel | this_DataClass_1= ruleDataClass | this_DataElement_2= ruleDataElement | this_DataType_3= ruleDataType ) )
            // InternalMDML.g:865:2: (this_DataModel_0= ruleDataModel | this_DataClass_1= ruleDataClass | this_DataElement_2= ruleDataElement | this_DataType_3= ruleDataType )
            {
            // InternalMDML.g:865:2: (this_DataModel_0= ruleDataModel | this_DataClass_1= ruleDataClass | this_DataElement_2= ruleDataElement | this_DataType_3= ruleDataType )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt12=1;
                }
                break;
            case 39:
                {
                alt12=2;
                }
                break;
            case 40:
                {
                alt12=3;
                }
                break;
            case 31:
            case 34:
            case 35:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMDML.g:866:3: this_DataModel_0= ruleDataModel
                    {

                    			newCompositeNode(grammarAccess.getRelationDestinationAccess().getDataModelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataModel_0=ruleDataModel();

                    state._fsp--;


                    			current = this_DataModel_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMDML.g:875:3: this_DataClass_1= ruleDataClass
                    {

                    			newCompositeNode(grammarAccess.getRelationDestinationAccess().getDataClassParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataClass_1=ruleDataClass();

                    state._fsp--;


                    			current = this_DataClass_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMDML.g:884:3: this_DataElement_2= ruleDataElement
                    {

                    			newCompositeNode(grammarAccess.getRelationDestinationAccess().getDataElementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataElement_2=ruleDataElement();

                    state._fsp--;


                    			current = this_DataElement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMDML.g:893:3: this_DataType_3= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getRelationDestinationAccess().getDataTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_3=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationDestination"


    // $ANTLR start "entryRuleRelationship"
    // InternalMDML.g:905:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalMDML.g:905:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalMDML.g:906:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalMDML.g:912:1: ruleRelationship returns [EObject current=null] : (otherlv_0= 'relationship' ( ( (lv_src_1_0= ruleRelationSource ) ) otherlv_2= ':' ( (lv_dest_3_0= ruleRelationDestination ) ) ) ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_src_1_0 = null;

        EObject lv_dest_3_0 = null;



        	enterRule();

        try {
            // InternalMDML.g:918:2: ( (otherlv_0= 'relationship' ( ( (lv_src_1_0= ruleRelationSource ) ) otherlv_2= ':' ( (lv_dest_3_0= ruleRelationDestination ) ) ) ) )
            // InternalMDML.g:919:2: (otherlv_0= 'relationship' ( ( (lv_src_1_0= ruleRelationSource ) ) otherlv_2= ':' ( (lv_dest_3_0= ruleRelationDestination ) ) ) )
            {
            // InternalMDML.g:919:2: (otherlv_0= 'relationship' ( ( (lv_src_1_0= ruleRelationSource ) ) otherlv_2= ':' ( (lv_dest_3_0= ruleRelationDestination ) ) ) )
            // InternalMDML.g:920:3: otherlv_0= 'relationship' ( ( (lv_src_1_0= ruleRelationSource ) ) otherlv_2= ':' ( (lv_dest_3_0= ruleRelationDestination ) ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationshipAccess().getRelationshipKeyword_0());
            		
            // InternalMDML.g:924:3: ( ( (lv_src_1_0= ruleRelationSource ) ) otherlv_2= ':' ( (lv_dest_3_0= ruleRelationDestination ) ) )
            // InternalMDML.g:925:4: ( (lv_src_1_0= ruleRelationSource ) ) otherlv_2= ':' ( (lv_dest_3_0= ruleRelationDestination ) )
            {
            // InternalMDML.g:925:4: ( (lv_src_1_0= ruleRelationSource ) )
            // InternalMDML.g:926:5: (lv_src_1_0= ruleRelationSource )
            {
            // InternalMDML.g:926:5: (lv_src_1_0= ruleRelationSource )
            // InternalMDML.g:927:6: lv_src_1_0= ruleRelationSource
            {

            						newCompositeNode(grammarAccess.getRelationshipAccess().getSrcRelationSourceParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_18);
            lv_src_1_0=ruleRelationSource();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRelationshipRule());
            						}
            						set(
            							current,
            							"src",
            							lv_src_1_0,
            							"uk.ac.ox.cs.MDML.RelationSource");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_23); 

            				newLeafNode(otherlv_2, grammarAccess.getRelationshipAccess().getColonKeyword_1_1());
            			
            // InternalMDML.g:948:4: ( (lv_dest_3_0= ruleRelationDestination ) )
            // InternalMDML.g:949:5: (lv_dest_3_0= ruleRelationDestination )
            {
            // InternalMDML.g:949:5: (lv_dest_3_0= ruleRelationDestination )
            // InternalMDML.g:950:6: lv_dest_3_0= ruleRelationDestination
            {

            						newCompositeNode(grammarAccess.getRelationshipAccess().getDestRelationDestinationParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_2);
            lv_dest_3_0=ruleRelationDestination();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRelationshipRule());
            						}
            						set(
            							current,
            							"dest",
            							lv_dest_3_0,
            							"uk.ac.ox.cs.MDML.RelationDestination");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleExtensionItem"
    // InternalMDML.g:972:1: entryRuleExtensionItem returns [EObject current=null] : iv_ruleExtensionItem= ruleExtensionItem EOF ;
    public final EObject entryRuleExtensionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionItem = null;


        try {
            // InternalMDML.g:972:54: (iv_ruleExtensionItem= ruleExtensionItem EOF )
            // InternalMDML.g:973:2: iv_ruleExtensionItem= ruleExtensionItem EOF
            {
             newCompositeNode(grammarAccess.getExtensionItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtensionItem=ruleExtensionItem();

            state._fsp--;

             current =iv_ruleExtensionItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtensionItem"


    // $ANTLR start "ruleExtensionItem"
    // InternalMDML.g:979:1: ruleExtensionItem returns [EObject current=null] : (otherlv_0= 'extension' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' ) ;
    public final EObject ruleExtensionItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMDML.g:985:2: ( (otherlv_0= 'extension' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' ) )
            // InternalMDML.g:986:2: (otherlv_0= 'extension' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' )
            {
            // InternalMDML.g:986:2: (otherlv_0= 'extension' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' )
            // InternalMDML.g:987:3: otherlv_0= 'extension' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExtensionItemAccess().getExtensionKeyword_0());
            		
            // InternalMDML.g:991:3: ( (lv_key_1_0= RULE_ID ) )
            // InternalMDML.g:992:4: (lv_key_1_0= RULE_ID )
            {
            // InternalMDML.g:992:4: (lv_key_1_0= RULE_ID )
            // InternalMDML.g:993:5: lv_key_1_0= RULE_ID
            {
            lv_key_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_key_1_0, grammarAccess.getExtensionItemAccess().getKeyIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtensionItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getExtensionItemAccess().getEqualsSignKeyword_2());
            		
            // InternalMDML.g:1013:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalMDML.g:1014:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalMDML.g:1014:4: (lv_value_3_0= RULE_STRING )
            // InternalMDML.g:1015:5: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_value_3_0, grammarAccess.getExtensionItemAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtensionItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getExtensionItemAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtensionItem"


    // $ANTLR start "entryRuleImport"
    // InternalMDML.g:1039:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMDML.g:1039:47: (iv_ruleImport= ruleImport EOF )
            // InternalMDML.g:1040:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMDML.g:1046:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalMDML.g:1052:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalMDML.g:1053:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalMDML.g:1053:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalMDML.g:1054:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalMDML.g:1058:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalMDML.g:1059:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalMDML.g:1059:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalMDML.g:1060:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"uk.ac.ox.cs.MDML.QualifiedNameWithWildcard");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalMDML.g:1081:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalMDML.g:1081:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalMDML.g:1082:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalMDML.g:1088:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalMDML.g:1094:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalMDML.g:1095:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalMDML.g:1095:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalMDML.g:1096:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMDML.g:1106:3: (kw= '.*' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMDML.g:1107:4: kw= '.*'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleDataType"
    // InternalMDML.g:1117:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalMDML.g:1117:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalMDML.g:1118:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalMDML.g:1124:1: ruleDataType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_ReferenceType_1= ruleReferenceType | this_EnumeratedType_2= ruleEnumeratedType ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_ReferenceType_1 = null;

        EObject this_EnumeratedType_2 = null;



        	enterRule();

        try {
            // InternalMDML.g:1130:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_ReferenceType_1= ruleReferenceType | this_EnumeratedType_2= ruleEnumeratedType ) )
            // InternalMDML.g:1131:2: (this_PrimitiveType_0= rulePrimitiveType | this_ReferenceType_1= ruleReferenceType | this_EnumeratedType_2= ruleEnumeratedType )
            {
            // InternalMDML.g:1131:2: (this_PrimitiveType_0= rulePrimitiveType | this_ReferenceType_1= ruleReferenceType | this_EnumeratedType_2= ruleEnumeratedType )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt14=1;
                }
                break;
            case 34:
                {
                alt14=2;
                }
                break;
            case 31:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMDML.g:1132:3: this_PrimitiveType_0= rulePrimitiveType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getPrimitiveTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;


                    			current = this_PrimitiveType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMDML.g:1141:3: this_ReferenceType_1= ruleReferenceType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getReferenceTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReferenceType_1=ruleReferenceType();

                    state._fsp--;


                    			current = this_ReferenceType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMDML.g:1150:3: this_EnumeratedType_2= ruleEnumeratedType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getEnumeratedTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumeratedType_2=ruleEnumeratedType();

                    state._fsp--;


                    			current = this_EnumeratedType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEnumeratedType"
    // InternalMDML.g:1162:1: entryRuleEnumeratedType returns [EObject current=null] : iv_ruleEnumeratedType= ruleEnumeratedType EOF ;
    public final EObject entryRuleEnumeratedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeratedType = null;


        try {
            // InternalMDML.g:1162:55: (iv_ruleEnumeratedType= ruleEnumeratedType EOF )
            // InternalMDML.g:1163:2: iv_ruleEnumeratedType= ruleEnumeratedType EOF
            {
             newCompositeNode(grammarAccess.getEnumeratedTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeratedType=ruleEnumeratedType();

            state._fsp--;

             current =iv_ruleEnumeratedType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumeratedType"


    // $ANTLR start "ruleEnumeratedType"
    // InternalMDML.g:1169:1: ruleEnumeratedType returns [EObject current=null] : (otherlv_0= 'enumtype' otherlv_1= 'status:' ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'domainid:' ( (lv_guid_4_0= ruleGUID ) ) otherlv_5= '@' otherlv_6= '(' ruleVersion otherlv_8= ')' ( (lv_refines_9_0= ruleREFINE ) ) ( (lv_name_10_0= ruleQualifiedName ) ) otherlv_11= ':' ( (lv_type_12_0= rulePrimitiveType ) ) ( ( (lv_array_13_0= '[' ) ) ( (lv_length_14_0= RULE_INT ) )? otherlv_15= ']' )? ) ;
    public final EObject ruleEnumeratedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token lv_array_13_0=null;
        Token lv_length_14_0=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_status_2_0 = null;

        AntlrDatatypeRuleToken lv_guid_4_0 = null;

        AntlrDatatypeRuleToken lv_refines_9_0 = null;

        AntlrDatatypeRuleToken lv_name_10_0 = null;

        EObject lv_type_12_0 = null;



        	enterRule();

        try {
            // InternalMDML.g:1175:2: ( (otherlv_0= 'enumtype' otherlv_1= 'status:' ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'domainid:' ( (lv_guid_4_0= ruleGUID ) ) otherlv_5= '@' otherlv_6= '(' ruleVersion otherlv_8= ')' ( (lv_refines_9_0= ruleREFINE ) ) ( (lv_name_10_0= ruleQualifiedName ) ) otherlv_11= ':' ( (lv_type_12_0= rulePrimitiveType ) ) ( ( (lv_array_13_0= '[' ) ) ( (lv_length_14_0= RULE_INT ) )? otherlv_15= ']' )? ) )
            // InternalMDML.g:1176:2: (otherlv_0= 'enumtype' otherlv_1= 'status:' ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'domainid:' ( (lv_guid_4_0= ruleGUID ) ) otherlv_5= '@' otherlv_6= '(' ruleVersion otherlv_8= ')' ( (lv_refines_9_0= ruleREFINE ) ) ( (lv_name_10_0= ruleQualifiedName ) ) otherlv_11= ':' ( (lv_type_12_0= rulePrimitiveType ) ) ( ( (lv_array_13_0= '[' ) ) ( (lv_length_14_0= RULE_INT ) )? otherlv_15= ']' )? )
            {
            // InternalMDML.g:1176:2: (otherlv_0= 'enumtype' otherlv_1= 'status:' ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'domainid:' ( (lv_guid_4_0= ruleGUID ) ) otherlv_5= '@' otherlv_6= '(' ruleVersion otherlv_8= ')' ( (lv_refines_9_0= ruleREFINE ) ) ( (lv_name_10_0= ruleQualifiedName ) ) otherlv_11= ':' ( (lv_type_12_0= rulePrimitiveType ) ) ( ( (lv_array_13_0= '[' ) ) ( (lv_length_14_0= RULE_INT ) )? otherlv_15= ']' )? )
            // InternalMDML.g:1177:3: otherlv_0= 'enumtype' otherlv_1= 'status:' ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'domainid:' ( (lv_guid_4_0= ruleGUID ) ) otherlv_5= '@' otherlv_6= '(' ruleVersion otherlv_8= ')' ( (lv_refines_9_0= ruleREFINE ) ) ( (lv_name_10_0= ruleQualifiedName ) ) otherlv_11= ':' ( (lv_type_12_0= rulePrimitiveType ) ) ( ( (lv_array_13_0= '[' ) ) ( (lv_length_14_0= RULE_INT ) )? otherlv_15= ']' )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumeratedTypeAccess().getEnumtypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumeratedTypeAccess().getStatusKeyword_1());
            		
            // InternalMDML.g:1185:3: ( (lv_status_2_0= ruleStatus ) )
            // InternalMDML.g:1186:4: (lv_status_2_0= ruleStatus )
            {
            // InternalMDML.g:1186:4: (lv_status_2_0= ruleStatus )
            // InternalMDML.g:1187:5: lv_status_2_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getEnumeratedTypeAccess().getStatusStatusParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_status_2_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumeratedTypeRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_2_0,
            						"uk.ac.ox.cs.MDML.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumeratedTypeAccess().getDomainidKeyword_3());
            		
            // InternalMDML.g:1208:3: ( (lv_guid_4_0= ruleGUID ) )
            // InternalMDML.g:1209:4: (lv_guid_4_0= ruleGUID )
            {
            // InternalMDML.g:1209:4: (lv_guid_4_0= ruleGUID )
            // InternalMDML.g:1210:5: lv_guid_4_0= ruleGUID
            {

            					newCompositeNode(grammarAccess.getEnumeratedTypeAccess().getGuidGUIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_guid_4_0=ruleGUID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumeratedTypeRule());
            					}
            					set(
            						current,
            						"guid",
            						lv_guid_4_0,
            						"uk.ac.ox.cs.MDML.GUID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getEnumeratedTypeAccess().getCommercialAtKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getEnumeratedTypeAccess().getLeftParenthesisKeyword_6());
            		

            			newCompositeNode(grammarAccess.getEnumeratedTypeAccess().getVersionParserRuleCall_7());
            		
            pushFollow(FOLLOW_11);
            ruleVersion();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_8=(Token)match(input,16,FOLLOW_28); 

            			newLeafNode(otherlv_8, grammarAccess.getEnumeratedTypeAccess().getRightParenthesisKeyword_8());
            		
            // InternalMDML.g:1246:3: ( (lv_refines_9_0= ruleREFINE ) )
            // InternalMDML.g:1247:4: (lv_refines_9_0= ruleREFINE )
            {
            // InternalMDML.g:1247:4: (lv_refines_9_0= ruleREFINE )
            // InternalMDML.g:1248:5: lv_refines_9_0= ruleREFINE
            {

            					newCompositeNode(grammarAccess.getEnumeratedTypeAccess().getRefinesREFINEParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_4);
            lv_refines_9_0=ruleREFINE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumeratedTypeRule());
            					}
            					set(
            						current,
            						"refines",
            						lv_refines_9_0,
            						"uk.ac.ox.cs.MDML.REFINE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMDML.g:1265:3: ( (lv_name_10_0= ruleQualifiedName ) )
            // InternalMDML.g:1266:4: (lv_name_10_0= ruleQualifiedName )
            {
            // InternalMDML.g:1266:4: (lv_name_10_0= ruleQualifiedName )
            // InternalMDML.g:1267:5: lv_name_10_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getEnumeratedTypeAccess().getNameQualifiedNameParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_10_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumeratedTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_10_0,
            						"uk.ac.ox.cs.MDML.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_11, grammarAccess.getEnumeratedTypeAccess().getColonKeyword_11());
            		
            // InternalMDML.g:1288:3: ( (lv_type_12_0= rulePrimitiveType ) )
            // InternalMDML.g:1289:4: (lv_type_12_0= rulePrimitiveType )
            {
            // InternalMDML.g:1289:4: (lv_type_12_0= rulePrimitiveType )
            // InternalMDML.g:1290:5: lv_type_12_0= rulePrimitiveType
            {

            					newCompositeNode(grammarAccess.getEnumeratedTypeAccess().getTypePrimitiveTypeParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_30);
            lv_type_12_0=rulePrimitiveType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumeratedTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_12_0,
            						"uk.ac.ox.cs.MDML.PrimitiveType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMDML.g:1307:3: ( ( (lv_array_13_0= '[' ) ) ( (lv_length_14_0= RULE_INT ) )? otherlv_15= ']' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMDML.g:1308:4: ( (lv_array_13_0= '[' ) ) ( (lv_length_14_0= RULE_INT ) )? otherlv_15= ']'
                    {
                    // InternalMDML.g:1308:4: ( (lv_array_13_0= '[' ) )
                    // InternalMDML.g:1309:5: (lv_array_13_0= '[' )
                    {
                    // InternalMDML.g:1309:5: (lv_array_13_0= '[' )
                    // InternalMDML.g:1310:6: lv_array_13_0= '['
                    {
                    lv_array_13_0=(Token)match(input,32,FOLLOW_31); 

                    						newLeafNode(lv_array_13_0, grammarAccess.getEnumeratedTypeAccess().getArrayLeftSquareBracketKeyword_13_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumeratedTypeRule());
                    						}
                    						setWithLastConsumed(current, "array", true, "[");
                    					

                    }


                    }

                    // InternalMDML.g:1322:4: ( (lv_length_14_0= RULE_INT ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_INT) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalMDML.g:1323:5: (lv_length_14_0= RULE_INT )
                            {
                            // InternalMDML.g:1323:5: (lv_length_14_0= RULE_INT )
                            // InternalMDML.g:1324:6: lv_length_14_0= RULE_INT
                            {
                            lv_length_14_0=(Token)match(input,RULE_INT,FOLLOW_32); 

                            						newLeafNode(lv_length_14_0, grammarAccess.getEnumeratedTypeAccess().getLengthINTTerminalRuleCall_13_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getEnumeratedTypeRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"length",
                            							lv_length_14_0,
                            							"org.eclipse.xtext.common.Terminals.INT");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getEnumeratedTypeAccess().getRightSquareBracketKeyword_13_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumeratedType"


    // $ANTLR start "entryRuleReferenceType"
    // InternalMDML.g:1349:1: entryRuleReferenceType returns [EObject current=null] : iv_ruleReferenceType= ruleReferenceType EOF ;
    public final EObject entryRuleReferenceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceType = null;


        try {
            // InternalMDML.g:1349:54: (iv_ruleReferenceType= ruleReferenceType EOF )
            // InternalMDML.g:1350:2: iv_ruleReferenceType= ruleReferenceType EOF
            {
             newCompositeNode(grammarAccess.getReferenceTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceType=ruleReferenceType();

            state._fsp--;

             current =iv_ruleReferenceType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceType"


    // $ANTLR start "ruleReferenceType"
    // InternalMDML.g:1356:1: ruleReferenceType returns [EObject current=null] : (otherlv_0= 'reftype' otherlv_1= 'status:' ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'domainid:' ( (lv_guid_4_0= ruleGUID ) ) otherlv_5= '@' otherlv_6= '(' ruleVersion otherlv_8= ')' ( (lv_refines_9_0= ruleREFINE ) ) ( (lv_name_10_0= ruleQualifiedName ) ) otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) ) ;
    public final EObject ruleReferenceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_status_2_0 = null;

        AntlrDatatypeRuleToken lv_guid_4_0 = null;

        AntlrDatatypeRuleToken lv_refines_9_0 = null;

        AntlrDatatypeRuleToken lv_name_10_0 = null;



        	enterRule();

        try {
            // InternalMDML.g:1362:2: ( (otherlv_0= 'reftype' otherlv_1= 'status:' ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'domainid:' ( (lv_guid_4_0= ruleGUID ) ) otherlv_5= '@' otherlv_6= '(' ruleVersion otherlv_8= ')' ( (lv_refines_9_0= ruleREFINE ) ) ( (lv_name_10_0= ruleQualifiedName ) ) otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) ) )
            // InternalMDML.g:1363:2: (otherlv_0= 'reftype' otherlv_1= 'status:' ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'domainid:' ( (lv_guid_4_0= ruleGUID ) ) otherlv_5= '@' otherlv_6= '(' ruleVersion otherlv_8= ')' ( (lv_refines_9_0= ruleREFINE ) ) ( (lv_name_10_0= ruleQualifiedName ) ) otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) )
            {
            // InternalMDML.g:1363:2: (otherlv_0= 'reftype' otherlv_1= 'status:' ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'domainid:' ( (lv_guid_4_0= ruleGUID ) ) otherlv_5= '@' otherlv_6= '(' ruleVersion otherlv_8= ')' ( (lv_refines_9_0= ruleREFINE ) ) ( (lv_name_10_0= ruleQualifiedName ) ) otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) )
            // InternalMDML.g:1364:3: otherlv_0= 'reftype' otherlv_1= 'status:' ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'domainid:' ( (lv_guid_4_0= ruleGUID ) ) otherlv_5= '@' otherlv_6= '(' ruleVersion otherlv_8= ')' ( (lv_refines_9_0= ruleREFINE ) ) ( (lv_name_10_0= ruleQualifiedName ) ) otherlv_11= ':' ( (otherlv_12= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceTypeAccess().getReftypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getReferenceTypeAccess().getStatusKeyword_1());
            		
            // InternalMDML.g:1372:3: ( (lv_status_2_0= ruleStatus ) )
            // InternalMDML.g:1373:4: (lv_status_2_0= ruleStatus )
            {
            // InternalMDML.g:1373:4: (lv_status_2_0= ruleStatus )
            // InternalMDML.g:1374:5: lv_status_2_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getReferenceTypeAccess().getStatusStatusParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_status_2_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceTypeRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_2_0,
            						"uk.ac.ox.cs.MDML.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getReferenceTypeAccess().getDomainidKeyword_3());
            		
            // InternalMDML.g:1395:3: ( (lv_guid_4_0= ruleGUID ) )
            // InternalMDML.g:1396:4: (lv_guid_4_0= ruleGUID )
            {
            // InternalMDML.g:1396:4: (lv_guid_4_0= ruleGUID )
            // InternalMDML.g:1397:5: lv_guid_4_0= ruleGUID
            {

            					newCompositeNode(grammarAccess.getReferenceTypeAccess().getGuidGUIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_guid_4_0=ruleGUID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceTypeRule());
            					}
            					set(
            						current,
            						"guid",
            						lv_guid_4_0,
            						"uk.ac.ox.cs.MDML.GUID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getReferenceTypeAccess().getCommercialAtKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getReferenceTypeAccess().getLeftParenthesisKeyword_6());
            		

            			newCompositeNode(grammarAccess.getReferenceTypeAccess().getVersionParserRuleCall_7());
            		
            pushFollow(FOLLOW_11);
            ruleVersion();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_8=(Token)match(input,16,FOLLOW_28); 

            			newLeafNode(otherlv_8, grammarAccess.getReferenceTypeAccess().getRightParenthesisKeyword_8());
            		
            // InternalMDML.g:1433:3: ( (lv_refines_9_0= ruleREFINE ) )
            // InternalMDML.g:1434:4: (lv_refines_9_0= ruleREFINE )
            {
            // InternalMDML.g:1434:4: (lv_refines_9_0= ruleREFINE )
            // InternalMDML.g:1435:5: lv_refines_9_0= ruleREFINE
            {

            					newCompositeNode(grammarAccess.getReferenceTypeAccess().getRefinesREFINEParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_4);
            lv_refines_9_0=ruleREFINE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceTypeRule());
            					}
            					set(
            						current,
            						"refines",
            						lv_refines_9_0,
            						"uk.ac.ox.cs.MDML.REFINE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMDML.g:1452:3: ( (lv_name_10_0= ruleQualifiedName ) )
            // InternalMDML.g:1453:4: (lv_name_10_0= ruleQualifiedName )
            {
            // InternalMDML.g:1453:4: (lv_name_10_0= ruleQualifiedName )
            // InternalMDML.g:1454:5: lv_name_10_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getReferenceTypeAccess().getNameQualifiedNameParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_10_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_10_0,
            						"uk.ac.ox.cs.MDML.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getReferenceTypeAccess().getColonKeyword_11());
            		
            // InternalMDML.g:1475:3: ( (otherlv_12= RULE_ID ) )
            // InternalMDML.g:1476:4: (otherlv_12= RULE_ID )
            {
            // InternalMDML.g:1476:4: (otherlv_12= RULE_ID )
            // InternalMDML.g:1477:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceTypeRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_12, grammarAccess.getReferenceTypeAccess().getTypeDataClassCrossReference_12_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferenceType"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalMDML.g:1492:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalMDML.g:1492:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalMDML.g:1493:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalMDML.g:1499:1: rulePrimitiveType returns [EObject current=null] : ( () (otherlv_1= 'datatype' otherlv_2= 'status:' ( (lv_status_3_0= ruleStatus ) ) otherlv_4= 'domainid:' ( (lv_guid_5_0= ruleGUID ) ) otherlv_6= '@' otherlv_7= '(' ruleVersion otherlv_9= ')' ( (lv_refines_10_0= ruleREFINE ) ) ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= ':' ( (lv_type_13_0= ruleBasic ) ) ( (otherlv_14= RULE_ID ) )? ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_status_3_0 = null;

        AntlrDatatypeRuleToken lv_guid_5_0 = null;

        AntlrDatatypeRuleToken lv_refines_10_0 = null;

        AntlrDatatypeRuleToken lv_name_11_0 = null;

        EObject lv_type_13_0 = null;



        	enterRule();

        try {
            // InternalMDML.g:1505:2: ( ( () (otherlv_1= 'datatype' otherlv_2= 'status:' ( (lv_status_3_0= ruleStatus ) ) otherlv_4= 'domainid:' ( (lv_guid_5_0= ruleGUID ) ) otherlv_6= '@' otherlv_7= '(' ruleVersion otherlv_9= ')' ( (lv_refines_10_0= ruleREFINE ) ) ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= ':' ( (lv_type_13_0= ruleBasic ) ) ( (otherlv_14= RULE_ID ) )? ) ) )
            // InternalMDML.g:1506:2: ( () (otherlv_1= 'datatype' otherlv_2= 'status:' ( (lv_status_3_0= ruleStatus ) ) otherlv_4= 'domainid:' ( (lv_guid_5_0= ruleGUID ) ) otherlv_6= '@' otherlv_7= '(' ruleVersion otherlv_9= ')' ( (lv_refines_10_0= ruleREFINE ) ) ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= ':' ( (lv_type_13_0= ruleBasic ) ) ( (otherlv_14= RULE_ID ) )? ) )
            {
            // InternalMDML.g:1506:2: ( () (otherlv_1= 'datatype' otherlv_2= 'status:' ( (lv_status_3_0= ruleStatus ) ) otherlv_4= 'domainid:' ( (lv_guid_5_0= ruleGUID ) ) otherlv_6= '@' otherlv_7= '(' ruleVersion otherlv_9= ')' ( (lv_refines_10_0= ruleREFINE ) ) ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= ':' ( (lv_type_13_0= ruleBasic ) ) ( (otherlv_14= RULE_ID ) )? ) )
            // InternalMDML.g:1507:3: () (otherlv_1= 'datatype' otherlv_2= 'status:' ( (lv_status_3_0= ruleStatus ) ) otherlv_4= 'domainid:' ( (lv_guid_5_0= ruleGUID ) ) otherlv_6= '@' otherlv_7= '(' ruleVersion otherlv_9= ')' ( (lv_refines_10_0= ruleREFINE ) ) ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= ':' ( (lv_type_13_0= ruleBasic ) ) ( (otherlv_14= RULE_ID ) )? )
            {
            // InternalMDML.g:1507:3: ()
            // InternalMDML.g:1508:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypeAction_0(),
            					current);
            			

            }

            // InternalMDML.g:1514:3: (otherlv_1= 'datatype' otherlv_2= 'status:' ( (lv_status_3_0= ruleStatus ) ) otherlv_4= 'domainid:' ( (lv_guid_5_0= ruleGUID ) ) otherlv_6= '@' otherlv_7= '(' ruleVersion otherlv_9= ')' ( (lv_refines_10_0= ruleREFINE ) ) ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= ':' ( (lv_type_13_0= ruleBasic ) ) ( (otherlv_14= RULE_ID ) )? )
            // InternalMDML.g:1515:4: otherlv_1= 'datatype' otherlv_2= 'status:' ( (lv_status_3_0= ruleStatus ) ) otherlv_4= 'domainid:' ( (lv_guid_5_0= ruleGUID ) ) otherlv_6= '@' otherlv_7= '(' ruleVersion otherlv_9= ')' ( (lv_refines_10_0= ruleREFINE ) ) ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= ':' ( (lv_type_13_0= ruleBasic ) ) ( (otherlv_14= RULE_ID ) )?
            {
            otherlv_1=(Token)match(input,35,FOLLOW_5); 

            				newLeafNode(otherlv_1, grammarAccess.getPrimitiveTypeAccess().getDatatypeKeyword_1_0());
            			
            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getPrimitiveTypeAccess().getStatusKeyword_1_1());
            			
            // InternalMDML.g:1523:4: ( (lv_status_3_0= ruleStatus ) )
            // InternalMDML.g:1524:5: (lv_status_3_0= ruleStatus )
            {
            // InternalMDML.g:1524:5: (lv_status_3_0= ruleStatus )
            // InternalMDML.g:1525:6: lv_status_3_0= ruleStatus
            {

            						newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getStatusStatusParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_7);
            lv_status_3_0=ruleStatus();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
            						}
            						set(
            							current,
            							"status",
            							lv_status_3_0,
            							"uk.ac.ox.cs.MDML.Status");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            				newLeafNode(otherlv_4, grammarAccess.getPrimitiveTypeAccess().getDomainidKeyword_1_3());
            			
            // InternalMDML.g:1546:4: ( (lv_guid_5_0= ruleGUID ) )
            // InternalMDML.g:1547:5: (lv_guid_5_0= ruleGUID )
            {
            // InternalMDML.g:1547:5: (lv_guid_5_0= ruleGUID )
            // InternalMDML.g:1548:6: lv_guid_5_0= ruleGUID
            {

            						newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getGuidGUIDParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_8);
            lv_guid_5_0=ruleGUID();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
            						}
            						set(
            							current,
            							"guid",
            							lv_guid_5_0,
            							"uk.ac.ox.cs.MDML.GUID");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_9); 

            				newLeafNode(otherlv_6, grammarAccess.getPrimitiveTypeAccess().getCommercialAtKeyword_1_5());
            			
            otherlv_7=(Token)match(input,15,FOLLOW_10); 

            				newLeafNode(otherlv_7, grammarAccess.getPrimitiveTypeAccess().getLeftParenthesisKeyword_1_6());
            			

            				newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getVersionParserRuleCall_1_7());
            			
            pushFollow(FOLLOW_11);
            ruleVersion();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			
            otherlv_9=(Token)match(input,16,FOLLOW_28); 

            				newLeafNode(otherlv_9, grammarAccess.getPrimitiveTypeAccess().getRightParenthesisKeyword_1_8());
            			
            // InternalMDML.g:1584:4: ( (lv_refines_10_0= ruleREFINE ) )
            // InternalMDML.g:1585:5: (lv_refines_10_0= ruleREFINE )
            {
            // InternalMDML.g:1585:5: (lv_refines_10_0= ruleREFINE )
            // InternalMDML.g:1586:6: lv_refines_10_0= ruleREFINE
            {

            						newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getRefinesREFINEParserRuleCall_1_9_0());
            					
            pushFollow(FOLLOW_4);
            lv_refines_10_0=ruleREFINE();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
            						}
            						set(
            							current,
            							"refines",
            							lv_refines_10_0,
            							"uk.ac.ox.cs.MDML.REFINE");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalMDML.g:1603:4: ( (lv_name_11_0= ruleQualifiedName ) )
            // InternalMDML.g:1604:5: (lv_name_11_0= ruleQualifiedName )
            {
            // InternalMDML.g:1604:5: (lv_name_11_0= ruleQualifiedName )
            // InternalMDML.g:1605:6: lv_name_11_0= ruleQualifiedName
            {

            						newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getNameQualifiedNameParserRuleCall_1_10_0());
            					
            pushFollow(FOLLOW_18);
            lv_name_11_0=ruleQualifiedName();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_11_0,
            							"uk.ac.ox.cs.MDML.QualifiedName");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_12=(Token)match(input,20,FOLLOW_33); 

            				newLeafNode(otherlv_12, grammarAccess.getPrimitiveTypeAccess().getColonKeyword_1_11());
            			
            // InternalMDML.g:1626:4: ( (lv_type_13_0= ruleBasic ) )
            // InternalMDML.g:1627:5: (lv_type_13_0= ruleBasic )
            {
            // InternalMDML.g:1627:5: (lv_type_13_0= ruleBasic )
            // InternalMDML.g:1628:6: lv_type_13_0= ruleBasic
            {

            						newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getTypeBasicParserRuleCall_1_12_0());
            					
            pushFollow(FOLLOW_34);
            lv_type_13_0=ruleBasic();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
            						}
            						set(
            							current,
            							"type",
            							lv_type_13_0,
            							"uk.ac.ox.cs.MDML.Basic");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalMDML.g:1645:4: ( (otherlv_14= RULE_ID ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMDML.g:1646:5: (otherlv_14= RULE_ID )
                    {
                    // InternalMDML.g:1646:5: (otherlv_14= RULE_ID )
                    // InternalMDML.g:1647:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_14, grammarAccess.getPrimitiveTypeAccess().getRuleConstraintCrossReference_1_13_0());
                    					

                    }


                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleBasic"
    // InternalMDML.g:1663:1: entryRuleBasic returns [EObject current=null] : iv_ruleBasic= ruleBasic EOF ;
    public final EObject entryRuleBasic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasic = null;


        try {
            // InternalMDML.g:1663:46: (iv_ruleBasic= ruleBasic EOF )
            // InternalMDML.g:1664:2: iv_ruleBasic= ruleBasic EOF
            {
             newCompositeNode(grammarAccess.getBasicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasic=ruleBasic();

            state._fsp--;

             current =iv_ruleBasic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasic"


    // $ANTLR start "ruleBasic"
    // InternalMDML.g:1670:1: ruleBasic returns [EObject current=null] : ( ( (lv_typename_0_1= 'STRING' | lv_typename_0_2= 'INT' | lv_typename_0_3= 'BOOLEAN' ) ) ) ;
    public final EObject ruleBasic() throws RecognitionException {
        EObject current = null;

        Token lv_typename_0_1=null;
        Token lv_typename_0_2=null;
        Token lv_typename_0_3=null;


        	enterRule();

        try {
            // InternalMDML.g:1676:2: ( ( ( (lv_typename_0_1= 'STRING' | lv_typename_0_2= 'INT' | lv_typename_0_3= 'BOOLEAN' ) ) ) )
            // InternalMDML.g:1677:2: ( ( (lv_typename_0_1= 'STRING' | lv_typename_0_2= 'INT' | lv_typename_0_3= 'BOOLEAN' ) ) )
            {
            // InternalMDML.g:1677:2: ( ( (lv_typename_0_1= 'STRING' | lv_typename_0_2= 'INT' | lv_typename_0_3= 'BOOLEAN' ) ) )
            // InternalMDML.g:1678:3: ( (lv_typename_0_1= 'STRING' | lv_typename_0_2= 'INT' | lv_typename_0_3= 'BOOLEAN' ) )
            {
            // InternalMDML.g:1678:3: ( (lv_typename_0_1= 'STRING' | lv_typename_0_2= 'INT' | lv_typename_0_3= 'BOOLEAN' ) )
            // InternalMDML.g:1679:4: (lv_typename_0_1= 'STRING' | lv_typename_0_2= 'INT' | lv_typename_0_3= 'BOOLEAN' )
            {
            // InternalMDML.g:1679:4: (lv_typename_0_1= 'STRING' | lv_typename_0_2= 'INT' | lv_typename_0_3= 'BOOLEAN' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt18=1;
                }
                break;
            case 37:
                {
                alt18=2;
                }
                break;
            case 38:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMDML.g:1680:5: lv_typename_0_1= 'STRING'
                    {
                    lv_typename_0_1=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_typename_0_1, grammarAccess.getBasicAccess().getTypenameSTRINGKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicRule());
                    					}
                    					setWithLastConsumed(current, "typename", lv_typename_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMDML.g:1691:5: lv_typename_0_2= 'INT'
                    {
                    lv_typename_0_2=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_typename_0_2, grammarAccess.getBasicAccess().getTypenameINTKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicRule());
                    					}
                    					setWithLastConsumed(current, "typename", lv_typename_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMDML.g:1702:5: lv_typename_0_3= 'BOOLEAN'
                    {
                    lv_typename_0_3=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_typename_0_3, grammarAccess.getBasicAccess().getTypenameBOOLEANKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicRule());
                    					}
                    					setWithLastConsumed(current, "typename", lv_typename_0_3, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasic"


    // $ANTLR start "entryRuleContainerElement"
    // InternalMDML.g:1718:1: entryRuleContainerElement returns [EObject current=null] : iv_ruleContainerElement= ruleContainerElement EOF ;
    public final EObject entryRuleContainerElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerElement = null;


        try {
            // InternalMDML.g:1718:57: (iv_ruleContainerElement= ruleContainerElement EOF )
            // InternalMDML.g:1719:2: iv_ruleContainerElement= ruleContainerElement EOF
            {
             newCompositeNode(grammarAccess.getContainerElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainerElement=ruleContainerElement();

            state._fsp--;

             current =iv_ruleContainerElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainerElement"


    // $ANTLR start "ruleContainerElement"
    // InternalMDML.g:1725:1: ruleContainerElement returns [EObject current=null] : (this_DataClass_0= ruleDataClass | this_DataElement_1= ruleDataElement | this_Reference_2= ruleReference ) ;
    public final EObject ruleContainerElement() throws RecognitionException {
        EObject current = null;

        EObject this_DataClass_0 = null;

        EObject this_DataElement_1 = null;

        EObject this_Reference_2 = null;



        	enterRule();

        try {
            // InternalMDML.g:1731:2: ( (this_DataClass_0= ruleDataClass | this_DataElement_1= ruleDataElement | this_Reference_2= ruleReference ) )
            // InternalMDML.g:1732:2: (this_DataClass_0= ruleDataClass | this_DataElement_1= ruleDataElement | this_Reference_2= ruleReference )
            {
            // InternalMDML.g:1732:2: (this_DataClass_0= ruleDataClass | this_DataElement_1= ruleDataElement | this_Reference_2= ruleReference )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt19=1;
                }
                break;
            case 40:
                {
                alt19=2;
                }
                break;
            case 24:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMDML.g:1733:3: this_DataClass_0= ruleDataClass
                    {

                    			newCompositeNode(grammarAccess.getContainerElementAccess().getDataClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataClass_0=ruleDataClass();

                    state._fsp--;


                    			current = this_DataClass_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMDML.g:1742:3: this_DataElement_1= ruleDataElement
                    {

                    			newCompositeNode(grammarAccess.getContainerElementAccess().getDataElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataElement_1=ruleDataElement();

                    state._fsp--;


                    			current = this_DataElement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMDML.g:1751:3: this_Reference_2= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getContainerElementAccess().getReferenceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_2=ruleReference();

                    state._fsp--;


                    			current = this_Reference_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainerElement"


    // $ANTLR start "entryRuleDataClass"
    // InternalMDML.g:1763:1: entryRuleDataClass returns [EObject current=null] : iv_ruleDataClass= ruleDataClass EOF ;
    public final EObject entryRuleDataClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataClass = null;


        try {
            // InternalMDML.g:1763:50: (iv_ruleDataClass= ruleDataClass EOF )
            // InternalMDML.g:1764:2: iv_ruleDataClass= ruleDataClass EOF
            {
             newCompositeNode(grammarAccess.getDataClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataClass=ruleDataClass();

            state._fsp--;

             current =iv_ruleDataClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataClass"


    // $ANTLR start "ruleDataClass"
    // InternalMDML.g:1770:1: ruleDataClass returns [EObject current=null] : (otherlv_0= 'DataClass' otherlv_1= 'status:' ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'domainid:' ( (lv_guid_4_0= ruleGUID ) ) otherlv_5= '@' otherlv_6= '(' ruleVersion otherlv_8= ')' ( (lv_refines_9_0= ruleREFINE ) ) ( (lv_name_10_0= ruleQualifiedName ) ) otherlv_11= '{' ( (lv_dataelements_12_0= ruleContainerElement ) )* ( (lv_extension_13_0= ruleExtensionItem ) )* otherlv_14= '}' ) ;
    public final EObject ruleDataClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_status_2_0 = null;

        AntlrDatatypeRuleToken lv_guid_4_0 = null;

        AntlrDatatypeRuleToken lv_refines_9_0 = null;

        AntlrDatatypeRuleToken lv_name_10_0 = null;

        EObject lv_dataelements_12_0 = null;

        EObject lv_extension_13_0 = null;



        	enterRule();

        try {
            // InternalMDML.g:1776:2: ( (otherlv_0= 'DataClass' otherlv_1= 'status:' ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'domainid:' ( (lv_guid_4_0= ruleGUID ) ) otherlv_5= '@' otherlv_6= '(' ruleVersion otherlv_8= ')' ( (lv_refines_9_0= ruleREFINE ) ) ( (lv_name_10_0= ruleQualifiedName ) ) otherlv_11= '{' ( (lv_dataelements_12_0= ruleContainerElement ) )* ( (lv_extension_13_0= ruleExtensionItem ) )* otherlv_14= '}' ) )
            // InternalMDML.g:1777:2: (otherlv_0= 'DataClass' otherlv_1= 'status:' ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'domainid:' ( (lv_guid_4_0= ruleGUID ) ) otherlv_5= '@' otherlv_6= '(' ruleVersion otherlv_8= ')' ( (lv_refines_9_0= ruleREFINE ) ) ( (lv_name_10_0= ruleQualifiedName ) ) otherlv_11= '{' ( (lv_dataelements_12_0= ruleContainerElement ) )* ( (lv_extension_13_0= ruleExtensionItem ) )* otherlv_14= '}' )
            {
            // InternalMDML.g:1777:2: (otherlv_0= 'DataClass' otherlv_1= 'status:' ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'domainid:' ( (lv_guid_4_0= ruleGUID ) ) otherlv_5= '@' otherlv_6= '(' ruleVersion otherlv_8= ')' ( (lv_refines_9_0= ruleREFINE ) ) ( (lv_name_10_0= ruleQualifiedName ) ) otherlv_11= '{' ( (lv_dataelements_12_0= ruleContainerElement ) )* ( (lv_extension_13_0= ruleExtensionItem ) )* otherlv_14= '}' )
            // InternalMDML.g:1778:3: otherlv_0= 'DataClass' otherlv_1= 'status:' ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'domainid:' ( (lv_guid_4_0= ruleGUID ) ) otherlv_5= '@' otherlv_6= '(' ruleVersion otherlv_8= ')' ( (lv_refines_9_0= ruleREFINE ) ) ( (lv_name_10_0= ruleQualifiedName ) ) otherlv_11= '{' ( (lv_dataelements_12_0= ruleContainerElement ) )* ( (lv_extension_13_0= ruleExtensionItem ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataClassAccess().getDataClassKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDataClassAccess().getStatusKeyword_1());
            		
            // InternalMDML.g:1786:3: ( (lv_status_2_0= ruleStatus ) )
            // InternalMDML.g:1787:4: (lv_status_2_0= ruleStatus )
            {
            // InternalMDML.g:1787:4: (lv_status_2_0= ruleStatus )
            // InternalMDML.g:1788:5: lv_status_2_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getDataClassAccess().getStatusStatusParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_status_2_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataClassRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_2_0,
            						"uk.ac.ox.cs.MDML.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getDataClassAccess().getDomainidKeyword_3());
            		
            // InternalMDML.g:1809:3: ( (lv_guid_4_0= ruleGUID ) )
            // InternalMDML.g:1810:4: (lv_guid_4_0= ruleGUID )
            {
            // InternalMDML.g:1810:4: (lv_guid_4_0= ruleGUID )
            // InternalMDML.g:1811:5: lv_guid_4_0= ruleGUID
            {

            					newCompositeNode(grammarAccess.getDataClassAccess().getGuidGUIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_guid_4_0=ruleGUID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataClassRule());
            					}
            					set(
            						current,
            						"guid",
            						lv_guid_4_0,
            						"uk.ac.ox.cs.MDML.GUID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getDataClassAccess().getCommercialAtKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getDataClassAccess().getLeftParenthesisKeyword_6());
            		

            			newCompositeNode(grammarAccess.getDataClassAccess().getVersionParserRuleCall_7());
            		
            pushFollow(FOLLOW_11);
            ruleVersion();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_8=(Token)match(input,16,FOLLOW_28); 

            			newLeafNode(otherlv_8, grammarAccess.getDataClassAccess().getRightParenthesisKeyword_8());
            		
            // InternalMDML.g:1847:3: ( (lv_refines_9_0= ruleREFINE ) )
            // InternalMDML.g:1848:4: (lv_refines_9_0= ruleREFINE )
            {
            // InternalMDML.g:1848:4: (lv_refines_9_0= ruleREFINE )
            // InternalMDML.g:1849:5: lv_refines_9_0= ruleREFINE
            {

            					newCompositeNode(grammarAccess.getDataClassAccess().getRefinesREFINEParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_4);
            lv_refines_9_0=ruleREFINE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataClassRule());
            					}
            					set(
            						current,
            						"refines",
            						lv_refines_9_0,
            						"uk.ac.ox.cs.MDML.REFINE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMDML.g:1866:3: ( (lv_name_10_0= ruleQualifiedName ) )
            // InternalMDML.g:1867:4: (lv_name_10_0= ruleQualifiedName )
            {
            // InternalMDML.g:1867:4: (lv_name_10_0= ruleQualifiedName )
            // InternalMDML.g:1868:5: lv_name_10_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getDataClassAccess().getNameQualifiedNameParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_10_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_10_0,
            						"uk.ac.ox.cs.MDML.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_35); 

            			newLeafNode(otherlv_11, grammarAccess.getDataClassAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalMDML.g:1889:3: ( (lv_dataelements_12_0= ruleContainerElement ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==24||(LA20_0>=39 && LA20_0<=40)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMDML.g:1890:4: (lv_dataelements_12_0= ruleContainerElement )
            	    {
            	    // InternalMDML.g:1890:4: (lv_dataelements_12_0= ruleContainerElement )
            	    // InternalMDML.g:1891:5: lv_dataelements_12_0= ruleContainerElement
            	    {

            	    					newCompositeNode(grammarAccess.getDataClassAccess().getDataelementsContainerElementParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_dataelements_12_0=ruleContainerElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dataelements",
            	    						lv_dataelements_12_0,
            	    						"uk.ac.ox.cs.MDML.ContainerElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalMDML.g:1908:3: ( (lv_extension_13_0= ruleExtensionItem ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==26) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMDML.g:1909:4: (lv_extension_13_0= ruleExtensionItem )
            	    {
            	    // InternalMDML.g:1909:4: (lv_extension_13_0= ruleExtensionItem )
            	    // InternalMDML.g:1910:5: lv_extension_13_0= ruleExtensionItem
            	    {

            	    					newCompositeNode(grammarAccess.getDataClassAccess().getExtensionExtensionItemParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_36);
            	    lv_extension_13_0=ruleExtensionItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extension",
            	    						lv_extension_13_0,
            	    						"uk.ac.ox.cs.MDML.ExtensionItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_14=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getDataClassAccess().getRightCurlyBracketKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataClass"


    // $ANTLR start "entryRuleDataElement"
    // InternalMDML.g:1935:1: entryRuleDataElement returns [EObject current=null] : iv_ruleDataElement= ruleDataElement EOF ;
    public final EObject entryRuleDataElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataElement = null;


        try {
            // InternalMDML.g:1935:52: (iv_ruleDataElement= ruleDataElement EOF )
            // InternalMDML.g:1936:2: iv_ruleDataElement= ruleDataElement EOF
            {
             newCompositeNode(grammarAccess.getDataElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataElement=ruleDataElement();

            state._fsp--;

             current =iv_ruleDataElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataElement"


    // $ANTLR start "ruleDataElement"
    // InternalMDML.g:1942:1: ruleDataElement returns [EObject current=null] : (otherlv_0= 'DataElement' otherlv_1= 'status:' ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'domainid:' ( (lv_guid_4_0= ruleGUID ) ) otherlv_5= '@' otherlv_6= '(' ruleVersion otherlv_8= ')' ( (lv_refines_9_0= ruleREFINE ) ) ( (lv_name_10_0= ruleQualifiedName ) ) otherlv_11= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleDataElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_status_2_0 = null;

        AntlrDatatypeRuleToken lv_guid_4_0 = null;

        AntlrDatatypeRuleToken lv_refines_9_0 = null;

        AntlrDatatypeRuleToken lv_name_10_0 = null;



        	enterRule();

        try {
            // InternalMDML.g:1948:2: ( (otherlv_0= 'DataElement' otherlv_1= 'status:' ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'domainid:' ( (lv_guid_4_0= ruleGUID ) ) otherlv_5= '@' otherlv_6= '(' ruleVersion otherlv_8= ')' ( (lv_refines_9_0= ruleREFINE ) ) ( (lv_name_10_0= ruleQualifiedName ) ) otherlv_11= ':' ( ( ruleQualifiedName ) ) ) )
            // InternalMDML.g:1949:2: (otherlv_0= 'DataElement' otherlv_1= 'status:' ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'domainid:' ( (lv_guid_4_0= ruleGUID ) ) otherlv_5= '@' otherlv_6= '(' ruleVersion otherlv_8= ')' ( (lv_refines_9_0= ruleREFINE ) ) ( (lv_name_10_0= ruleQualifiedName ) ) otherlv_11= ':' ( ( ruleQualifiedName ) ) )
            {
            // InternalMDML.g:1949:2: (otherlv_0= 'DataElement' otherlv_1= 'status:' ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'domainid:' ( (lv_guid_4_0= ruleGUID ) ) otherlv_5= '@' otherlv_6= '(' ruleVersion otherlv_8= ')' ( (lv_refines_9_0= ruleREFINE ) ) ( (lv_name_10_0= ruleQualifiedName ) ) otherlv_11= ':' ( ( ruleQualifiedName ) ) )
            // InternalMDML.g:1950:3: otherlv_0= 'DataElement' otherlv_1= 'status:' ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'domainid:' ( (lv_guid_4_0= ruleGUID ) ) otherlv_5= '@' otherlv_6= '(' ruleVersion otherlv_8= ')' ( (lv_refines_9_0= ruleREFINE ) ) ( (lv_name_10_0= ruleQualifiedName ) ) otherlv_11= ':' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataElementAccess().getDataElementKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDataElementAccess().getStatusKeyword_1());
            		
            // InternalMDML.g:1958:3: ( (lv_status_2_0= ruleStatus ) )
            // InternalMDML.g:1959:4: (lv_status_2_0= ruleStatus )
            {
            // InternalMDML.g:1959:4: (lv_status_2_0= ruleStatus )
            // InternalMDML.g:1960:5: lv_status_2_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getDataElementAccess().getStatusStatusParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_status_2_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataElementRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_2_0,
            						"uk.ac.ox.cs.MDML.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getDataElementAccess().getDomainidKeyword_3());
            		
            // InternalMDML.g:1981:3: ( (lv_guid_4_0= ruleGUID ) )
            // InternalMDML.g:1982:4: (lv_guid_4_0= ruleGUID )
            {
            // InternalMDML.g:1982:4: (lv_guid_4_0= ruleGUID )
            // InternalMDML.g:1983:5: lv_guid_4_0= ruleGUID
            {

            					newCompositeNode(grammarAccess.getDataElementAccess().getGuidGUIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_guid_4_0=ruleGUID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataElementRule());
            					}
            					set(
            						current,
            						"guid",
            						lv_guid_4_0,
            						"uk.ac.ox.cs.MDML.GUID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getDataElementAccess().getCommercialAtKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getDataElementAccess().getLeftParenthesisKeyword_6());
            		

            			newCompositeNode(grammarAccess.getDataElementAccess().getVersionParserRuleCall_7());
            		
            pushFollow(FOLLOW_11);
            ruleVersion();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_8=(Token)match(input,16,FOLLOW_28); 

            			newLeafNode(otherlv_8, grammarAccess.getDataElementAccess().getRightParenthesisKeyword_8());
            		
            // InternalMDML.g:2019:3: ( (lv_refines_9_0= ruleREFINE ) )
            // InternalMDML.g:2020:4: (lv_refines_9_0= ruleREFINE )
            {
            // InternalMDML.g:2020:4: (lv_refines_9_0= ruleREFINE )
            // InternalMDML.g:2021:5: lv_refines_9_0= ruleREFINE
            {

            					newCompositeNode(grammarAccess.getDataElementAccess().getRefinesREFINEParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_4);
            lv_refines_9_0=ruleREFINE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataElementRule());
            					}
            					set(
            						current,
            						"refines",
            						lv_refines_9_0,
            						"uk.ac.ox.cs.MDML.REFINE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMDML.g:2038:3: ( (lv_name_10_0= ruleQualifiedName ) )
            // InternalMDML.g:2039:4: (lv_name_10_0= ruleQualifiedName )
            {
            // InternalMDML.g:2039:4: (lv_name_10_0= ruleQualifiedName )
            // InternalMDML.g:2040:5: lv_name_10_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getDataElementAccess().getNameQualifiedNameParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_10_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataElementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_10_0,
            						"uk.ac.ox.cs.MDML.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getDataElementAccess().getColonKeyword_11());
            		
            // InternalMDML.g:2061:3: ( ( ruleQualifiedName ) )
            // InternalMDML.g:2062:4: ( ruleQualifiedName )
            {
            // InternalMDML.g:2062:4: ( ruleQualifiedName )
            // InternalMDML.g:2063:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataElementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDataElementAccess().getTypeDataTypeCrossReference_12_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataElement"


    // $ANTLR start "entryRuleStatus"
    // InternalMDML.g:2081:1: entryRuleStatus returns [String current=null] : iv_ruleStatus= ruleStatus EOF ;
    public final String entryRuleStatus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatus = null;


        try {
            // InternalMDML.g:2081:46: (iv_ruleStatus= ruleStatus EOF )
            // InternalMDML.g:2082:2: iv_ruleStatus= ruleStatus EOF
            {
             newCompositeNode(grammarAccess.getStatusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatus=ruleStatus();

            state._fsp--;

             current =iv_ruleStatus.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatus"


    // $ANTLR start "ruleStatus"
    // InternalMDML.g:2088:1: ruleStatus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'draft' | kw= 'finalized' | kw= 'superceded' ) ;
    public final AntlrDatatypeRuleToken ruleStatus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMDML.g:2094:2: ( (kw= 'draft' | kw= 'finalized' | kw= 'superceded' ) )
            // InternalMDML.g:2095:2: (kw= 'draft' | kw= 'finalized' | kw= 'superceded' )
            {
            // InternalMDML.g:2095:2: (kw= 'draft' | kw= 'finalized' | kw= 'superceded' )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt22=1;
                }
                break;
            case 42:
                {
                alt22=2;
                }
                break;
            case 43:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalMDML.g:2096:3: kw= 'draft'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStatusAccess().getDraftKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMDML.g:2102:3: kw= 'finalized'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStatusAccess().getFinalizedKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMDML.g:2108:3: kw= 'superceded'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStatusAccess().getSupercededKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatus"


    // $ANTLR start "entryRuleConstraint"
    // InternalMDML.g:2117:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalMDML.g:2117:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalMDML.g:2118:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalMDML.g:2124:1: ruleConstraint returns [EObject current=null] : ( () otherlv_1= 'constraint' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( ( (lv_src_4_0= ruleDataElement ) ) otherlv_5= ':' )? ( (otherlv_6= RULE_ID ) ) (otherlv_7= ':' ( (lv_dest_8_0= ruleDataElement ) ) )? ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_src_4_0 = null;

        EObject lv_dest_8_0 = null;



        	enterRule();

        try {
            // InternalMDML.g:2130:2: ( ( () otherlv_1= 'constraint' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( ( (lv_src_4_0= ruleDataElement ) ) otherlv_5= ':' )? ( (otherlv_6= RULE_ID ) ) (otherlv_7= ':' ( (lv_dest_8_0= ruleDataElement ) ) )? ) ) )
            // InternalMDML.g:2131:2: ( () otherlv_1= 'constraint' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( ( (lv_src_4_0= ruleDataElement ) ) otherlv_5= ':' )? ( (otherlv_6= RULE_ID ) ) (otherlv_7= ':' ( (lv_dest_8_0= ruleDataElement ) ) )? ) )
            {
            // InternalMDML.g:2131:2: ( () otherlv_1= 'constraint' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( ( (lv_src_4_0= ruleDataElement ) ) otherlv_5= ':' )? ( (otherlv_6= RULE_ID ) ) (otherlv_7= ':' ( (lv_dest_8_0= ruleDataElement ) ) )? ) )
            // InternalMDML.g:2132:3: () otherlv_1= 'constraint' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( ( (lv_src_4_0= ruleDataElement ) ) otherlv_5= ':' )? ( (otherlv_6= RULE_ID ) ) (otherlv_7= ':' ( (lv_dest_8_0= ruleDataElement ) ) )? )
            {
            // InternalMDML.g:2132:3: ()
            // InternalMDML.g:2133:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstraintAccess().getConstraintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getConstraintKeyword_1());
            		
            // InternalMDML.g:2143:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalMDML.g:2144:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalMDML.g:2144:4: (lv_name_2_0= ruleQualifiedName )
            // InternalMDML.g:2145:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uk.ac.ox.cs.MDML.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getEqualsSignKeyword_3());
            		
            // InternalMDML.g:2166:3: ( ( ( (lv_src_4_0= ruleDataElement ) ) otherlv_5= ':' )? ( (otherlv_6= RULE_ID ) ) (otherlv_7= ':' ( (lv_dest_8_0= ruleDataElement ) ) )? )
            // InternalMDML.g:2167:4: ( ( (lv_src_4_0= ruleDataElement ) ) otherlv_5= ':' )? ( (otherlv_6= RULE_ID ) ) (otherlv_7= ':' ( (lv_dest_8_0= ruleDataElement ) ) )?
            {
            // InternalMDML.g:2167:4: ( ( (lv_src_4_0= ruleDataElement ) ) otherlv_5= ':' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMDML.g:2168:5: ( (lv_src_4_0= ruleDataElement ) ) otherlv_5= ':'
                    {
                    // InternalMDML.g:2168:5: ( (lv_src_4_0= ruleDataElement ) )
                    // InternalMDML.g:2169:6: (lv_src_4_0= ruleDataElement )
                    {
                    // InternalMDML.g:2169:6: (lv_src_4_0= ruleDataElement )
                    // InternalMDML.g:2170:7: lv_src_4_0= ruleDataElement
                    {

                    							newCompositeNode(grammarAccess.getConstraintAccess().getSrcDataElementParserRuleCall_4_0_0_0());
                    						
                    pushFollow(FOLLOW_18);
                    lv_src_4_0=ruleDataElement();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getConstraintRule());
                    							}
                    							set(
                    								current,
                    								"src",
                    								lv_src_4_0,
                    								"uk.ac.ox.cs.MDML.DataElement");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_4); 

                    					newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getColonKeyword_4_0_1());
                    				

                    }
                    break;

            }

            // InternalMDML.g:2192:4: ( (otherlv_6= RULE_ID ) )
            // InternalMDML.g:2193:5: (otherlv_6= RULE_ID )
            {
            // InternalMDML.g:2193:5: (otherlv_6= RULE_ID )
            // InternalMDML.g:2194:6: otherlv_6= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getConstraintRule());
            						}
            					
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_38); 

            						newLeafNode(otherlv_6, grammarAccess.getConstraintAccess().getPredPredicateCrossReference_4_1_0());
            					

            }


            }

            // InternalMDML.g:2205:4: (otherlv_7= ':' ( (lv_dest_8_0= ruleDataElement ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMDML.g:2206:5: otherlv_7= ':' ( (lv_dest_8_0= ruleDataElement ) )
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_39); 

                    					newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getColonKeyword_4_2_0());
                    				
                    // InternalMDML.g:2210:5: ( (lv_dest_8_0= ruleDataElement ) )
                    // InternalMDML.g:2211:6: (lv_dest_8_0= ruleDataElement )
                    {
                    // InternalMDML.g:2211:6: (lv_dest_8_0= ruleDataElement )
                    // InternalMDML.g:2212:7: lv_dest_8_0= ruleDataElement
                    {

                    							newCompositeNode(grammarAccess.getConstraintAccess().getDestDataElementParserRuleCall_4_2_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_dest_8_0=ruleDataElement();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getConstraintRule());
                    							}
                    							set(
                    								current,
                    								"dest",
                    								lv_dest_8_0,
                    								"uk.ac.ox.cs.MDML.DataElement");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRulePredicate"
    // InternalMDML.g:2235:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalMDML.g:2235:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalMDML.g:2236:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalMDML.g:2242:1: rulePredicate returns [EObject current=null] : (otherlv_0= 'predicate' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (lv_predicate_3_0= RULE_STRING ) ) ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_predicate_3_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMDML.g:2248:2: ( (otherlv_0= 'predicate' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (lv_predicate_3_0= RULE_STRING ) ) ) )
            // InternalMDML.g:2249:2: (otherlv_0= 'predicate' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (lv_predicate_3_0= RULE_STRING ) ) )
            {
            // InternalMDML.g:2249:2: (otherlv_0= 'predicate' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (lv_predicate_3_0= RULE_STRING ) ) )
            // InternalMDML.g:2250:3: otherlv_0= 'predicate' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (lv_predicate_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPredicateAccess().getPredicateKeyword_0());
            		
            // InternalMDML.g:2254:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalMDML.g:2255:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalMDML.g:2255:4: (lv_name_1_0= ruleQualifiedName )
            // InternalMDML.g:2256:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPredicateAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredicateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uk.ac.ox.cs.MDML.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getPredicateAccess().getColonKeyword_2());
            		
            // InternalMDML.g:2277:3: ( (lv_predicate_3_0= RULE_STRING ) )
            // InternalMDML.g:2278:4: (lv_predicate_3_0= RULE_STRING )
            {
            // InternalMDML.g:2278:4: (lv_predicate_3_0= RULE_STRING )
            // InternalMDML.g:2279:5: lv_predicate_3_0= RULE_STRING
            {
            lv_predicate_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_predicate_3_0, grammarAccess.getPredicateAccess().getPredicateSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPredicateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"predicate",
            						lv_predicate_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicate"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000002A0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000318CA6040800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000300002040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000300000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000200000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000018C80000800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000280010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000018CA5040800L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000018CA4040800L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});

}