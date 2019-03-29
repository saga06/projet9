/**
 Fichier qui va contenir plusieurs valeurs constantes utilisables dans toute l'application (plus simple pour entretenir)
 - configURLApi : contient toutes les URLs de l'api
 - configSessionItems : contient tous les noms des items de session

 La création d'un ensemble de constantes se fait de deux façons :

 - POUR ATTRIBUTIONS COMPLEXES : on créé une classe qui possède tous les attributs puis le constructeur
 qui attribut toutes les valeurs ; ensuite on créé une const auquelle sa valeur
 sera égale à une nouvelle instance de la classe. Seule la constante est exportée !
 - POUR ATTRIBTIONS STATIQUES : on créé simplement une const avec en signature
 un objet anonyme.
 */

/**
 * Classe de config pour const configURLApi : ConfigURLApi.
 * La documentation globale est présente sur la constante.
 * La documentation des attributs est présente dans la classe.
 */
class ConfigURLApi {
  /**
   * Déclaration des url
   */
    // Gateway root
  restServiceRoot: string;
  // Microservices's root
  userRoot: string;
  consultationRoot: string;
  orderRoot: string;
  commentRoot: string;
  // Adventures
  allAdventures: string;
  allAdventuresByCategory: (category_id: string) => string;
  adventure: (adventure_id: string) => string;
  // Categories
  allCategories: string;
  categoryById: (category_id: string) => string;
  adventuresByCategory: (category_id: string) => string;
  // Comments
  comments: (comment_id: string) => string;
  commentsByAdventure: (aventure_id: string) => string;
  createComment: string;
  // Orders
  ordersByUser: (user_id: string) => string;
  createOrder: string;
  // User
  userById: (username: string) => string;
  createUser: string;
  login: string;

  constructor() {
    // Adresse de Zuul
    this.restServiceRoot = `http://localhost:9004`;
    // Adresse des différents microservice
    this.consultationRoot = `http://localhost:8081`;
    this.orderRoot = `http://localhost:8082`;
    this.commentRoot = `http://localhost:8083`;
    this.userRoot = `http://localhost:8080`;
    // Adventure
    this.allAdventures = `${this.consultationRoot}/adventures`;
    this.adventure = ((adventure_id: string) => `${this.consultationRoot}/adventures/${adventure_id}`);
    this.allAdventuresByCategory = ((category_id => `${this.consultationRoot}/categories/${category_id}/adventures`));
    // Category
    this.allCategories =  `${this.consultationRoot}/categories`;
    this.adventuresByCategory = ((category_id: string) => `${this.consultationRoot}/categories/${category_id}/adventures`);
    this.categoryById = ((category_id: string) => `${this.consultationRoot}/categories/${category_id}`);
    // Comment
    this.comments = ((comment_id: string) => `${this.commentRoot}/${comment_id}`);
    this.commentsByAdventure = ((adventure_id: string) => `${this.commentRoot}/comments/adventure/${adventure_id}`);
    this.createComment = `${this.commentRoot}/create_comment`;
    // Order
    this.ordersByUser = ((user_id: string) => `${this.orderRoot}/order_for_user/${user_id}`);
    this.createOrder = `${this.orderRoot}/do_order`;
    // User
    this.userById = ((username: string) => `${this.userRoot}/api/user/${username}`);
    this.createUser = `${this.userRoot}/create_user`;
    this.login = `${this.userRoot}/login`;
  }
}

export const configURLApi: ConfigURLApi = new ConfigURLApi();

export const configSessionItems: {
  /**
   * Booléen qui définit si oui ou non
   * un utilisateur est connecté.
   */
  userConnected: string,
  /**
   * Id de l'utilisateur
   * actuellement connecté.
   */
  currentUserConnected: string
} = {
  userConnected: 'userConnected',
  currentUserConnected: 'currentUserConnected'
};
