# e-bank Backend Development

## Contexte du Projet

Vous êtes développeur junior au sein du service informatique de l'enseigne bancaire Bank Solutions. Jusqu'à présent, cette banque se concentrait principalement sur la fourniture de services bancaires sur site. Votre manager vous a confié la tâche de développer la partie back-end de l'application e-bank. Cette application vise à offrir une plateforme sécurisée et intuitive permettant aux utilisateurs de gérer leurs comptes bancaires et d'effectuer des opérations financières en ligne.

## User Stories

### Gestion des Comptes

#### Création de Comptes Bancaires
En tant qu'utilisateur, je veux pouvoir créer un nouveau compte bancaire (courant, épargne, etc.) pour gérer mes finances.
- Type de compte (Courant, Épargne, etc.)
- Solde initial
- Date de création

#### Consultation des Soldes et Historiques de Transactions
En tant qu'utilisateur, je veux consulter le solde et l'historique des transactions de mes comptes pour suivre mes dépenses et revenus.
- ID de la transaction
- Date et heure
- Montant
- Type de transaction (Crédit, Débit)
- Description

#### Fermeture de Comptes
En tant qu'utilisateur, je veux pouvoir fermer un compte bancaire pour ne plus l'utiliser, en indiquant la raison de la fermeture.

### Gestion des Cartes Bancaires

#### Consultation des Informations de la Carte
En tant qu'utilisateur, je veux pouvoir consulter les informations de ma carte bancaire (numéro, date d'expiration) pour connaître les détails de ma carte.
- Numéro de carte
- Date d'expiration
- Type de carte (Débit, Crédit)

#### Activation et Désactivation de la Carte
En tant qu'utilisateur, je veux pouvoir activer ou désactiver ma carte bancaire pour sécuriser mes transactions.

#### Blocage en Cas de Perte ou de Vol
En tant qu'utilisateur, je veux pouvoir bloquer ma carte bancaire en cas de perte ou de vol pour éviter une utilisation frauduleuse, en indiquant la raison du blocage.

### Transferts d'Argent

#### Transferts Internes entre Comptes du Même Utilisateur
En tant qu'utilisateur, je veux pouvoir transférer de l'argent entre mes propres comptes pour gérer mes fonds, en indiquant le montant et la description.

#### Transferts Externes vers des Comptes dans d'Autres Banques
En tant qu'utilisateur, je veux pouvoir transférer de l'argent vers des comptes externes pour effectuer des paiements ou envoyer de l'argent, en indiquant les détails du compte externe (numéro de compte, banque, etc.), le montant et la description.

#### Gestion des Bénéficiaires
En tant qu'utilisateur, je veux pouvoir ajouter, modifier ou supprimer des bénéficiaires pour faciliter mes transferts externes, en indiquant son nom et ses détails de compte (numéro de compte, banque, etc.).

## Exigences Techniques

### Structuration du Projet
La structure du projet doit suivre les bonnes pratiques recommandées pour une application Spring Boot.

### Documentation du Code
Description des responsabilités de chaque classe et méthode, ainsi que des détails sur les paramètres et les valeurs de retour.

### Logique Métier des Opérations Bancaires
- Validation des données lors de la création et de la fermeture des comptes (ex: solde suffisant avant la fermeture).
- Gestion des exceptions pour les opérations illégales (ex: tentative de transfert à partir d'un compte fermé).
- Validation des montants avant les transferts (ex: montant positif, solde suffisant).
