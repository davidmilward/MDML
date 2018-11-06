/*
 * generated by Xtext 2.12.0
 */
package uk.ac.ox.cs.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import uk.ac.ox.cs.ide.contentassist.antlr.internal.InternalMDMLParser;
import uk.ac.ox.cs.services.MDMLGrammarAccess;

public class MDMLParser extends AbstractContentAssistParser {

	@Inject
	private MDMLGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMDMLParser createParser() {
		InternalMDMLParser result = new InternalMDMLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDataItemAccess().getDataitemAlternatives_0(), "rule__DataItem__DataitemAlternatives_0");
					put(grammarAccess.getREFINEAccess().getAlternatives(), "rule__REFINE__Alternatives");
					put(grammarAccess.getGUIDAccess().getAlternatives_1(), "rule__GUID__Alternatives_1");
					put(grammarAccess.getRelationSourceAccess().getAlternatives(), "rule__RelationSource__Alternatives");
					put(grammarAccess.getRelationDestinationAccess().getAlternatives(), "rule__RelationDestination__Alternatives");
					put(grammarAccess.getDataTypeAccess().getAlternatives(), "rule__DataType__Alternatives");
					put(grammarAccess.getBasicAccess().getTypenameAlternatives_0(), "rule__Basic__TypenameAlternatives_0");
					put(grammarAccess.getBOOLEANAccess().getAlternatives(), "rule__BOOLEAN__Alternatives");
					put(grammarAccess.getContainerElementAccess().getAlternatives(), "rule__ContainerElement__Alternatives");
					put(grammarAccess.getStatusAccess().getAlternatives(), "rule__Status__Alternatives");
					put(grammarAccess.getDataModelAccess().getGroup(), "rule__DataModel__Group__0");
					put(grammarAccess.getREFINESAccess().getGroup(), "rule__REFINES__Group__0");
					put(grammarAccess.getDOESNOTREFINEAccess().getGroup(), "rule__DOESNOTREFINE__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getPathAccess().getGroup(), "rule__Path__Group__0");
					put(grammarAccess.getPathAccess().getGroup_1(), "rule__Path__Group_1__0");
					put(grammarAccess.getGUIDAccess().getGroup(), "rule__GUID__Group__0");
					put(grammarAccess.getGUIDAccess().getGroup_1_0(), "rule__GUID__Group_1_0__0");
					put(grammarAccess.getGUIDAccess().getGroup_1_1(), "rule__GUID__Group_1_1__0");
					put(grammarAccess.getVersionAccess().getGroup(), "rule__Version__Group__0");
					put(grammarAccess.getReferenceAccess().getGroup(), "rule__Reference__Group__0");
					put(grammarAccess.getRelationshipAccess().getGroup(), "rule__Relationship__Group__0");
					put(grammarAccess.getRelationshipAccess().getGroup_1(), "rule__Relationship__Group_1__0");
					put(grammarAccess.getExtensionItemAccess().getGroup(), "rule__ExtensionItem__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getEnumeratedTypeAccess().getGroup(), "rule__EnumeratedType__Group__0");
					put(grammarAccess.getEnumeratedTypeAccess().getGroup_13(), "rule__EnumeratedType__Group_13__0");
					put(grammarAccess.getReferenceTypeAccess().getGroup(), "rule__ReferenceType__Group__0");
					put(grammarAccess.getPrimitiveTypeAccess().getGroup(), "rule__PrimitiveType__Group__0");
					put(grammarAccess.getPrimitiveTypeAccess().getGroup_1(), "rule__PrimitiveType__Group_1__0");
					put(grammarAccess.getDataClassAccess().getGroup(), "rule__DataClass__Group__0");
					put(grammarAccess.getDataElementAccess().getGroup(), "rule__DataElement__Group__0");
					put(grammarAccess.getConstraintAccess().getGroup(), "rule__Constraint__Group__0");
					put(grammarAccess.getConstraintAccess().getGroup_4(), "rule__Constraint__Group_4__0");
					put(grammarAccess.getConstraintAccess().getGroup_4_0(), "rule__Constraint__Group_4_0__0");
					put(grammarAccess.getConstraintAccess().getGroup_4_2(), "rule__Constraint__Group_4_2__0");
					put(grammarAccess.getPredicateAccess().getGroup(), "rule__Predicate__Group__0");
					put(grammarAccess.getDomainRegistryAccess().getRegisteredItemsAssignment(), "rule__DomainRegistry__RegisteredItemsAssignment");
					put(grammarAccess.getDataModelAccess().getNameAssignment_1(), "rule__DataModel__NameAssignment_1");
					put(grammarAccess.getDataModelAccess().getStatusAssignment_3(), "rule__DataModel__StatusAssignment_3");
					put(grammarAccess.getDataModelAccess().getGuidAssignment_5(), "rule__DataModel__GuidAssignment_5");
					put(grammarAccess.getDataModelAccess().getRefinesAssignment_10(), "rule__DataModel__RefinesAssignment_10");
					put(grammarAccess.getDataModelAccess().getElementsAssignment_12(), "rule__DataModel__ElementsAssignment_12");
					put(grammarAccess.getDataModelAccess().getRelationsAssignment_13(), "rule__DataModel__RelationsAssignment_13");
					put(grammarAccess.getDataModelAccess().getConstraintAssignment_14(), "rule__DataModel__ConstraintAssignment_14");
					put(grammarAccess.getDataModelAccess().getPredicateAssignment_15(), "rule__DataModel__PredicateAssignment_15");
					put(grammarAccess.getDataItemAccess().getDataitemAssignment(), "rule__DataItem__DataitemAssignment");
					put(grammarAccess.getReferenceAccess().getNameAssignment_1(), "rule__Reference__NameAssignment_1");
					put(grammarAccess.getReferenceAccess().getTypeAssignment_3(), "rule__Reference__TypeAssignment_3");
					put(grammarAccess.getRelationshipAccess().getSrcAssignment_1_0(), "rule__Relationship__SrcAssignment_1_0");
					put(grammarAccess.getRelationshipAccess().getDestAssignment_1_2(), "rule__Relationship__DestAssignment_1_2");
					put(grammarAccess.getExtensionItemAccess().getKeyAssignment_1(), "rule__ExtensionItem__KeyAssignment_1");
					put(grammarAccess.getExtensionItemAccess().getValueAssignment_3(), "rule__ExtensionItem__ValueAssignment_3");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getEnumeratedTypeAccess().getStatusAssignment_2(), "rule__EnumeratedType__StatusAssignment_2");
					put(grammarAccess.getEnumeratedTypeAccess().getGuidAssignment_4(), "rule__EnumeratedType__GuidAssignment_4");
					put(grammarAccess.getEnumeratedTypeAccess().getRefinesAssignment_9(), "rule__EnumeratedType__RefinesAssignment_9");
					put(grammarAccess.getEnumeratedTypeAccess().getNameAssignment_10(), "rule__EnumeratedType__NameAssignment_10");
					put(grammarAccess.getEnumeratedTypeAccess().getTypeAssignment_12(), "rule__EnumeratedType__TypeAssignment_12");
					put(grammarAccess.getEnumeratedTypeAccess().getArrayAssignment_13_0(), "rule__EnumeratedType__ArrayAssignment_13_0");
					put(grammarAccess.getEnumeratedTypeAccess().getLengthAssignment_13_1(), "rule__EnumeratedType__LengthAssignment_13_1");
					put(grammarAccess.getReferenceTypeAccess().getStatusAssignment_2(), "rule__ReferenceType__StatusAssignment_2");
					put(grammarAccess.getReferenceTypeAccess().getGuidAssignment_4(), "rule__ReferenceType__GuidAssignment_4");
					put(grammarAccess.getReferenceTypeAccess().getRefinesAssignment_9(), "rule__ReferenceType__RefinesAssignment_9");
					put(grammarAccess.getReferenceTypeAccess().getNameAssignment_10(), "rule__ReferenceType__NameAssignment_10");
					put(grammarAccess.getReferenceTypeAccess().getTypeAssignment_12(), "rule__ReferenceType__TypeAssignment_12");
					put(grammarAccess.getPrimitiveTypeAccess().getStatusAssignment_1_2(), "rule__PrimitiveType__StatusAssignment_1_2");
					put(grammarAccess.getPrimitiveTypeAccess().getGuidAssignment_1_4(), "rule__PrimitiveType__GuidAssignment_1_4");
					put(grammarAccess.getPrimitiveTypeAccess().getRefinesAssignment_1_9(), "rule__PrimitiveType__RefinesAssignment_1_9");
					put(grammarAccess.getPrimitiveTypeAccess().getNameAssignment_1_10(), "rule__PrimitiveType__NameAssignment_1_10");
					put(grammarAccess.getPrimitiveTypeAccess().getTypeAssignment_1_12(), "rule__PrimitiveType__TypeAssignment_1_12");
					put(grammarAccess.getPrimitiveTypeAccess().getRuleAssignment_1_13(), "rule__PrimitiveType__RuleAssignment_1_13");
					put(grammarAccess.getBasicAccess().getTypenameAssignment(), "rule__Basic__TypenameAssignment");
					put(grammarAccess.getDataClassAccess().getStatusAssignment_2(), "rule__DataClass__StatusAssignment_2");
					put(grammarAccess.getDataClassAccess().getGuidAssignment_4(), "rule__DataClass__GuidAssignment_4");
					put(grammarAccess.getDataClassAccess().getRefinesAssignment_9(), "rule__DataClass__RefinesAssignment_9");
					put(grammarAccess.getDataClassAccess().getNameAssignment_10(), "rule__DataClass__NameAssignment_10");
					put(grammarAccess.getDataClassAccess().getDataelementsAssignment_12(), "rule__DataClass__DataelementsAssignment_12");
					put(grammarAccess.getDataClassAccess().getExtensionAssignment_13(), "rule__DataClass__ExtensionAssignment_13");
					put(grammarAccess.getDataElementAccess().getStatusAssignment_2(), "rule__DataElement__StatusAssignment_2");
					put(grammarAccess.getDataElementAccess().getGuidAssignment_4(), "rule__DataElement__GuidAssignment_4");
					put(grammarAccess.getDataElementAccess().getRefinesAssignment_9(), "rule__DataElement__RefinesAssignment_9");
					put(grammarAccess.getDataElementAccess().getNameAssignment_10(), "rule__DataElement__NameAssignment_10");
					put(grammarAccess.getDataElementAccess().getTypeAssignment_12(), "rule__DataElement__TypeAssignment_12");
					put(grammarAccess.getConstraintAccess().getNameAssignment_2(), "rule__Constraint__NameAssignment_2");
					put(grammarAccess.getConstraintAccess().getSrcAssignment_4_0_0(), "rule__Constraint__SrcAssignment_4_0_0");
					put(grammarAccess.getConstraintAccess().getPredAssignment_4_1(), "rule__Constraint__PredAssignment_4_1");
					put(grammarAccess.getConstraintAccess().getDestAssignment_4_2_1(), "rule__Constraint__DestAssignment_4_2_1");
					put(grammarAccess.getPredicateAccess().getNameAssignment_1(), "rule__Predicate__NameAssignment_1");
					put(grammarAccess.getPredicateAccess().getPredicateAssignment_3(), "rule__Predicate__PredicateAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MDMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MDMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}